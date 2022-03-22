package com.programmers.proxy;

import java.util.List;

/*
    mac에서 control+O하게 되면 자동 완성
 */
public class Real_Movie implements Movie {
    private String story;

    public Real_Movie(String story) {
        this.story=story;
        loadFromMemory();
    }

    private void loadFromMemory() {
        System.out.println("story = " + story);
    }

    @Override
    public void displayStory() {
        System.out.println("실제 정보: "+ story);
    }
}