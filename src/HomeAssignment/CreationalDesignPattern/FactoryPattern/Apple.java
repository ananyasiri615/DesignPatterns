package HomeAssignment.CreationalDesignPattern.FactoryPattern;

public class Apple extends Mobile{
    public Apple(String model, int price) {
        super(model, price);
    }

    public Apple() {
        super();
    }

    @Override
    public void feature() {
        System.out.println("Apple Phone is of model: "+ this.getModel() +" and of Price: "+this.getPrice());
    }
}
