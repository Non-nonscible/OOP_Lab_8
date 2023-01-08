package com.example.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FLowerService {

    private static FlowerRepository flowerRepository;
    @Autowired
    public FLowerService(FlowerRepository flowerRepository){
        this.flowerRepository = flowerRepository;
    }

    public static List<Flower> getFlowers(){
        return flowerRepository.findAll();
    }

    public void addFlower(Flower flower){
        flowerRepository.save(flower);
    }
}
