package com.practise.javatraining;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println("I'm a cat so I like jumping and running smoothly.");
    }

    @Override
    public void eat() {
        System.out.println("Give me some food from your barbecue...");
    }

    @Override
    public void drink() {
        System.out.println("I'd rather prefer milk ^.^");
    }
}
