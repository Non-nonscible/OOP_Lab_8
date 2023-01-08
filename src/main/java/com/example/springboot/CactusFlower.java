package com.example.springboot;

public class CactusFlower extends Item{

    @Override
    public double price() {
        return 20;
    }


    @Override
    String getDescription() {
        return "name: Cactus " +
                "price: " + String.valueOf(price());
    }
}
