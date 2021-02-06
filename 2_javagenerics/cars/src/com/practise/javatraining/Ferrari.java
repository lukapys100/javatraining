package com.practise.javatraining;

public class Ferrari extends Car {

    private int speed;

    public Ferrari(String model, int cost) {
        super("Ferrari", model, cost);
    }

    @Override
    public void speedUp() {
        this.speed+=20;
    }
}
