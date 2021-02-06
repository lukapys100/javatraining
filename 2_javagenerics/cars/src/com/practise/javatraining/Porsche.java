package com.practise.javatraining;

public class Porsche extends Car{

    private int speed;

    public Porsche(String model, int cost) {
        super("Porsche", model, cost);
    }

    @Override
    public void speedUp() {
        this.speed+=10;
    }

}
