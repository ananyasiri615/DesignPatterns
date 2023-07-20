package CreationalDesignPattern.AbstractFactoryPattern;

public class Orthopedic extends Doctor {

    public Orthopedic(String name) {
        super(name);
    }

    public Orthopedic() {
        super();
    }

    @Override
    public void treat() {
        System.out.println(this.name+" is a Orthopedic");
}

}