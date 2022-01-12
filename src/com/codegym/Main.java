package com.codegym;

public class Main {

    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();  // up casting
        animals[1] = new Chicken();
        for (Animal animal:animals) {
            System.out.println(animal.makeSound());
            if (animal instanceof Chicken){
                Ediable ediable = (Chicken) animal;  //down casting
                System.out.println(ediable.howtoEat());
            }
        }

        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Apple();
        fruits[1] =new Orange();
        for (Fruit fruit: fruits) {
            System.out.println(fruit.howtoEat());
        }

    }
}
