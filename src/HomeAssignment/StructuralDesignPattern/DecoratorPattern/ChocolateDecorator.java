package HomeAssignment.StructuralDesignPattern.DecoratorPattern;

public class ChocolateDecorator extends PlainIceCream {
    protected IceCream iceCream;
    public ChocolateDecorator(PlainIceCream iceCream) {
        super(iceCream.name);
    }

    public void assemble(){
        super.make();
        System.out.println("Choclate Syrup added to "+name+ "Icecream");
        System.out.println(name+" now has Chocolate Syrup");
    }
}
