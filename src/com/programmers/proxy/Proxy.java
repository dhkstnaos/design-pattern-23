package com.programmers.proxy;

public class Proxy {
    public static void main(String[] args) {
        Movie movie1 = new Proxy_Movie("영화: 명량");
        Movie movie2 = new Proxy_Movie("영화: 스파이더맨");

        movie1.displayStory();
        System.out.println();
        movie2.displayStory();
    }
}
