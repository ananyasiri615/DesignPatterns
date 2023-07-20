package PracticeProblems.CreationalDesignPattern.BuilderPattern;

import java.util.Arrays;

public class Scientist {
    private int id;
    private String name;
    private String discpline;
    private String country;
    private boolean nobelPrizeWinner;
    private int noOfExperiments;
    private int noOfPatents;
    private String OrganizationName;
    private String wifename;
    private int age;

    String hobbies[];

    public Scientist(ScientistBuilder scientistBuilder){
        this.id = scientistBuilder.id;
        this.name = scientistBuilder.name;
        this.discpline = scientistBuilder.discpline;
        this.country = scientistBuilder.country;
        this.noOfPatents = scientistBuilder.noOfPatents;
        this.age = scientistBuilder.age;
    }
    public static class ScientistBuilder{
        private int id;
        private String name;
        private String discpline;
        private String country;
        private int noOfPatents;
        private int age;

    public ScientistBuilder(int id, String name, String discpline, String country, int noOfPatents, int age) {
        super();
        this.id = id;
        this.name = name;
        this.discpline = discpline;
        this.country = country;
        this.noOfPatents = noOfPatents;
        this.age = age;
    }

        public Scientist build() {
            return new Scientist(this);
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDiscpline() {
        return discpline;
    }

    public void setDiscpline(String discpline) {
        this.discpline = discpline;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public boolean isNobelPrizeWinner() {
        return nobelPrizeWinner;
    }

    public void setNobelPrizeWinner(boolean nobelPrizeWinner) {
        this.nobelPrizeWinner = nobelPrizeWinner;
    }

    public int getNoOfExperiments() {
        return noOfExperiments;
    }

    public void setNoOfExperiments(int noOfExperiments) {
        this.noOfExperiments = noOfExperiments;
    }

    public int getNoOfPatents() {
        return noOfPatents;
    }

    public void setNoOfPatents(int noOfPatents) {
        this.noOfPatents = noOfPatents;
    }

    public String getOrganizationName() {
        return OrganizationName;
    }

    public void setOrganizationName(String organizationName) {
        OrganizationName = organizationName;
    }

    public String getWifename() {
        return wifename;
    }

    public void setWifename(String wifename) {
        this.wifename = wifename;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String[] getHobbies() {
        return hobbies;
    }

    public void setHobbies(String[] hobbies) {
        this.hobbies = hobbies;
    }

    @Override
    public String toString() {
        return "Scientist{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", discpline='" + discpline + '\'' +
                ", country='" + country + '\'' +
                ", nobelPrizeWinner=" + nobelPrizeWinner +
                ", noOfExperiments=" + noOfExperiments +
                ", noOfPatents=" + noOfPatents +
                ", OrganizationName='" + OrganizationName + '\'' +
                ", wifename='" + wifename + '\'' +
                ", age=" + age +
                ", hobbies=" + Arrays.toString(hobbies) +
                '}';
    }
}
