package ru.dataart.academy.java.figures;

public class Rectangle extends Figure{

    private double a;
    private double b;
    private double c;

    public Rectangle (double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getPerimeter() {
        return a + b + c;
    }

    @Override
    public double getArea() {
        double p  = getPerimeter()/2;
        double area = Math.sqrt(p * (p -a) * (p -b) * (p -c));
        return area;
    }
}
