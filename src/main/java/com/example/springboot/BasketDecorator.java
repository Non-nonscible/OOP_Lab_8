package com.example.springboot;

public class BasketDecorator extends ItemDecorator{

    Item item;

    @Override
    String getDescription() {
        return "Basket decorator";
    }

    double getPrice(){
        return 4 + item.price();
    }
}
