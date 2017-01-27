package com.lugowoy.util.reading;

import java.util.Scanner;

/**
 * Created by Konstantin on 11.11.2016.
 */

/*Interface "ReadableUserInputData" announces contract to read data entered by the user to the console*/
public interface ReadableUserInputData extends ReadableData {
    /*
    * Instance of the class Scanner, for read of the data entered by user in the console.
    * */
    Scanner SCANNER = new Scanner(System.in);

    /*
    * Abstract method to read string line from the console.
    * */
    String readLine();
}
