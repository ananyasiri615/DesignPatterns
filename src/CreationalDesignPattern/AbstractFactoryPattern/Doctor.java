package CreationalDesignPattern.AbstractFactoryPattern;

public abstract class Doctor {

    public String name;
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
