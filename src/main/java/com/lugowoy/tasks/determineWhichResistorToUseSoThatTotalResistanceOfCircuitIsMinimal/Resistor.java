package com.lugowoy.tasks.determineWhichResistorToUseSoThatTotalResistanceOfCircuitIsMinimal;

import java.io.Serializable;
import java.util.Objects;

/** Created by Konstantin Lugowoy on 10.11.2017. */

public class Resistor implements Serializable, Cloneable {

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Resistor)) return false;
        Resistor resistor = (Resistor) o;
        return Double.compare(resistor.getResistance(), getResistance()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getResistance());
    }

    @Override
    public String toString() {
        return "Resistor[" +
                "idResistor=" + idResistor +
                ", resistance=" + resistance +
                ']';
    }

    @Override
    public Resistor clone() throws CloneNotSupportedException {
        Resistor resistor = (Resistor) super.clone();
        resistor.setResistance(this.getResistance());
        return resistor;
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
