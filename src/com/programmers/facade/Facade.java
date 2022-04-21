package com.programmers.facade;

public class Facade {

    private String beverage;
    private String movie;
    private String theater;

    public Facade(String beverage, String movie, String theater) {
        this.beverage = beverage;
        this.movie = movie;
        this.theater = theater;
    }

    public void view_Movie() {
        Theater theater = new Theater(this.theater);
        Remote_Control remote = new Remote_Control();
        Movie movie = new Movie(this.movie);
        theater.openDoor();
        new Beverage(this.beverage).prepare();
        remote.turnOn();
        movie.searchMovie();
        movie.changeMovie();
        movie.playMovie();
        remote.turnOff();
        theater.closeDoor();
    }
}
