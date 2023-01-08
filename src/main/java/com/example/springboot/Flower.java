package com.example.springboot;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
@Setter
public class Flower {
    @Id @GeneratedValue
    @Getter
    private int id;
    private String color;
    private double sepalLength;
    @Getter
    private double price;
}
