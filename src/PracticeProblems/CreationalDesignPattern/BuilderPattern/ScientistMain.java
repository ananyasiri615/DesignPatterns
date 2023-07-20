package PracticeProblems.CreationalDesignPattern.BuilderPattern;

public class ScientistMain {
    public static void main(String[] args) {

        Scientist  s = new Scientist.ScientistBuilder(101, "Abdul Kalam", "Rocket Science", "India", 52, 85).build();
        s.setOrganizationName("ISRO");

        System.out.println("Scientist mandatory info : " +s);


        Scientist.ScientistBuilder cb = new Scientist.ScientistBuilder(102, "Virat", "Cricket","India", 9000, 30);
        cb.build();
        Scientist c2 = new Scientist(cb);
        System.out.println(c2);


    }
}

