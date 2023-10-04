package com.martin.demo;

public class Ford implements Vehicle{
    @Override
    public void hasWheels() {
        System.out.println("yes there are wheels");
    }

    @Override
    public void sound() {
        System.out.println("wroom");
    }
}
