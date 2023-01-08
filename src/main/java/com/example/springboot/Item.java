package com.example.springboot;

public abstract class Item {

    public String description;

    String getDescription(){ return description;}

    abstract double price();
}
