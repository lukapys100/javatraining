package com.practise.javatraining;

public abstract class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println("I like running!");
    }

    @Override
    public void eat() {
        System.out.println("Meat is my favorite meal.");
    }

    public abstract void bark();
}
