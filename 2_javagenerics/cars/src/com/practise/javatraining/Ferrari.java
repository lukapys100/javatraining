package com.practise.javatraining;

public class Ferrari extends Car {

    private int speed;

    public Ferrari(String model) {
        super("Ferrari", model);
    }

    @Override
    public void speedUp() {
        this.speed+=20;
    }
}
