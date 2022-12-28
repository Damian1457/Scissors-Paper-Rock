package com.example.spring.intro.shape;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class ShapeFactory {
    public Square createSquare() {
        return new Square();
    }

    public Shape chosenShape() {
        Shape theShape;
        Random random = new Random();
        int chosen = random.nextInt(3);

        if (chosen == 0) {
            theShape = new Triangle();
        } else if (chosen == 1) {
            theShape = new Circle();
        } else {
            theShape = new Square();
        }
        return theShape;
    }
}
