package org.thesatyendrakumar.creational_patterns.prototype;

public class ShapePrototype {

    public static void main(String[] args) {
        Circle originalCircle = new Circle(10);
        Circle clonedCircle = (Circle) originalCircle.clone();
        clonedCircle.radius = 20;

        System.out.println(originalCircle);
        System.out.println(clonedCircle);

        Rectangle originalRectangle = new Rectangle(15, 25);
        Rectangle clonedRectangle = (Rectangle) originalRectangle.clone();
        clonedRectangle.width = 30;

        System.out.println(originalRectangle);
        System.out.println(clonedRectangle);
    }
}
