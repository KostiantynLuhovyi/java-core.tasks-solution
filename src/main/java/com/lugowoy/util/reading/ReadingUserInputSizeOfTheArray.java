package com.lugowoy.util.reading;

/**
 * Created by Konstantin Lugowoy on 24.06.2017.
 *
 * @author Konstantin Lugowoy
 * @version 1.0
 * @since 1.0
 *
 * <p>
 * This class allows the user to enter data about the dimension of the array.
 * The class contains a functional in a static context.
 * </p>
 */
public class ReadingUserInputSizeOfTheArray {

    /**
     * <p>
     * A class attribute that performs the functionality of reading user input.
     * @see com.lugowoy.util.reading.ReadingUserInputData
     * </p>
     * */
    private static ReadingUserInputData readingUserInputData = new ReadingUserInputData();

    /**
     * <p>
     * A method that performs reading of data entered by the user about the dimension of the array.
     * </p>
     * @return Dimension of the array.
     * @since 1.0
     * */
    public static int enterUserInputForSizeOfTheArray() {
        int sizeArray;

        System.out.println("Enter a value for the size of the array : ");
        while (true) {
            sizeArray = readingUserInputData.readInt();
            if (sizeArray >= 2) {
                break;
            } else {
                System.out.println("Not correct of size array. Re-enter : ");
            }
        }
        return sizeArray;

    }

    /**
     * <p>
     * A method that performs reading of data entered by the user about the dimension of the array.
     * </p>
     * @param msg - Message displayed to the user before entering data.
     * @return Dimension of the array.
     * @since 1.0
     * */
    public static int enterUserInputForSizeOfTheArray(String msg) {
        int sizeArray;

        System.out.println(msg);
        while (true) {
            sizeArray = readingUserInputData.readInt();
            if (sizeArray >= 2) {
                break;
            } else {
                System.out.println("Not correct of size array. Re-enter : ");
            }
        }
        return sizeArray;

    }

    /**
     * <p>
     * A method that performs reading of data entered by the user about the dimension of the array.
     * </p>
     * @param msg - Message displayed to the user before entering data.
     * @param incorrectMsg  - Message displayed to the user in case of incorrectly entered data.
     * @return Dimension of the array.
     * @since 1.0
     * */
    static int enterUserInputForSizeOfTheArray(String msg, String incorrectMsg) {
        int sizeArray;

        System.out.println(msg);
        while (true) {
            sizeArray = readingUserInputData.readInt();
            if (sizeArray >= 2) {
                break;
            } else {
                System.out.println(incorrectMsg);
            }
        }
        return sizeArray;

    }

}
