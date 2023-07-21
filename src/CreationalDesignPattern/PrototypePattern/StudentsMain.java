package CreationalDesignPattern.PrototypePattern;

import java.util.ArrayList;
import java.util.List;

public class StudentsMain {
    public static void main(String[] args) throws CloneNotSupportedException{
        //create prototype object
        Students studentsPrototype = new Students();
        studentsPrototype.loadData();
        System.out.println((studentsPrototype));


        Students s1 = (Students)studentsPrototype.clone();
        s1.getStudentNames().add(3, "Sindhu");
        s1.getStudentNames().add(4, "Keerti");

        System.out.println((s1));

        Students s2 = (Students)studentsPrototype.clone();
        List<String> femalStudents = new ArrayList<>();
        femalStudents.add("Ananya");
        femalStudents.add("Anjali");
        femalStudents.add("Deepa");
        femalStudents.add("Divya");
        femalStudents.add("Preema");

        s2.setStudentNames(femalStudents);

        System.out.println((s2));

    }

}
