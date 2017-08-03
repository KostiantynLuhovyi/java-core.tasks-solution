package com.lugowoy.tasks.core.calculateHowManyMoviesWillFitOnUSBFlashDrive;

import java.io.Serializable;

/** Created by Konstantin Lugowoy on 16.06.2017. */

public class FlashDriveUSB implements Cloneable, Serializable {

    private double sizeFlashDriveUSB;

    public FlashDriveUSB() {
    }

    public FlashDriveUSB(double sizeFlashDriveUSB) {
        this.sizeFlashDriveUSB = sizeFlashDriveUSB;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FlashDriveUSB)) return false;

        FlashDriveUSB that = (FlashDriveUSB) o;

        return Double.compare(that.sizeFlashDriveUSB, sizeFlashDriveUSB) == 0;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(sizeFlashDriveUSB);
        return (int) (temp ^ (temp >>> 32));
    }

    @Override
    public String toString() {
        return "FlashDriveUSB[" +
                "sizeFlashDriveUSB=" + sizeFlashDriveUSB +
                ']';
    }

    @Override
    public FlashDriveUSB clone() throws CloneNotSupportedException {
        FlashDriveUSB flashDriveUSB = (FlashDriveUSB) super.clone();
        flashDriveUSB.setSizeFlashDriveUSB(this.getSizeFlashDriveUSB());
        return flashDriveUSB;
    }

    public double getSizeFlashDriveUSB() {
        return sizeFlashDriveUSB;
    }

    public void setSizeFlashDriveUSB(double sizeFlashDriveUSB) {
        this.sizeFlashDriveUSB = sizeFlashDriveUSB;
    }

}
