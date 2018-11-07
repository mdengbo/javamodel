package com.example.javadecorate;

import com.example.javadecorate.api.Shape;
import com.example.javadecorate.impl.Circle;
import com.example.javadecorate.impl.Rectangle;
import com.example.javadecorate.impl.RedShapeDecorator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JavaDecorateApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Test
    public void DecoratorPatternDemo(){
        Shape circle = new Circle();

        Shape redCircle = new RedShapeDecorator(new Circle());

        Shape redRectangle = new RedShapeDecorator(new Rectangle());
        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        redCircle.draw();

        System.out.println("\nRectangle of red border");
        redRectangle.draw();
    }
}
