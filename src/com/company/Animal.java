package com.company;

public class Animal {

    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String feed(){
         return name + " has been fed";
    }
}
