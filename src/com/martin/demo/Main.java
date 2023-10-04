package com.martin.demo;

public class Main {
    public static void main(String[] args) {

        Ford car = new Ford();
        car.hasWheels();
        car.sound();

        car.transport();

        Ship boat = new Ship();
        boat.transport();

        Dog kalle = new Dog();
        kalle.animalSound();
        kalle.sleep();
    }
}
