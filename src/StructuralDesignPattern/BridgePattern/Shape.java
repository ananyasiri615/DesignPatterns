package StructuralDesignPattern.BridgePattern;

public abstract class Shape {

    protected Colour colour;

    public Shape(Colour colour) {
        super();
        this.colour = colour;
    }

    abstract void appplyColourToShape();
}
