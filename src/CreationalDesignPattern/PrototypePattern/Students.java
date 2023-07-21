package CreationalDesignPattern.PrototypePattern;

import java.util.ArrayList;
import java.util.List;

public class Students implements Cloneable{
    private List<String> studentNames;

    public Students(){
        studentNames= new ArrayList<String>();
    }

    public Students(List<String> studentNames){
        this.studentNames  = studentNames;
    }

    public void loadData(){

        studentNames.add("Arjun");
        studentNames.add("Shankar");
        studentNames.add("Javed");
        studentNames.add("Shahid");
        studentNames.add("Mark");
        studentNames.add("David");

    }
    public List<String> getStudentNames(){
        return studentNames;
    }
    public void setStudentNames(List<String> studentNames){
        this.studentNames = studentNames;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        List<String> names = new ArrayList<>();
        for(String name : this.studentNames) {
            names.add(name);
        }
        return new Students(names);
    }

    @Override
    public String toString() {
        return "Students [studentNames=" + studentNames + "]";
    }

}


