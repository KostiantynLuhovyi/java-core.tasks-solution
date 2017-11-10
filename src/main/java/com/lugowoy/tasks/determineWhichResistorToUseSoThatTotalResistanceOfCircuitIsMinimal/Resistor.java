package com.lugowoy.tasks.determineWhichResistorToUseSoThatTotalResistanceOfCircuitIsMinimal;

/** Created by Konstantin Lugowoy on 10.11.2017. */

public class Resistor {

    private static int idResistor = 0;
    private double resistance;

    static {
        idResistor++;
    }

    public Resistor() {
    }

    public Resistor(double resistance) {
        this.resistance = resistance;
    }

    @Override
    public String toString() {
        return "Resistor[" +
                "idResistor=" + idResistor +
                ", resistance=" + resistance +
                ']';
    }

    public double getResistance() {
        return resistance;
    }

    public void setResistance(double resistance) {
        this.resistance = resistance;
    }

    public int getIdResistor() {
        return idResistor;
    }

}
