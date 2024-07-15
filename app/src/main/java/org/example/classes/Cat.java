package org.example.classes;

import org.example.annotations.RunImmediately;

public class Cat {
    String name;
    int age;
    public Cat(String name) {
        this.name = name;
    }
    @RunImmediately
    public void meow(){System.out.println("meow");}
    public void eat(){System.out.println("yummy");}
}
