package com.practise.javatraining;

public class Porsche extends Car{

    private int speed;

    public Porsche(String model) {
        super("Porsche", model);
    }

    @Override
    public void speedUp() {
        this.speed+=10;
    }

}
