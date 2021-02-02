package com.practise.javatraining;

import java.util.ArrayList;

public class Team {
    private ArrayList<Car> carList = new ArrayList<>();


    public boolean addCar(Car newCar){
        if(carList.contains(newCar) || newCar == null){
            System.out.println("Car called " + newCar + " is already in the team.");
            return false;
        }
        carList.add(newCar);
        System.out.println("Car " + newCar + " has been added to the team.");
        return true;
    }

    public void listCars() {
        for (Car c : carList) {
            System.out.println(c);
        }
    }
}
