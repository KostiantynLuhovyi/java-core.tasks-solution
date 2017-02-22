package com.lugowoy.tasks.oop.calculationOfTheAmountOfPaintNeededToPaintTheRoom;

import com.lugowoy.tasks.oop.calculationOfTheAmountOfPaintNeededToPaintTheRoom.determine.Determinable;
import com.lugowoy.tasks.oop.calculationOfTheAmountOfPaintNeededToPaintTheRoom.determine.DeterminantExpensesOfThePaintPerSquareMeterOfConcreteSurface;
import com.lugowoy.tasks.oop.calculationOfTheAmountOfPaintNeededToPaintTheRoom.factory.Factory;
import com.lugowoy.tasks.oop.calculationOfTheAmountOfPaintNeededToPaintTheRoom.factory.FactoryDoor;
import com.lugowoy.tasks.oop.calculationOfTheAmountOfPaintNeededToPaintTheRoom.factory.FactoryRoom;
import com.lugowoy.tasks.oop.calculationOfTheAmountOfPaintNeededToPaintTheRoom.factory.FactoryWindow;
import com.lugowoy.tasks.oop.calculationOfTheAmountOfPaintNeededToPaintTheRoom.models.*;
import com.lugowoy.util.reading.ReadingUserInputData;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**Created by Konstantin Lugowoy on 17-Feb-17.*/

public class Main {

    private static final ReadingUserInputData READING_DATA = new ReadingUserInputData();

    private static final Factory<Window> FACTORY_WINDOW = new FactoryWindow(READING_DATA::readDouble)::createWindow;
    private static final Factory<Door> FACTORY_DOOR = new FactoryDoor(READING_DATA::readDouble)::createDoor;
    private static final Factory<Room> FACTORY_ROOM = new FactoryRoom(READING_DATA::readDouble)::createRoom;

    private static Determinable<BigDecimal, TypeOfSurface, TypeOfPaint> determineExpenseOfThePaintPerSquareMeterOfConcreteSurface
            = DeterminantExpensesOfThePaintPerSquareMeterOfConcreteSurface::determineExpenseOfThePaintPerSquareMeterOfConcreteSurface;

    public static void main(String[] args) {

        System.out.println("Fill in the data for the room.");
        Room room = FACTORY_ROOM.create();

        System.out.println("Enter the number of windows in the room : ");
        int numberWindowInTheRoom = READING_DATA.readInt();
        System.out.println();

        room.setWindowListInTheFlat(getListOfWindowsInTheRoom(numberWindowInTheRoom));

        room.getWindowListInTheFlat().forEach(System.out::println);

        System.out.println("Enter the number of door int he room : ");
        int numberDoorInTheRoom = READING_DATA.readInt();
        System.out.println();

        room.setDoorListInTheFlat(getListOfDoorInTheRoom(numberDoorInTheRoom));

        room.getDoorListInTheFlat().forEach(System.out::println);
    }

    private static List<Window> getListOfWindowsInTheRoom(int numberWindowInTheRoom) {
        ArrayList<Window> windowArrayList = new ArrayList<>(numberWindowInTheRoom);
        for (int i = 0; i < numberWindowInTheRoom; i++) {
            System.out.println("Fill in the data for the window.");
            windowArrayList.add(FACTORY_WINDOW.create());
        }
        return windowArrayList;
    }

    private static List<Door> getListOfDoorInTheRoom(int numberDoorInTheRoom) {
        ArrayList<Door> doorArrayList = new ArrayList<>(numberDoorInTheRoom);
        for (int i = 0; i < numberDoorInTheRoom; i++) {
            System.out.println("Fill in the data for the door.");
            doorArrayList.add(FACTORY_DOOR.create());
        }
        return doorArrayList;
    }


}
