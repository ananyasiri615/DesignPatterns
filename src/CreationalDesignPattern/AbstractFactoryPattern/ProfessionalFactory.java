package CreationalDesignPattern.AbstractFactoryPattern;

public abstract class ProfessionalFactory {

    private static ProfessionalFactory abstractFactory;

    public static ProfessionalFactory getFactory(String factoryType){
        switch (factoryType){
            case "Doctor" :
                abstractFactory = new DoctorFactory();
                break;
            case "Engineer" :
                abstractFactory = new EngineerFactory();
                break;
            default:
                abstractFactory = null;
        }
        return abstractFactory;

    }
}
