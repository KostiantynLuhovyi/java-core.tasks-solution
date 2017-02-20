package com.lugowoy.tasks.oop.calculationOfTheAmountOfPaintNeededToPaintTheRoom;

import com.lugowoy.util.reading.ReadingData;
import com.lugowoy.util.reading.ReadingUserInputData;
import com.sun.org.apache.xpath.internal.SourceTree;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**Created by Konstantin Lugowoy on 17-Feb-17.*/

public class Main {

    private static final ReadingUserInputData READING_DATA = new ReadingUserInputData();

    private static Factory<Window> windowFactory = () -> {
        System.out.println("Enter the width of the window : ");
        BigDecimal widthWindow = new BigDecimal(READING_DATA.readDouble());

        System.out.println("Enter the length of the window : ");
        BigDecimal lengthWindow = new BigDecimal(READING_DATA.readDouble());

        System.out.println("Enter the height of the window : ");
        BigDecimal heightWindow = new BigDecimal(READING_DATA.readDouble());

        System.out.println();

        return new Window(widthWindow, lengthWindow, heightWindow);
    };

    private static Factory<Room> roomFactory = () -> {
        System.out.println("Enter the width of the room : ");
        BigDecimal widthRoom = new BigDecimal(READING_DATA.readDouble());

        System.out.println("Enter the length of the room : ");
        BigDecimal lengthRoom = new BigDecimal(READING_DATA.readDouble());

        System.out.println("Enter the height of the room : ");
        BigDecimal heightRoom = new BigDecimal(READING_DATA.readDouble());

        System.out.println();

        return new Room(widthRoom, lengthRoom, heightRoom);
    };

    Determinable<BigDecimal, TypeOfSurface, TypeOfPaint> determineExpenseOfPaintForToTheSurface
            = DeterminantExpensesOfPaintForToTheSurface::determineExpenseOfPaintOnTheSurface;

    public static void main(String[] args) {

        System.out.println("Fill in the data for the room.");
        Room room = roomFactory.create();

        System.out.println("Enter the number of windows in the room : ");
        int numberWindowInTheRoom = READING_DATA.readInt();
        System.out.println();

        room.setWindowListInTheFlat(getListOfWindowsInTheRoom(numberWindowInTheRoom));

        room.getWindowListInTheFlat().forEach(System.out::println);


    }

    private static List<Window> getListOfWindowsInTheRoom(int numberWindowInTheRoom) {
        ArrayList<Window> windowArrayList = new ArrayList<>(numberWindowInTheRoom);
        for (int i = 0; i < numberWindowInTheRoom; i++) {
            System.out.println("Fill in the data for the window.");
            windowArrayList.add(windowFactory.create());
        }
        return windowArrayList;
    }


}
