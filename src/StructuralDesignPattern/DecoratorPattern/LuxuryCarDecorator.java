package StructuralDesignPattern.DecoratorPattern;

public class LuxuryCarDecorator extends BasicCar{
    protected Car car;
    public LuxuryCarDecorator(BasicCar car) {
        super(car.name);
    }

    public void assemble(){
        super.assemble();
        System.out.println("Luxury car feature added to "+name);
        System.out.println(name+" is a now a Luxury car");
    }
}
