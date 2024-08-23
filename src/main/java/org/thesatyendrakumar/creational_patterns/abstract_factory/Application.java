package org.thesatyendrakumar.creational_patterns.abstract_factory;

public class Application {
    private final Button button;
    private  final Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void render() {
        button.render();
        checkbox.render();
    }

    public static void main(String[] args) {
        // Create a Windows factory and use it to instantiate Windows components
        GUIFactory factory = new WindowsFactory();
        Application app = new Application(factory);
        app.render();

        // Create a Mac factory and use it to instantiate Mac components
        factory = new MacFactory();
        app = new Application(factory);
        app.render();
    }
}
