package com.practise.javatraining;

public class Main {

    public static void main(String[] args) {
	    GoldenRetriever goldenRetriever = new GoldenRetriever("Judy", 15);
	    goldenRetriever.move();
	    goldenRetriever.bark();
	    goldenRetriever.eat();
	    goldenRetriever.drink();

		System.out.println();

	    Cat cat = new Cat("Filemon");
	    cat.move();
	    cat.eat();
	    cat.drink();
    }
}
