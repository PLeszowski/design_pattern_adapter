package com.company;

/**
 * Created by Patryk on 2017-06-19.
 */
public class CircleAdapter implements Shape {

    Circle circle;

    public CircleAdapter(Circle circle){
        this.circle = circle;
    }

    @Override
    public void draw() {

        circle.drawCircle();

    }
}
