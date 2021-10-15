package ru.dataart.academy.java;

import ru.dataart.academy.java.figures.Figure;

public class Calculator {

    public Calculator() {

    }

    public double getSumArea(Figure[] figures){
        double sumArea = 0;
        for (Figure figure : figures){
            sumArea+=figure.getArea();
        }
        return sumArea;
    }
}
