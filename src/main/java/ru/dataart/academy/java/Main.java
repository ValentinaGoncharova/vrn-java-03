package ru.dataart.academy.java;

import ru.dataart.academy.java.figures.Circle;
import ru.dataart.academy.java.figures.Figure;
import ru.dataart.academy.java.figures.Rectangle;

public class Main {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        Circle circle1 = new Circle(1);
        Circle circle2 = new Circle(2);
        Rectangle rectangle1 = new Rectangle(5, 2, 5);
        Rectangle rectangle2 = new Rectangle(5, 8, 11);
        Figure[] figures = {circle1, circle2, rectangle1, rectangle2};

        System.out.print("Sum of areas = " + calculator.getSumArea(figures));

    }
}