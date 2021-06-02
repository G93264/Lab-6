package com.company;

public class Cow extends Animal {

    public Cow(String name) {
        super(name);
    }

    public void milk(){
        System.out.println(name + " has been milked");
    }
}
