package com.practise.javatraining;

public class Lamborghini extends Car {

    private int speed;

    public Lamborghini(String model) {
        super("Lamborghini", model);
    }

    @Override
    public void speedUp() {
        this.speed+=15;
    }
}
