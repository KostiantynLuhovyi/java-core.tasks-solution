package com.lugowoy.tasks.core.printToWelcomeScreenCorrespondingToEnteredTime;

/** Created by Konstantin Lugowoy on 04.10.2017. */

public abstract class PrinterWelcome extends Printer {

    public PrinterWelcome() {
    }

    public PrinterWelcome(String printText) {
        super(printText);
    }

    @Override
    public abstract void print();

    @Override
    public String getPrintText() {
        return super.getPrintText();
    }

}
