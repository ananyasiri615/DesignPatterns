package CreationalDesignPattern.BuilderPattern;

public class Cricketer {
    private int id;
    private String name;
    private String surname;
    private String country;
    private int age;
    private int noOfRuns;
    private int noOfWickets;
    private String wifeName;
    private int noOfKids;
    private String highestDegree;
    private String homecity;
    private String iplTeam;
    private String favouriteColour;
    private String favouriteFruit;

    public Cricketer(CricketerBuilder cricbuilder) {
        this.id = cricbuilder.id;
        this.name = cricbuilder.name;
        this.country = cricbuilder.country;
        this.noOfRuns = cricbuilder.noOfRuns;
        this.noOfWickets = cricbuilder.noOfWickets;
    }

    public static class CricketerBuilder{
        private int id;
        private String name;
        private String country;
        private int noOfRuns;
        private int noOfWickets;

        public CricketerBuilder(int id, String name, String country, int noOfRuns, int noOfWickets) {
            super();
            this.id = id;
            this.name = name;
            this.country = country;
            this.noOfRuns = noOfRuns;
            this.noOfWickets = noOfWickets;
        }
        public Cricketer build() {
            return new Cricketer(this);
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNoOfRuns() {
        return noOfRuns;
    }

    public void setNoOfRuns(int noOfRuns) {
        this.noOfRuns = noOfRuns;
    }

    public int getNoOfWickets() {
        return noOfWickets;
    }

    public void setNoOfWickets(int noOfWickets) {
        this.noOfWickets = noOfWickets;
    }

    public String getWifeName() {
        return wifeName;
    }

    public void setWifeName(String wifeName) {
        this.wifeName = wifeName;
    }

    public int getNoOfKids() {
        return noOfKids;
    }

    public void setNoOfKids(int noOfKids) {
        this.noOfKids = noOfKids;
    }

    public String getHighestDegree() {
        return highestDegree;
    }

    public void setHighestDegree(String highestDegree) {
        this.highestDegree = highestDegree;
    }

    public String getHomecity() {
        return homecity;
    }

    public void setHomecity(String homecity) {
        this.homecity = homecity;
    }

    public String getIplTeam() {
        return iplTeam;
    }

    public void setIplTeam(String iplTeam) {
        this.iplTeam = iplTeam;
    }

    public String getFavouriteColour() {
        return favouriteColour;
    }

    public void setFavouriteColour(String favouriteColour) {
        this.favouriteColour = favouriteColour;
    }

    public String getFavouriteFruit() {
        return favouriteFruit;
    }

    public void setFavouriteFruit(String favouriteFruit) {
        this.favouriteFruit = favouriteFruit;
    }

    @Override
    public String toString() {
        return "Cricketer [id=" + id + ", name=" + name + ", surname=" + surname + ", country=" + country + ", age="
                + age + ", noOfRuns=" + noOfRuns + ", noOfWickets=" + noOfWickets + ", wifeName=" + wifeName
                + ", noOfKids=" + noOfKids + ", highestDegree=" + highestDegree + ", homecity=" + homecity
                + ", iplTeam=" + iplTeam + ", favouriteColour=" + favouriteColour + ", favouriteFruit=" + favouriteFruit
                + "]";
    }
}
