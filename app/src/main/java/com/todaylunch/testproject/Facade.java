package com.todaylunch.testproject;

public class Facade {

    private String movie, drink;

    public Facade(String movieName, String drinkName) {
        this.movie = movieName;
        this.drink = drinkName;
    }

    public void view() {

        FacadeMovie facadeMovie = new FacadeMovie(movie);
        FacadeBeverage facadeBeverage = new FacadeBeverage(drink);
        FacadeRemoteControl remoteControl = new FacadeRemoteControl();

        remoteControl.turnOn();
        facadeBeverage.drink();
        facadeMovie.searchMovie();
        facadeMovie.chargeMovie();
        facadeMovie.playMovie();
        remoteControl.turnOff();

    }


}
