package com.programmers.facade;

public class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public void searchMovie() {
        System.out.println(name + " 영화를 찾다");
    }

    public void changeMovie() {
        System.out.println("영화를 결제하다");
    }

    public void playMovie() {
        System.out.println("영화 재생");
    }
}
