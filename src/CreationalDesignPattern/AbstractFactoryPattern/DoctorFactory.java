package CreationalDesignPattern.AbstractFactoryPattern;


public class DoctorFactory extends ProfessionalFactory{

    private Doctor doctor;

    public Doctor getDoctor(String type) {
        switch (type.toLowerCase()) {
            case "dermatology":
                doctor = new Dermatologist();
                break;
            case "gynecology":
                doctor = new Gynecologist();
                break;
            case "orthopedic":
                doctor = new Orthopedic();
                break;
            default:
                doctor = null;
        }
        return doctor;
    }

}