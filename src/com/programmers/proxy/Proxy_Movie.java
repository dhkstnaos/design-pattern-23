package com.programmers.proxy;

public class Proxy_Movie implements Movie {
    private String story;
    private Real_Movie real_movie;

    public Proxy_Movie(String story) {
        this.story=story;
    }

    @Override
    public void displayStory() {
        //실제 객체가 비어 있다면 데이터 주입
        if(real_movie==null) {
            real_movie = new Real_Movie(story);
        }
        real_movie.displayStory();
    }
}
