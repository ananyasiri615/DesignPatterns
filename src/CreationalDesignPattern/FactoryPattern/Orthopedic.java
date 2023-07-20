package CreationalDesignPattern.FactoryPattern;

public class Orthopedic extends Doctor {

    public Orthopedic(String name) {
        super(name);
    }

    public Orthopedic() {
        super();
    }

    @Override
    public void treat() {
        System.out.println("Orthopedic");
}

}