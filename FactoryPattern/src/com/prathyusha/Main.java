package com.prathyusha;

public class Main {

    public static void main(String[] args) {
	// write your code here

        AnimalFactory animalFactory = AnimalFactory.getInstance();

        Animal animal1 = animalFactory.getAnimal("Dog");
        animal1.make_sound();

        Animal animal2 = animalFactory.getAnimal("Cat");
        animal2.make_sound();

        Animal animal3 = animalFactory.getAnimal("Cow");
        animal3.make_sound();

        Animal animal4 = animalFactory.getAnimal("Snake");
        animal4.make_sound();

    }
}
