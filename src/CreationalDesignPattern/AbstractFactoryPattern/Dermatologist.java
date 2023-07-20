package CreationalDesignPattern.AbstractFactoryPattern;

public class Dermatologist extends Doctor {

    public Dermatologist(String name) {
        super(name);
    }

    public Dermatologist() {
        super();
    }

    @Override
    public void treat() {
        System.out.println(this.name+" is a Dermatologist");
    }

}