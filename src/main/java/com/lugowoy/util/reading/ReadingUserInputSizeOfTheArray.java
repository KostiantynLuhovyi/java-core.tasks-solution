package com.lugowoy.util.reading;

/** Created by Konstantin Lugowoy on 24.06.2017. */

public class ReadingUserInputSizeOfTheArray {

    private static ReadingUserInputData readingUserInputData = new ReadingUserInputData();

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
