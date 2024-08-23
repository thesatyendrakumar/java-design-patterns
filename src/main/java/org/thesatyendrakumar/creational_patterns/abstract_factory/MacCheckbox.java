package org.thesatyendrakumar.creational_patterns.abstract_factory;

public class MacCheckbox implements Checkbox {
    @Override
    public void render() {
        System.out.println("Rendering a Mac checkbox");
    }
}
