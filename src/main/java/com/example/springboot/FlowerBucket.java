package com.example.springboot;

import java.util.ArrayList;

public class FlowerBucket extends Item {

    private ArrayList<FlowerPack> content = new ArrayList<FlowerPack>();
    public FlowerBucket() {

    }

    void add(FlowerPack pack) {
        content.add(pack);
    }

    int getPrice() {
        int res = 0;
        for (FlowerPack elem: content) {
            res += elem.getQuantity() * elem.getFlower().getPrice();
        }
        return res;
    }

    @Override
    double price() {
        return 0;
    }

    Flower searchFlower() {
        return null;
    }
}
