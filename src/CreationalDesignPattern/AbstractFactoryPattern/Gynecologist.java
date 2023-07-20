package CreationalDesignPattern.AbstractFactoryPattern;

public class Gynecologist extends Doctor {

    public Gynecologist(String name) {
        super(name);
    }

    public Gynecologist() {
        super();
    }

    @Override
    public void treat() {
        System.out.println(this.name+" is a Gynecologist");
}

}