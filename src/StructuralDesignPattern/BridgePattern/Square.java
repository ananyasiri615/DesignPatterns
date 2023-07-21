package StructuralDesignPattern.BridgePattern;

public class Square extends Shape {
    @Override
    void appplyColourToShape() {
        System.out.println("Going to Apply Colour to Square");
        colour.applyColour();
    }

    public Square(Colour colour) {
        super(colour);
    }
}
