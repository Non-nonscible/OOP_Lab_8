package com.example.springboot;

public class RomashkaFlower extends Item{
    @Override
    double price(){

        return 15;
    }

    @Override
    String getDescription() {
        return "name: Romashka; " +
                "price: " + String.valueOf(price());
    }
}
