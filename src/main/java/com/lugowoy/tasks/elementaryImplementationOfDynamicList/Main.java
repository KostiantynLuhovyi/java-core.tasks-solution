package com.lugowoy.tasks.elementaryImplementationOfDynamicList;

import com.lugowoy.helper.reading.Reader;
import com.lugowoy.helper.reading.ReadingDataUserInputInConsole;

/** Created by Konstantin Lugowoy on 18.11.2017. */

public class Main {

    private static final Reader READER = new Reader(new ReadingDataUserInputInConsole());

    public static void main(String[] args) {

        System.out.println("Enter the size of dynamic list : ");
        int size = READER.readInt();

        DynamicList dynamicList = new DynamicList();
        dynamicList.create(size);

        System.out.println("Elements of the dynamic list : ");
        int index = 0;
        do {
            System.out.println(dynamicList.getElement(index));
            index++;
        } while (index <= size);

    }

}
