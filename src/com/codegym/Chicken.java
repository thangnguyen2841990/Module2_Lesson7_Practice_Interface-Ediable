package com.codegym;

public class Chicken extends Animal implements Ediable{

    @Override
    public String makeSound() {
        return "Chicken: Cluck-Cluck";
    }

    @Override
    public String howtoEat() {
        return "Could be fried";
    }
}
