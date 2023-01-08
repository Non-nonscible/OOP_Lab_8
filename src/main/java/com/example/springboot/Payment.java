package com.example.springboot;

public interface Payment {
    default void pay(double price){}
}
