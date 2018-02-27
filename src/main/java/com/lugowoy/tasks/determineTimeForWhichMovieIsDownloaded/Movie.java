package com.lugowoy.tasks.determineTimeForWhichMovieIsDownloaded;

import java.io.Serializable;

/** Created by Konstantin Lugowoy on 16.06.2017. */

public class Movie implements Cloneable, Serializable {

    private long idMovie;
    private String nameMovie;
    private double sizeMovieInGb;

    public Movie() {
    }

    public Movie(long idMovie, String nameMovie, double sizeMovieInGb) {
        this.idMovie = idMovie;
        this.nameMovie = nameMovie;
        this.sizeMovieInGb = sizeMovieInGb;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Movie)) return false;

        Movie movie = (Movie) o;

        if (idMovie != movie.idMovie) return false;
        if (Double.compare(movie.sizeMovieInGb, sizeMovieInGb) != 0) return false;
        return nameMovie != null ? nameMovie.equals(movie.nameMovie) : movie.nameMovie == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = (int) (idMovie ^ (idMovie >>> 32));
        result = 31 * result + (nameMovie != null ? nameMovie.hashCode() : 0);
        temp = Double.doubleToLongBits(sizeMovieInGb);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Film[" +
                "idMovie=" + idMovie +
                ", nameMovie='" + nameMovie + '\'' +
                ", sizeMovieInGb=" + sizeMovieInGb +
                ']';
    }

    @Override
    protected Movie clone() throws CloneNotSupportedException {
        Movie movie = (Movie) super.clone();
        movie.setIdMovie(this.getIdMovie());
        movie.setNameMovie(this.nameMovie);
        movie.setSizeMovieInGb(this.getSizeMovieInGb());
        return movie;
    }

    public long getIdMovie() {
        return idMovie;
    }

    public void setIdMovie(long idMovie) {
        this.idMovie = idMovie;
    }

    public String getNameMovie() {
        return nameMovie;
    }

    public void setNameMovie(String nameMovie) {
        this.nameMovie = nameMovie;
    }

    public double getSizeMovieInGb() {
        return sizeMovieInGb;
    }

    public void setSizeMovieInGb(double sizeMovieInGb) {
        this.sizeMovieInGb = sizeMovieInGb;
    }

}
