package HomeAssignment.StructuralDesignPattern.DecoratorPattern;

public class PineappleDecorator extends PlainIceCream {
    protected IceCream iceCream;
    public PineappleDecorator(PlainIceCream iceCream) {
        super(iceCream.name);
    }

    public void assemble(){
        super.make();
        System.out.println("Pineapple Syrup added to "+name+" Icecream");
        System.out.println(name+" IceCream has Pineapple Syrup");
    }
}
