package com.company;

public class Main {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();

        Square square = new Square();

        Circle circle = new Circle();

        CircleAdapter circleAdapter = new CircleAdapter(circle);

        rectangle.draw();
        square.draw();
        //circle.drawCircle();
        circleAdapter.draw();


    }
}
