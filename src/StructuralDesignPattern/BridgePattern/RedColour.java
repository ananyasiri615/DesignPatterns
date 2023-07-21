package StructuralDesignPattern.BridgePattern;

public class RedColour implements Colour{

    @Override
    public void applyColour() {
        System.out.println("Red Colour Applied");

    }
}
