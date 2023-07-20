package CreationalDesignPattern.FactoryPattern;

import CreationalDesignPattern.FactoryPattern.Engineer;

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
        System.out.println("Civil engineers construct buildings");
    }



}