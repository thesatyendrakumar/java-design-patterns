package org.thesatyendrakumar.creational_patterns.prototype;

public class Circle implements Shape {

     int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public Shape clone() {
        return new Circle(this.radius);
    }

    @Override
    public String toString() {
        return "Circle [radius=" + radius + "]";
    }
}
