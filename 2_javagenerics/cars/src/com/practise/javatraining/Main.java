package com.practise.javatraining;

public class Main {

    public static void main(String[] args) {
        Porsche porsche1 = new Porsche("Carrera S");
        Porsche porsche2 = new Porsche("Panamera");
        Porsche porsche3 = new Porsche("Cayene");

        Ferrari ferrari1 = new Ferrari("458");
        Ferrari ferrari2 = new Ferrari("F8 Tributo");
        Ferrari ferrari3 = new Ferrari("Roma");

        Lamborghini lamborghini1 = new Lamborghini("Aventador");
        Lamborghini lamborghini2 = new Lamborghini("Galardo");
        Lamborghini lamborghini3 = new Lamborghini("Diablo");

        Team<Porsche> porscheTeam = new Team<>();
        porscheTeam.addCar(porsche1);
        porscheTeam.addCar(porsche2);
        porscheTeam.addCar(porsche3);

        Team<Ferrari> ferrariTeam = new Team<>();
        ferrariTeam.addCar(ferrari1);
        ferrariTeam.addCar(ferrari2);
        ferrariTeam.addCar(ferrari3);

        Team<Lamborghini> lamborghiniTeam = new Team<>();
        lamborghiniTeam.addCar(lamborghini1);
        lamborghiniTeam.addCar(lamborghini2);
        lamborghiniTeam.addCar(lamborghini3);

        System.out.println();
        porscheTeam.listCars();
        System.out.println();
        ferrariTeam.listCars();
        System.out.println();
        lamborghiniTeam.listCars();

    }
}
