package com.example.springboot;

public class PaperDecorator extends ItemDecorator{
    Item item;

    @Override
    String getDescription() {
        return "Paper decorator";
    }

    double getPrice(){
        return (13 + item.price());
    }
}
