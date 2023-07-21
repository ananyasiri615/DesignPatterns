package StructuralDesignPattern.BridgePattern;

public class YellowColour implements Colour {
    @Override
    public void applyColour() {
        System.out.println("Yellow Colour Applied");
    }
}
