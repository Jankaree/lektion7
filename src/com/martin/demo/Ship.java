package com.martin.demo;

public class Ship implements Vehicle{
    @Override
    public void hasWheels() {
        System.out.println("no wheels here");
    }

    @Override
    public void sound() {
        System.out.println("shuushshuesh");
    }
}
