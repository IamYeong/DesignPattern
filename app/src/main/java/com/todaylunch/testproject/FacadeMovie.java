package com.todaylunch.testproject;

public class FacadeMovie {

    private String movieName;

    public FacadeMovie(String movieName) {
        this.movieName = movieName;
    }

    public void searchMovie() {
        System.out.println("영화를 골랐다 : " + movieName);
    }

    public void chargeMovie() {
        System.out.println("영화결제");
    }

    public void playMovie() {
        System.out.println(movieName + "재생");

    }

}
