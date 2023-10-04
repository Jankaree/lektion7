package com.martin.demo;

public interface Vehicle {

    void hasWheels();
    void sound();

    default void transport() {
        System.out.println("Transporting");
    }
}
