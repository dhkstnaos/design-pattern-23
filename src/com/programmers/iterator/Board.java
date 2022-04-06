package com.programmers.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Board {
    List<Post> posts = new ArrayList<>();
    public void addPost(String content) {
        this.posts.add(new Post(content));
    }

    public Iterator<Post> getRecentIterator() {
        return new RecentPostIterator(this.posts);
    }
}
