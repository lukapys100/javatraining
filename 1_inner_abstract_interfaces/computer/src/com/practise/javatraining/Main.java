package com.practise.javatraining;

public class Main {

    public static void main(String[] args) {
	    Computer computer = new Computer();
	    computer.addComponent("Graphic card", 2000);
	    computer.addComponent("Power supply", 500);
	    computer.addComponent("RAM", 500);
	    computer.powerOn();
	    computer.listComponents();
	    computer.addComponent("Mouse", 100);
	    computer.addComponent("Printer", 1000);
	    computer.powerOff();
	    computer.listComponents();
    }
}
