package com.programmers.iterator;

import java.util.Iterator;

public class Client {
    public static void main(String[] args) {
        Board board = new Board();
        board.addPost("디자인 패턴 게임 시작");
        board.addPost("이터레이터 패턴 시작");
        board.addPost("이터레이터 패턴 종료");
        board.addPost("디자인 패턴 게임 종료");

        Iterator<Post> recentIterator = board.getRecentIterator();
        while(recentIterator.hasNext()) {
            System.out.println("recentIterator.next().getContent() = " + recentIterator.next().getContent());
        }
    }
}
