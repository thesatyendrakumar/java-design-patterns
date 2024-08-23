package org.thesatyendrakumar.creational_patterns.abstract_factory;

public class MacButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering a Mac button");
    }
}
