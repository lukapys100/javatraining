package com.practise.javatraining;

public class Electrician implements Worker {
    final private int WORKING_TIME;
    private int hoursWorked;
    private boolean isFood;

    public Electrician(int workingTime, boolean isFood) {
        this.WORKING_TIME = workingTime;
        this.isFood = isFood;
    }

    @Override
    public void welcomeOthers() {
        System.out.println("Hello my friends!");
    }

    @Override
    public void dressUp() {
        System.out.println("(You've put your electrician clothes)");
    }

    @Override
    public void haveBreak() {
        System.out.println("It's time for a break! ");
        if(consumeMeal()){
            System.out.println("I'm full so I can back to work.");
        }else{
            System.out.println("Ohh I forgot about meal... It seems I'll be hungry...");
        }
    }

    @Override
    public boolean consumeMeal() {
        return isFood;
    }

    @Override
    public void work(int workingTime) {
        welcomeOthers();
        dressUp();
        for(int i=0; i<workingTime; i++){
            System.out.println("Hours in work: " + (i+1));
            if(i == 4){
                haveBreak();
            }
        }
        this.hoursWorked = workingTime;
    }

    @Override
    public void finishWork() {
        if(this.hoursWorked == this.WORKING_TIME){
            System.out.println("Your work time is enough.");
        }else if(this.hoursWorked > this.WORKING_TIME){
            System.out.println("You work too much time!");
        }else{
            System.out.println("Come on. You should work much...");
        }
    }
}
