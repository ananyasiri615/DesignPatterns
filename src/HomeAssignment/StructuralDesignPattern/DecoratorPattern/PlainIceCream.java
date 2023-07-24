package HomeAssignment.StructuralDesignPattern.DecoratorPattern;


public class PlainIceCream extends IceCream {
    @Override
    public void make() {
        System.out.println(name+" :Plain IceCream Made");
    }

    public PlainIceCream(String name) {
        super();
        this.name = name;
    }
}
