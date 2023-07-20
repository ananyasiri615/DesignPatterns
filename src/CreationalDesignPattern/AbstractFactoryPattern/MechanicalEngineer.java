package CreationalDesignPattern.AbstractFactoryPattern;

public class MechanicalEngineer extends Engineer {

    public MechanicalEngineer(String name, int age) {
        super(name, age);
    }

    public MechanicalEngineer() {
        super();
    }

    @Override
    public void construct() {
        System.out.println("Mechanical engineers ");
    }



}