package HomeAssignment.CreationalDesignPattern.FactoryPattern;

public class Vivo extends Mobile{
    public Vivo(String model, int price) {
        super(model, price);
    }

    public Vivo() {
        super();
    }

    @Override
    public void feature() {
        System.out.println("Vivo Phone is of model: "+ this.getModel() +" and of Price: "+this.getPrice());
    }
}
