package com.lugowoy.tasks.core.convertingDegreesTemperatures;

/**
 * Created by Konstantin Lugowoy on 11-Jan-17.
 * @author Konstantin Lugowoy
 * @version 1.0
 * @since 11.01.2017
 * Class encapsulates information about the temperature to which it corresponds to a temperature scale.
 */
public class Temperature {
    /**
     * Temperature value.
     * */
    private double degreesTemperatures;
    /**
     * Temperature scale.
     * */
    private TemperatureScale scale;

    /**
     * Default constructor.
     * */
    public Temperature() {
    }
    /**
     * Constructor to initialize attributes {@link Temperature#degreesTemperatures} and {@link Temperature#scale}
     * */
    public Temperature(double degreesTemperatures, TemperatureScale scale) {
        this.degreesTemperatures = degreesTemperatures;
        this.scale = scale;
    }

    /**
     * Get temperature value.
     * */
    public double getDegreesTemperatures() {
        return degreesTemperatures;
    }

    /**
     * Set temperature value.
     * */
    public void setDegreesTemperatures(double degreesTemperatures) {
        this.degreesTemperatures = degreesTemperatures;
    }

    /**
     * Get temperature scale.
     * */
    public TemperatureScale getScale() {
        return scale;
    }

    /**
     * Set temperature scale.
     * */
    public void setScale(TemperatureScale scale) {
        this.scale = scale;
    }
}
