package StructuralDesignPattern.DecoratorPattern;

public class BasicCar extends Car {
    @Override
    public void assemble() {
        System.out.println(name+" :basic Car Assembled");
    }

    public BasicCar(String name) {
        super();
        this.name = name;
    }
}
