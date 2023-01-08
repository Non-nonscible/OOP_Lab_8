package com.example.springboot;

import java.util.List;

public interface Delivery {

    default void deliver(List items){

    }

}
