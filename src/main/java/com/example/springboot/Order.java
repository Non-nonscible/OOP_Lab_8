package com.example.springboot;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Order {
        List<Item> items;
        Payment payment;
        Delivery delivery;

    public Order() {
        this.items = new ArrayList<>();
    }

    void setPaymentStrategy(Payment payment){
        this.payment = payment;
    }

    void setDeliveryStrategy(Delivery delivery){
        this.delivery = delivery;
    }

    double calculateTotalPrice() {
        double res = 0;
        for (Item elem : items) {
            res += elem.price();
        }
        return res;
    }

    void processOrder(){
        payment.pay(calculateTotalPrice());
        delivery.deliver(items);
    }

    void addItem(Item item){
        items.add(item);
    }

    void removeItem(Item item){
        int idx = items.indexOf(item);
        if (idx != -1){
            items.remove(item);
        }

    }
}
