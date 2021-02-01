package com.practise.javatraining;

public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public void move(){
        System.out.println("I'm kind of animal, but I don't know whether I walk or crawl...");
    }

    public void eat(){
        System.out.println("Hmm, I need something to eat, but I don't know what it is...");
    }

    public void drink(){
        System.out.println("Each animal drink water, so do I.");
    }

    public String getName() {
        return name;
    }
}
