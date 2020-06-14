package com.prathyusha;

import java.util.HashMap;

public class AnimalFactory {
    static AnimalFactory a = null;
    static public HashMap<String, Animal> AnimalMap = new HashMap<String, Animal>();
    private AnimalFactory() {

        AnimalMap.put("Cat", new Cat());
        AnimalMap.put("Cow", new Cow());
        AnimalMap.put("Dog", new Dog());
        AnimalMap.put("Snake", new Snake());

    }
    static public AnimalFactory getInstance() {
        if (a == null)
            a = new AnimalFactory();
        return a;
    }

    static public Animal getAnimal(String animal){
        return AnimalMap.get(animal);
    }
}


/*
public class SingletonClass {
    static SingletonClass s=null;
    public String str;
    private SingletonClass() {
        str = "Singleton Object";
        System.out.println("This is Singleton Class.");
    }

    static public SingletonClass getInstance(){
        if(s==null)
            s = new SingletonClass();
        return s;
    }

}*/