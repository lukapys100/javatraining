package com.practise.javatraining;

public class Main {

    public static void main(String[] args) {
        Porsche porsche1 = new Porsche("Carrera S", 500000);
        Porsche porsche2 = new Porsche("Panamera", 200000);
        Porsche porsche3 = new Porsche("Cayene", 250000);

        Ferrari ferrari1 = new Ferrari("458", 1000000);
        Ferrari ferrari2 = new Ferrari("F8 Tributo", 1200000);
        Ferrari ferrari3 = new Ferrari("Roma", 1500000);

        Lamborghini lamborghini1 = new Lamborghini("Aventador", 2000000);
        Lamborghini lamborghini2 = new Lamborghini("Galardo", 1200000);
        Lamborghini lamborghini3 = new Lamborghini("Diablo", 1000000);

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
