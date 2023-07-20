package HomeAssignment.CreationalDesignPattern.FactoryPattern;

public class Samsung extends Mobile{
    public Samsung(String model, int price) {
        super(model, price);
    }

    public Samsung() {
        super();
    }

    @Override
    public void feature() {
        System.out.println("Samsung Phone is of model: "+ this.getModel() +" and of Price: "+this.getPrice());
    }
}
