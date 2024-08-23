package org.thesatyendrakumar.creational_patterns.abstract_factory;

public class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering a Windows button");
    }
}
