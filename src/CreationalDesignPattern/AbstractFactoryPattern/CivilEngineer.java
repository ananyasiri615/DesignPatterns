package CreationalDesignPattern.AbstractFactoryPattern;

public class CivilEngineer extends Engineer {

    public CivilEngineer(String name, int age) {
        super(name, age);
    }

    public CivilEngineer() {
        super();
        // TODO Auto-generated constructor stub
    }

    @Override
    public void construct() {
        System.out.println("Civil engineers construct buildings");
    }

}