package com.lugowoy.util.reading;

import java.util.Scanner;

/**
 * Created by Konstantin on 11.11.2016.
 *
 * @author Konstantin
 * @version 1.1
 * @see com.lugowoy.util.reading.ReadableData
 * @since 1.0
 * <p>
 * Interface "ReadableUserInputData" announces contract to read data entered by the user to the console.
 * Inherits interface "ReadableData"
 */
interface ReadableUserInputData extends ReadableData {
    /*
    * Instance of the class Scanner, for read of the data entered by user in the console.
    * */
    Scanner SCANNER = new Scanner(System.in);

    /*
    * Abstract method to read string line from the console.
    * */
    String readLine();
}
