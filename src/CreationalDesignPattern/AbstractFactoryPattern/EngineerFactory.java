package CreationalDesignPattern.AbstractFactoryPattern;

public class EngineerFactory extends ProfessionalFactory {

    private Engineer engineer;

    public Engineer getEngineer(String type) {

        switch(type.toLowerCase()) {

            case "civil" :
                engineer = new CivilEngineer();
                break;

            case "software" :
                engineer = new SoftwareEngineer();
                break;
            case "mechanical" :
                engineer = new MechanicalEngineer();
                break;
            default :
                engineer = null;
        }

        return engineer;
    }

}