package PracticeProblems.StrucuralDesignPattern.BridgePattern;

public class Main {
        public static void main(String[] args) {
            Colour grey = new GreyColour();
            Colour red = new RedColour();
            Colour green = new GreenColour();

            Building s1 = new IndependentHouse(green);
            s1.appplyColourToBuilding();
            Building s2 = new Villa(red);
            s2.appplyColourToBuilding();
            Building s3 = new Society(grey);
            s3.appplyColourToBuilding();
    }
}
