package HomeAssignment.StructuralDesignPattern.DecoratorPattern;

public abstract class IceCream {
    protected String name;
    public  abstract void make();

    public IceCream(String name){
        super();
        this.name = name;
    }
    public IceCream(){
        super();
    }
}
