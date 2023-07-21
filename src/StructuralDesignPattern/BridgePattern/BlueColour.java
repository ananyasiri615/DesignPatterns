package StructuralDesignPattern.BridgePattern;

public class BlueColour implements Colour {
    @Override
    public void applyColour() {
        System.out.println("Blue Colour Applied");
    }
}
