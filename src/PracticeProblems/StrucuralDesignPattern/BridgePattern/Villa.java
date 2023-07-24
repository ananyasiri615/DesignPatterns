package PracticeProblems.StrucuralDesignPattern.BridgePattern;


public class Villa extends Building {
    @Override
    void appplyColourToBuilding() {
        System.out.println("Going to Apply Colour to Villa");
        colour.applyColour();
    }

    public Villa(Colour colour) {
        super(colour);
    }
}
