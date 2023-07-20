package CreationalDesignPattern.FactoryPattern;

public class EngineerMain {

        public static void main(String[] args) {
            EngineerFactory engineerFactory = new EngineerFactory();

            Engineer civilEngineer = engineerFactory.getEngineer("civil");
            civilEngineer.construct();

            Engineer softwareEngineer = engineerFactory.getEngineer("software");
            softwareEngineer.construct();

            Engineer mechanicalEngineer = engineerFactory.getEngineer("mechanical");
            mechanicalEngineer.construct();
        }
    }


