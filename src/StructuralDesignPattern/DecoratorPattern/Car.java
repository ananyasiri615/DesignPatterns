package StructuralDesignPattern.DecoratorPattern;

public abstract class Car {
    protected String name;
    public  abstract void assemble();

    public Car(String name){
        super();
        this.name = name;
    }
    public Car(){
        super();
    }
}
