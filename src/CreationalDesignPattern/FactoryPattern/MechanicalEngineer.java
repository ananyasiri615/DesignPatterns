package CreationalDesignPattern.FactoryPattern;

public class MechanicalEngineer extends Engineer {

    public MechanicalEngineer(String name, int age) {
        super(name, age);
    }

    public MechanicalEngineer() {
        super();
        // TODO Auto-generated constructor stub
    }

    @Override
    public void construct() {
        System.out.println("Mechanical engineers ");
    }



}