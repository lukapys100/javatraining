package com.practise.javatraining;

public abstract class Car {
    private String mark;
    private String model;

    public Car(String mark, String model) {
        this.mark = mark;
        this.model = model;
    }

    public String getMark() {
        return mark;
    }

    public String getModel() {
        return model;
    }

    public abstract void speedUp();

    @Override
    public String toString() {
        return mark + " " + model;
    }
}
