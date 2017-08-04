package com.lugowoy.tasks.oop.calculationOfTheAmountOfPaintNeededToPaintTheRoom;

import com.lugowoy.helper.reading.Reader;
import com.lugowoy.helper.reading.ReadingDataUserInputInConsole;
import com.lugowoy.tasks.oop.calculationOfTheAmountOfPaintNeededToPaintTheRoom.calculation.area.*;
import com.lugowoy.tasks.oop.calculationOfTheAmountOfPaintNeededToPaintTheRoom.calculation.expense.CalculableExpensePaintForTheRoom;
import com.lugowoy.tasks.oop.calculationOfTheAmountOfPaintNeededToPaintTheRoom.calculation.expense.CalculatorExpensePaintForTheRoom;
import com.lugowoy.tasks.oop.calculationOfTheAmountOfPaintNeededToPaintTheRoom.determine.Determinable;
import com.lugowoy.tasks.oop.calculationOfTheAmountOfPaintNeededToPaintTheRoom.determine.DeterminantExpensesOfThePaintPerSquareMeterOfConcreteSurface;
import com.lugowoy.tasks.oop.calculationOfTheAmountOfPaintNeededToPaintTheRoom.factory.*;
import com.lugowoy.tasks.oop.calculationOfTheAmountOfPaintNeededToPaintTheRoom.models.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**Created by Konstantin Lugowoy on 17-Feb-17.*/

public class Main {

    private static Reader reader = new Reader(new ReadingDataUserInputInConsole());

    private static final Factory<Window> FACTORY_WINDOW = new FactoryWindow(reader)::createWindow;
    private static final Factory<Door> FACTORY_DOOR = new FactoryDoor(reader)::createDoor;
    private static final Factory<Room> FACTORY_ROOM = new FactoryRoom(reader)::createRoom;
    private static final Factory<Paint> FACTORY_PAINT = new FactoryPaint(reader)::createPaint;

    private static Determinable<BigDecimal, TypeOfSurface, TypeOfPaint> determineExpenseOfThePaintPerSquareMeterOfConcreteSurface
            = DeterminantExpensesOfThePaintPerSquareMeterOfConcreteSurface::determineExpenseOfThePaintPerSquareMeterOfConcreteSurface;

    public static void main(String[] args) {

        System.out.println("Fill in the data for the room.");
        Room room = FACTORY_ROOM.create();

        CalculatorForTheObjectArea<Room> calculatorForTheRoomArea = new CalculatorForTheRoomArea();
        calculatorForTheRoomArea.calculateArea(room);
        System.out.println("Total area of the room : " + room.getTotalAreaRoom() + "\u33A1 .");
        System.out.println();

        room.setTypeOfSurface(chooseWallSurfaceInTheRoom());

        System.out.println("Enter the number of windows in the room : ");
        int numberWindowInTheRoom = reader.readInt();
        System.out.println();

        room.setWindowListInTheFlat(getListOfWindowsInTheRoom(numberWindowInTheRoom));

        CalculableTotalAreaOfTheObjectInTheRoom<Window> calculatorForTheWindowsArea = new CalculatorForTheWindowsArea();
        room.setTotalAreaOfTheWindowsInTheRoom(calculatorForTheWindowsArea.calculateTotalAreaOfTheObjectInTheRoom(room));

        CalculablePercentOfTheAreaOfTheObjectsFromTheRoomArea calculablePercentOfTheAreaOfTheObjectsFromTheRoomArea
                = new CalculatorPercentOfTheAreaOfTheWindowsFromTheRoomArea();
        room.setPercentageOfTheAreaOfTheWindowsFromTheAreaRoom(calculablePercentOfTheAreaOfTheObjectsFromTheRoomArea.calculatePercentage(room));
        System.out.println("Total area of windows in the room : " + room.getTotalAreaOfTheWindowsInTheRoom() + "\u33A1 .");
        System.out.println("Percentage of windows in the room from the total area : " + room.getPercentageOfTheAreaOfTheWindowsFromTheAreaRoom().setScale(2, BigDecimal.ROUND_DOWN).doubleValue());
        System.out.println();

        System.out.println("Enter the number of door int the room : ");
        int numberDoorInTheRoom = reader.readInt();
        System.out.println();

        room.setDoorListInTheFlat(getListOfDoorInTheRoom(numberDoorInTheRoom));

        CalculableTotalAreaOfTheObjectInTheRoom<Door> calculatorForTheDoorsArea = new CalculatorForTheDoorsArea();
        room.setTotalAreaOfTheDoorsInTheRoom(calculatorForTheDoorsArea.calculateTotalAreaOfTheObjectInTheRoom(room));

        calculablePercentOfTheAreaOfTheObjectsFromTheRoomArea
                = new CalculatorPercentOfTheAreaOfTheDoorsFromTheRoomArea();
        room.setPercentageOfTheAreaOfTheDoorsFromTheAreaRoom(calculablePercentOfTheAreaOfTheObjectsFromTheRoomArea.calculatePercentage(room));

        System.out.println("Total area of doors in the room : " + room.getTotalAreaOfTheDoorsInTheRoom() + "\u33A1 .");
        System.out.println("Percentage of doors in the room from the total area : " + room.getPercentageOfTheAreaOfTheDoorsFromTheAreaRoom().setScale(2, BigDecimal.ROUND_DOWN).doubleValue());
        System.out.println();

        room.setAreaRoomWithoutAreaDoorsAndWindows((room.getTotalAreaRoom()
                                                                    .subtract(room.getTotalAreaOfTheWindowsInTheRoom())
                                                                    .subtract(room.getTotalAreaOfTheDoorsInTheRoom())));
        System.out.println("Area of the room without windows and doors : " + room.getAreaRoomWithoutAreaDoorsAndWindows());
        System.out.println();

        Paint paint = FACTORY_PAINT.create();

        paint.setExpenseOfThePaintPerSquareMeter(determineExpenseOfThePaintPerSquareMeterOfConcreteSurface
                                                            .determine(room.getTypeOfSurface(), paint.getTypeOfPaint()));

        CalculableExpensePaintForTheRoom calculableExpensePaintForTheRoom = new CalculatorExpensePaintForTheRoom();
        BigDecimal amountOfPaintNeededToPaintTheRoom = calculableExpensePaintForTheRoom.calculateExpensePaintForTheRoom(room, paint);

        System.out.println("The amount of paint needed to paint the room : " + amountOfPaintNeededToPaintTheRoom.setScale(2, BigDecimal.ROUND_DOWN));

        BigDecimal totalCostOfPaintForTheRoom = amountOfPaintNeededToPaintTheRoom.multiply(paint.getPricePerLiter());
        System.out.println("Total cost of paint for the room : " + totalCostOfPaintForTheRoom.setScale(2, BigDecimal.ROUND_DOWN));
    }

