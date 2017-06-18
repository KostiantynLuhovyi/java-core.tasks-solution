package com.lugowoy.tasks.arrays.findSegmentOfArrayIsPolindrome;

import com.lugowoy.util.EnteringTheSizeOfTheArray;
import com.lugowoy.util.factory.creating.arrays.CreatorArray;
import com.lugowoy.util.factory.creating.arrays.CreatorArrayOfIntegerPrimitives;
import com.lugowoy.util.filling.arrays.FillingArray;
import com.lugowoy.util.filling.arrays.FillingArrayOfRandomNumber;
import com.lugowoy.util.models.arrays.Array;
import com.lugowoy.util.reading.ReadingData;
import com.lugowoy.util.reading.ReadingUserInputData;

import java.util.Arrays;
import java.util.Objects;

import static java.util.Arrays.copyOfRange;

/** Created by Konstantin Lugowoy on 18.06.2017. */

public class Main {

    private static ReadingData<Integer> readingData = new ReadingData<>(new ReadingUserInputData()::readInt);
    private static FillingArray<Integer> fillingArray = new FillingArrayOfRandomNumber<>();
    private static CreatorArray<Integer> creatorArray = new CreatorArrayOfIntegerPrimitives();

    private static EnteringTheSizeOfTheArray<Integer> enteringTheSizeOfTheArray = EnteringTheSizeOfTheArray::enterUserInputForSizeOfTheArray;

    public static void main(String[] args) {

        int sizeArray = enteringTheSizeOfTheArray.enter(readingData);

        Array<Integer> array = creatorArray.create(fillingArray.fillArray(new int[sizeArray], 50));

        System.out.println("Original " + array);

        getPalindromeAndLength(array);

    }

    private static void getPalindromeAndLength(Array<Integer> array) {
        int count = 1;

        for (int i = 0; i < count; i++) {
            boolean isPalindrome = false;
            if ((array.getArray().length - count + 1) == 1) {
                isPalindrome = true;
            } else {
                for (int j = 0; j < (array.getArray().length - count + 1) / 2; j++) {
                    if (Objects.equals(array.getArray()[i + j], array.getArray()[i + array.getArray().length - count - j])) {
                        if (j + 1 == (array.getArray().length - count + 1) / 2) {
                            isPalindrome = true;
                        }
                    } else {
                        break;
                    }
                }
            }
            if (isPalindrome) {
                Integer[] temp = copyOfRange(array.getArray(), i, array.getArray().length - count + i + 1);
                if (temp.length > 1) {
                    System.out.println(Arrays.toString(temp) + ", length is equal " + temp.length);
                    return;
                } else {
                    System.out.println();
                    System.out.println("In the array there is no segment that is a palindrome.");
                    return;
                }
            }
            if (i + 1 == count) {
                i = 0;
                count++;
            }
        }
    }

}
