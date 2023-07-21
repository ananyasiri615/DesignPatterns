package StructuralDesignPattern.BridgePattern;

public class Circle extends Shape {
    @Override
    void appplyColourToShape() {
        System.out.println("Going to Apply Colour to Circle");
        colour.applyColour();
    }

    public Circle(Colour colour) {
        super(colour);
    }
}