    private static List<Window> getListOfWindowsInTheRoom(int numberWindowInTheRoom) {
        ArrayList<Window> windowArrayList = new ArrayList<>(numberWindowInTheRoom);
        for (int i = 0; i < numberWindowInTheRoom; i++) {

            int numberWindow = i;
            numberWindow++;

            System.out.println("Fill in the data for the " + numberWindow + " window.");
            windowArrayList.add(FACTORY_WINDOW.create());
        }
        return windowArrayList;
    }

    private static List<Door> getListOfDoorInTheRoom(int numberDoorInTheRoom) {
        ArrayList<Door> doorArrayList = new ArrayList<>(numberDoorInTheRoom);
        for (int i = 0; i < numberDoorInTheRoom; i++) {

            int numberDoor = i;
            numberDoor++;

            System.out.println("Fill in the data for the " + numberDoor + " door.");
            doorArrayList.add(FACTORY_DOOR.create());
        }
        return doorArrayList;
    }

    private static TypeOfSurface chooseWallSurfaceInTheRoom() {
        TypeOfSurface resultTypeOfSurface = null;
        System.out.println("Choose a wall surface in the room : ");
        System.out.println("METAL : 1; \n" +
                           "SMOOTH : 2; \n" +
                           "WOOD : 3; \n" +
                           "PLASTER : 4; \n" +
                           "GYPSUM PLASTERBOARD : 5;");

        int chooseResult = reader.readInt();
        if ((chooseResult >= 1) && (chooseResult <= 5)) {
            resultTypeOfSurface = determinationOfTheResultTheWallSurface(chooseResult);
            System.out.println("You choosed : " + resultTypeOfSurface.toString());
            System.out.println();
        } else {
            System.out.println("Wrong choice. Repeat the selection.");
            chooseWallSurfaceInTheRoom();
        }
        return resultTypeOfSurface;
    }

    private static TypeOfSurface determinationOfTheResultTheWallSurface(int chooseResult) {
        TypeOfSurface resultTypeOfSurface = null;
        switch (chooseResult) {
            case 1: resultTypeOfSurface = TypeOfSurface.TYPE_METAL_SURFACE; break;
            case 2: resultTypeOfSurface = TypeOfSurface.TYPE_SMOOTH_SURFACE; break;
            case 3: resultTypeOfSurface = TypeOfSurface.TYPE_WOOD_SURFACE; break;
            case 4: resultTypeOfSurface = TypeOfSurface.TYPE_PLASTER_SURFACE; break;
            case 5: resultTypeOfSurface = TypeOfSurface.TYPE_GYPSUM_PLASTERBOARD_SURFACE; break;
        }
        return resultTypeOfSurface;
    }

}
