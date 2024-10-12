package ru.annasashkova.junglesimulator.entity;

public class Capybara {

    private int health = 100;
    private int energy = 100;
    public double foodPower = 1.2;

    public void setHealth(int health){
        this.health = health;
    }

    public int getHealth(){
        return this.health;
    }

    public void setEnergy(int energy){
        this.energy = energy;
    }

    public int getEnergy(){
        return this.energy;
    }
}
