package StructuralDesignPattern.DecoratorPattern;

public class SportsCarDecorator extends BasicCar{

    protected Car car;
    public SportsCarDecorator(BasicCar car) {
        super(car.name);
    }

    public void assemble(){
        super.assemble();
        System.out.println("Sports car feature added to "+name);
        System.out.println(name+" is a now a sports car");
    }

}
