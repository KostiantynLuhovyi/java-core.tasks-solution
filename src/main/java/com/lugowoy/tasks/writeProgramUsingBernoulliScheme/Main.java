package com.lugowoy.tasks.writeProgramUsingBernoulliScheme;

import com.lugowoy.helper.reading.Reader;
import com.lugowoy.helper.reading.ReadingDataUserInputInConsole;

/** Created by Konstantin Lugowoy on 18.11.2017. */

public class Main {

    private static final Reader READER = new Reader(new ReadingDataUserInputInConsole());

    public static void main(String[] args) {

        System.out.println("Enter the number of tests : ");
        int numberOfTests = READER.readInt();

        System.out.println("Enter the value of success : ");
        double valueOfSuccess = READER.readDouble();

        SchemeBernoulli scheme = new SchemeBernoulli();
        scheme.setParamToScheme(numberOfTests, valueOfSuccess);
        scheme.testing();
        scheme.showResult();

    }

}
