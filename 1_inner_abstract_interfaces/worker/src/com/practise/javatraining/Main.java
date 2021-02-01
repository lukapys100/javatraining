package com.practise.javatraining;

public class Main {

    public static void main(String[] args) {
	    Worker electrician = new Electrician(8, true);
        electrician.work(8);
        electrician.finishWork();
        System.out.println();
        electrician.work(9);
        electrician.finishWork();
        System.out.println();
        electrician.work(7);
        electrician.finishWork();

    }
}
