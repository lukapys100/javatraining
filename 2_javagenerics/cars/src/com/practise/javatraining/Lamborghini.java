package com.practise.javatraining;

public class Lamborghini extends Car {

    private int speed;

    public Lamborghini(String model, int cost) {
        super("Lamborghini", model, cost);
    }

    @Override
    public void speedUp() {
        this.speed+=15;
    }
}
