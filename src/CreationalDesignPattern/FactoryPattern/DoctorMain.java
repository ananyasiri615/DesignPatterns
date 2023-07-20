package CreationalDesignPattern.FactoryPattern;

public class DoctorMain {
        public static void main(String[] args) {
            DoctorFactory doctorFactory = new DoctorFactory();

            Doctor dermatologist = doctorFactory.getDoctor("Dermatology");
            dermatologist.setName("Dr Arjun");
            System.out.println(dermatologist.getName() + " is a Dermatologist");

            Doctor gynecologist = doctorFactory.getDoctor("Gynecology");
            gynecologist.setName("Dr Meera");
            System.out.println(gynecologist.getName() + " is a Gynecologist");

            Doctor orthopedic = doctorFactory.getDoctor("Orthopedic");
            orthopedic.setName("Dr Shatrughn");
            System.out.println(orthopedic.getName() + " is an Orthopedic surgeon");

        }
}
