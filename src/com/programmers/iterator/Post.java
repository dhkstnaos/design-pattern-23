package com.programmers.iterator;

import java.time.LocalDateTime;

public class Post {
    private String content;
    private LocalDateTime createdDateTime = LocalDateTime.now();

    public Post(String content) {
        this.content = content;
    }

    public LocalDateTime getCreatedDateTime() {
        return createdDateTime;
    }

    public String getContent() {
        return content;
    }
}
