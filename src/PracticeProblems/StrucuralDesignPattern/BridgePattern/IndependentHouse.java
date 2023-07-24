package PracticeProblems.StrucuralDesignPattern.BridgePattern;

public class IndependentHouse extends Building {
    @Override
    void appplyColourToBuilding(){
        System.out.println("Going to Apply Colour to Independent House");
        colour.applyColour();
    }

    public IndependentHouse(Colour colour) {
        super(colour);
    }
}
