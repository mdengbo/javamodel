package com.example.javadecorate.api;

/**
 * @author madengbo
 * @create 2018-11-07 09:53
 * @desc
 * @Version 1.0
 **/

public abstract class ShapeDecorator implements Shape {
    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape){
        this.decoratedShape = decoratedShape;
    }

    public void draw(){
        decoratedShape.draw();
    }
}

