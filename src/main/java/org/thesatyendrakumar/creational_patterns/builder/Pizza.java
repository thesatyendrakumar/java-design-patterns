package org.thesatyendrakumar.creational_patterns.builder;

public class Pizza {
    private final String size;
    private final boolean cheese;
    private final boolean pepperoni;
    private final boolean bacon;

    public Pizza(PizzaBuilder builder) {
        this.size = builder.size;
        this.cheese = builder.cheese;
        this.pepperoni = builder.pepperoni;
        this.bacon = builder.bacon;
    }

    @Override
    public String toString() {
        return "Pizza [size=" + size + ", cheese=" + cheese + ", pepperoni=" + pepperoni + ", bacon=" + bacon + "]";
    }
}
