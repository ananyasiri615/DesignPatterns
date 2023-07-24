package PracticeProblems.StrucuralDesignPattern.BridgePattern;

public class Society extends Building {
    @Override
    void appplyColourToBuilding(){
        System.out.println("Going to Apply Colour to Society");
        colour.applyColour();
    }

    public Society(Colour colour) {
        super(colour);
    }
}
