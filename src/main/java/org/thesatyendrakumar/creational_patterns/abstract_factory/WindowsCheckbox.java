package org.thesatyendrakumar.creational_patterns.abstract_factory;

public class WindowsCheckbox implements Checkbox {
    @Override
    public void render() {
        System.out.println("Rendering a Windows checkbox");
    }
}
