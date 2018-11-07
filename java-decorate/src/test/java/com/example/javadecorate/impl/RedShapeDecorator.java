package com.example.javadecorate.impl;

import com.example.javadecorate.api.Shape;
import com.example.javadecorate.api.ShapeDecorator;

/**
 * @author madengbo
 * @create 2018-11-07 09:53
 * @desc
 * @Version 1.0
 **/

public class RedShapeDecorator extends ShapeDecorator {


    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }

    private void setRedBorder(Shape decoratedShape){
        System.out.println("Border Color: Red");
    }
}

