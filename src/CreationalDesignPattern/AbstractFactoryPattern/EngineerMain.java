package CreationalDesignPattern.AbstractFactoryPattern;

public class EngineerMain {

        public static void main(String[] args) {
            EngineerFactory engineerFactory = new EngineerFactory();

            Engineer civilEngineer = engineerFactory.getEngineer("civil");
            civilEngineer.setName("Arjun");
            civilEngineer.setAge(30);
            System.out.println("Civil: "+ civilEngineer);

            Engineer softwareEngineer = engineerFactory.getEngineer("software");
            softwareEngineer.setName("Abhilasha");
            softwareEngineer.setAge(25);
            System.out.println("Software: "+ softwareEngineer);

            Engineer mechanicalEngineer = engineerFactory.getEngineer("mechanical");
            mechanicalEngineer.setName("Aditya");
            mechanicalEngineer.setAge(28);
            System.out.println("Mechanical: "+ mechanicalEngineer);

        }
    }


