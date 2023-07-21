package StructuralDesignPattern.BridgePattern;

public class GreenColour implements Colour {
    @Override
    public void applyColour() {
        System.out.println("Green Colour Applied");
    }
}
