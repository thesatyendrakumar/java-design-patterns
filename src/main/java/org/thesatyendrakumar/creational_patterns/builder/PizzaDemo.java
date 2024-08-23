package org.thesatyendrakumar.creational_patterns.builder;

public class PizzaDemo {
    public static void main(String[] args) {
        Pizza pizza = new PizzaBuilder("Large")
                .addCheese()
                .addPepperoni()
                .build();

        System.out.println(pizza);
    }
}
