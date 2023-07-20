package CreationalDesignPattern.AbstractFactoryPattern;

public class SoftwareEngineer extends Engineer {
    public SoftwareEngineer(String name, int age) {
        super(name, age);
    }

    public SoftwareEngineer() {
        super();
        // TODO Auto-generated constructor stub
    }

    @Override
    public void construct() {
        System.out.println("Software Engineer make software");
    }
}