package com.prathyusha;

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
}
