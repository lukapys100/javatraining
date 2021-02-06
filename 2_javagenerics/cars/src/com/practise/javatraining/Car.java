package com.practise.javatraining;

public abstract class Car implements Comparable<Car>{
    private String mark;
    private String model;
    private int cost;

    public Car(String mark, String model, int cost) {
        this.mark = mark;
        this.model = model;
        this.cost = cost;
    }

    public String getMark() {
        return mark;
    }

    public String getModel() {
        return model;
    }

    public int getCost() {
        return cost;
    }

    public abstract void speedUp();

    @Override
    public String toString() {
        return mark + " " + model + ": " + cost;
    }

    @Override
    public int compareTo(Car car) {
        if(this.getCost() > car.getCost()){
            return -1;
        }else if(this.getCost() < car.getCost()){
            return 1;
        }
        return 0;
    }
}
