package CreationalDesignPattern.AbstractFactoryPattern;

public class AbstractFactory {
    public static void main(String[] args) {
        EngineerFactory obj = (EngineerFactory) ProfessionalFactory.getFactory("Engineer");
        Engineer e1 = obj.getEngineer("civil");
        e1.setName("Madhuri");
        e1.setAge(23);
        e1.construct();

        Engineer e2 = obj.getEngineer("software");
        e1.setName("Keshav");
        e1.setAge(22);
        e2.construct();

        DoctorFactory obj1 = (DoctorFactory) ProfessionalFactory.getFactory("Doctor");

        Doctor d1 = obj1.getDoctor("dermatology");
        d1.setName("Dr Anshika");
        d1.treat();
        Doctor d2 = obj1.getDoctor("orthopedic");
        d2.setName("Dr Bharat");
        d2.treat();
    }
}