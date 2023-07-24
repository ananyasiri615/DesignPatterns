package PracticeProblems.StrucuralDesignPattern.BridgePattern;


public abstract class Building {

    Colour colour;

    public Building(Colour colour) {
        super();
        this.colour = colour;
    }

    abstract void appplyColourToBuilding();
}
