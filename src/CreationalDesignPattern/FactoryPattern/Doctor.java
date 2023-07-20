package CreationalDesignPattern.FactoryPattern;

public abstract class Doctor {

    private String name;
    public abstract void treat();

    public 	Doctor(String name)
    {
        super();
        this.name = name;
    }
    public Doctor()
    {
        super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Doctor [name=" + name+"]";
    }



}
