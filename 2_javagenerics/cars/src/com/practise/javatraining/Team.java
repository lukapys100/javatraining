package com.practise.javatraining;

import java.util.ArrayList;
import java.util.Collections;

public class Team<T extends Car> {
    private ArrayList<T> carList = new ArrayList<>();


    public boolean addCar(T newCar){
        if(carList.contains(newCar) || newCar == null){
            System.out.println("Car called " + newCar + " is already in the team.");
            return false;
        }
        carList.add(newCar);
        System.out.println("Car " + newCar + " has been added to the team.");
        return true;
    }

    public void listCars() {
        Collections.sort(carList, Collections.reverseOrder());
        for (T car : carList) {
            System.out.println(car);
        }
    }

}
