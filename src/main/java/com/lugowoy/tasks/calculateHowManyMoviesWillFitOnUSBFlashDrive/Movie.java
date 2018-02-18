package com.lugowoy.tasks.calculateHowManyMoviesWillFitOnUSBFlashDrive;

import java.io.Serializable;

/** Created by Konstantin Lugowoy on 16.06.2017. */

public class Movie implements Cloneable, Serializable {

    private String nameMovie;
    private double sizeMovie;

    public Movie() {
    }

    public Movie(String nameMovie, double sizeMovie) throws IllegalArgumentException {
        try {
            if (checkNameOfMovie(nameMovie)) {
                this.nameMovie = nameMovie;
                if (checkSizeMovie(sizeMovie)) {
                    this.sizeMovie = sizeMovie;
                }
            }
        } catch (IllegalArgumentException ex) {
            System.err.println(ex.getMessage());
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Movie)) return false;

        Movie movie = (Movie) o;

        if (Double.compare(movie.sizeMovie, sizeMovie) != 0) return false;
        return nameMovie != null ? nameMovie.equals(movie.nameMovie) : movie.nameMovie == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = nameMovie != null ? nameMovie.hashCode() : 0;
        temp = Double.doubleToLongBits(sizeMovie);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Movie[" +
                "nameMovie='" + nameMovie + '\'' +
                ", sizeMovie=" + sizeMovie +
                ']';
    }

    @Override
    protected Movie clone() throws CloneNotSupportedException {
        Movie movie = (Movie) super.clone();
        movie.setNameMovie(this.getNameMovie());
        movie.setSizeMovie(this.getSizeMovie());
        return movie;
    }

    public String getNameMovie() {
        return nameMovie;
    }

    public void setNameMovie(String nameMovie) {
        try {
            if (checkNameOfMovie(nameMovie)) {
                this.nameMovie = nameMovie;
            }
        } catch (IllegalArgumentException ex) {
            System.err.println(ex.getMessage());
        }
    }

    public double getSizeMovie() {
        return sizeMovie;
    }

    public void setSizeMovie(double sizeMovie) throws IllegalArgumentException {
        try {
            if (checkSizeMovie(sizeMovie)) {
                this.sizeMovie = sizeMovie;
            }
        } catch (IllegalArgumentException ex) {
            System.err.println(ex.getMessage());
        }
    }

    private boolean checkNameOfMovie(String nameMovie) throws IllegalArgumentException {
        if ((nameMovie != null) && (!nameMovie.equals(""))) {
            return true;
        } else {
            throw new IllegalArgumentException("The name of the movie passed by the argument is null or an empty string.");
        }
    }

    private boolean checkSizeMovie(double sizeMovie) {
        if (sizeMovie > 0) {
            return true;
        } else {
            throw new IllegalArgumentException("The size of the movie passed by the argument is less than or equal to 0.");
        }
    }

}
