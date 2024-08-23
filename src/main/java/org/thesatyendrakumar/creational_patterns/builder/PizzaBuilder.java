package org.thesatyendrakumar.creational_patterns.builder;

public class PizzaBuilder {
    String size;
    boolean cheese;
    boolean pepperoni;
    boolean bacon;

    public PizzaBuilder(String size) {
        this.size = size;
    }

    public PizzaBuilder addCheese() {
        this.cheese = true;
        return this;
    }

    public PizzaBuilder addPepperoni() {
        this.pepperoni = true;
        return this;
    }

    public PizzaBuilder addBacon() {
        this.bacon = true;
        return this;
    }

    public Pizza build() {
        return new Pizza(this);
    }
}
