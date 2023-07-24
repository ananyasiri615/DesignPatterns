package HomeAssignment.StructuralDesignPattern.DecoratorPattern;


public class IcecreamMain {
    public static void main(String[] args) {
        IceCream chocolate = new ChocolateDecorator(new PlainIceCream("Vanilla"));
        chocolate.make();

        IceCream pineapple = new PineappleDecorator(new PlainIceCream("Guava"));
        pineapple.make();

        IceCream nuts = new NutsAndDryFruitsDecorator(new PlainIceCream("Coconuct"));
        nuts.make();
    }
}
