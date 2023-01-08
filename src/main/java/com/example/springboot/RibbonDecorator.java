package com.example.springboot;

public class RibbonDecorator extends ItemDecorator{

    Item item;

    @Override
    String getDescription() {
        return "Ribbon decorator";
    }
    double getPrice(){
        return 40 + item.price();
    }

    }
