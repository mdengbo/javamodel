package com.example.javadecorate.impl;

import com.example.javadecorate.api.Shape;

/**
 * @author madengbo
 * @create 2018-11-07 09:52
 * @desc
 * @Version 1.0
 **/

public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Shape: Circle");
    }
}

