package com.practise.javatraining;

import java.util.ArrayList;

public class Computer {
    private ArrayList<ComputerComponent> computerComponents;
    private boolean isOn;

    public Computer() {
        this.computerComponents = new ArrayList<>();
        this.isOn = false;
    }

    public void powerOn(){
        if(!isOn) {
            this.isOn = true;
            System.out.println("Power is on!");
        }
    }

    public void powerOff(){
        if(isOn){
            this.isOn = false;
            System.out.println("Power is off!");
        }
    }

    public boolean addComponent(String name, int cost){
        ComputerComponent newComponent = new ComputerComponent(name, cost);
        return computerComponents.add(newComponent);
    }

    public void listComponents(){
        for(int i=0; i<computerComponents.size(); i++){
            System.out.println("Component " + (i+1) + ": " + computerComponents.get(i).toString());
        }
    }

    private class ComputerComponent{
        private String name;
        private int cost;

        public ComputerComponent(String name, int cost) {
            this.name = name;
            this.cost = cost;
        }

        @Override
        public String toString() {
            return this.name + " - " + this.cost;
        }
    }
}
