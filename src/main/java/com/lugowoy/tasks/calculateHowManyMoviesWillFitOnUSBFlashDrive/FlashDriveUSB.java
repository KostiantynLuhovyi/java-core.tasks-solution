package com.lugowoy.tasks.calculateHowManyMoviesWillFitOnUSBFlashDrive;

import java.io.Serializable;

/** Created by Konstantin Lugowoy on 16.06.2017. */

public class FlashDriveUSB implements Cloneable, Serializable {

    private double sizeFlashDriveUSB;

    public FlashDriveUSB() {
    }

    public FlashDriveUSB(double sizeFlashDriveUSB) {
        try {
            if (checkSizeFlashDriveUSB(sizeFlashDriveUSB)) {
                this.sizeFlashDriveUSB = sizeFlashDriveUSB;
            }
        } catch (IllegalArgumentException ex) {
            System.err.println(ex.getMessage());
        }
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
        try {
            if (checkSizeFlashDriveUSB(sizeFlashDriveUSB)) {
                this.sizeFlashDriveUSB = sizeFlashDriveUSB;
            }
        } catch (IllegalArgumentException ex) {
            System.err.println(ex.getMessage());
        }
    }

    private boolean checkSizeFlashDriveUSB(double sizeFlashDriveUSB) throws IllegalArgumentException {
        if (sizeFlashDriveUSB > 0) {
            return true;
        } else {
            throw new IllegalArgumentException("The size of the flash drive USB passed by the argument is less than " +
                                                                                                      "or equal to 0.");
        }
    }

}
