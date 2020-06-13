package com.prathyusha;

//Client Side
public class BirdRetriever{
    private Bird bird;

    public BirdRetriever(){
        bird = Bird.BirdBuilder.newInstance().setCanFly(true)
                .setColour("Black").setGender("Male")
                .setHeight(12).setWeight(25).setScavenger(false).setBreed("Crow").Build();
    }

    public Bird getBird(){
        return bird;
    }
}