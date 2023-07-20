package HomeAssignment.CreationalDesignPattern.FactoryPattern;

public abstract class Mobile {
    private String model;
    private int price;
    public abstract void feature();

    public 	Mobile(String model, int price)
    {
        super();
        this.price = price;
        this.model = this.model;
    }
    public Mobile()
    {
        super();
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }


    @Override
    public String toString() {
        return "Mobile [Model=" + model+" Price=" +price+"]";
    }



}
