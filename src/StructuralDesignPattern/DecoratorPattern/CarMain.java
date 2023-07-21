package StructuralDesignPattern.DecoratorPattern;

public class CarMain {
    public static void main(String[] args) {
        Car sportsCar = new SportsCarDecorator(new BasicCar("Hyundai Creta"));
        sportsCar.assemble();

        Car c2 = new SportsCarDecorator(new BasicCar("Fortuner"));
        c2.assemble();

        Car luxuryCar = new LuxuryCarDecorator(new BasicCar("Tata Altroz"));
        luxuryCar.assemble();
    }
}
