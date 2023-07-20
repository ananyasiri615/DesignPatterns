package CreationalDesignPattern.AbstractFactoryPattern;

public class DoctorMain {
        public static void main(String[] args) {
            DoctorFactory doctorFactory = new DoctorFactory();

            Doctor obj1 = doctorFactory.getDoctor("Dermatologist");
            obj1.treat();

            Doctor obj2 = doctorFactory.getDoctor("Gyneco");
            obj1.treat();

            Doctor obj3 = doctorFactory.getDoctor("Dermatologist");
            obj1.treat();

        }
}
