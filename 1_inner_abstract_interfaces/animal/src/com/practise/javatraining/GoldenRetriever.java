package com.practise.javatraining;

public class GoldenRetriever extends Dog {
    private int age;

    public GoldenRetriever(String name, int age) {
        super(name);
        this.age = age;
    }

    @Override
    public void move() {
        System.out.println("I love retrieving!");
    }

    @Override
    public void bark() {
        System.out.println("Golden Retriever called " + getName() + " does it in that way: woof woof");
    }
}
