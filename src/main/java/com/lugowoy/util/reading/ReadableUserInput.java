package com.lugowoy.util.reading;

import java.util.Scanner;

/**
 * Created by Konstantin on 11.11.2016.
 */

/*Interface "ReadableUserInput" announces contract to read data entered by the user to the console*/
interface ReadableUserInput extends Readable {
    /*
    * Instance of the class Scanner, for reading of the data entered by user in the console.
    * */
    Scanner SCANNER = new Scanner(System.in);

    /*
    * Abstract method to reading integer number from the console.
    * */
    int readInt();

    /*
    * Abstract method to reading double number from the console.
    * */
    double readDouble();

    /*
    * Abstract method to reading string line from the console.
    * */
    String readLine();

}
