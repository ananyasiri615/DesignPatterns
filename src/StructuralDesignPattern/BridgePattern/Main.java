package StructuralDesignPattern.BridgePattern;

public class Main {
    public static void main(String[] args) {
        Colour red = new RedColour();
        Colour yellow = new YellowColour();
        Colour blue = new BlueColour();
        Colour green = new GreenColour();

        Shape s1 = new Rectangle(red);
        s1.appplyColourToShape();
        Shape s2 = new Square(yellow);
        s2.appplyColourToShape();
        Shape s3 = new Square(red);
        s3.appplyColourToShape();

        s1 = new Rectangle(blue);
        s1.appplyColourToShape();
        System.out.println("Blue Colour Applied to Recatangle now");

        s2 = new Square(green);
        s2.appplyColourToShape();
        System.out.println("Green Colour Applied to Square now");

        Shape s4 = new Circle(blue);
        s4.appplyColourToShape();






    }
}
