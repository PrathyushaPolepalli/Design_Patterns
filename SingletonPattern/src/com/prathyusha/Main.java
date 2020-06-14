package com.prathyusha;

public class Main {

    public static void main(String[] args) {
	// write your code here
        SingletonClass s1 = SingletonClass.getInstance();
        System.out.println(s1.str);
        s1.str = "Changed by s1";
        SingletonClass s2 = SingletonClass.getInstance();
        System.out.println(s2.str);
    }
}
