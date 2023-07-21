package StructuralDesignPattern.BridgePattern;

public class Rectangle extends Shape {
    @Override
    void appplyColourToShape() {
        System.out.println("Going to Apply Colour to Rectangele");
        colour.applyColour();
    }

    public Rectangle(Colour colour) {
        super(colour);
    }
}
