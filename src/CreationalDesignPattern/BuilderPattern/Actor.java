package CreationalDesignPattern.BuilderPattern;

public class Actor {
    private int id;
    private String name;
    private String surname;
    private String city;
    private int age;
    private int pinCode;
    private String qualification;
     private String address;
     private String OwnedVehical;
     private int vehicalNumber;

    public Actor(ActorBuilder actorBuilder) {
        this.id = actorBuilder.id;
        this.name = actorBuilder.name;
        this.surname = actorBuilder.surname;
        this.city = actorBuilder.city;
    }

    //static inner class
    public static class ActorBuilder {
        private int id;
        private String name;
        private String surname;
        private String city;


        public ActorBuilder(int id, String name, String surname, String city) {
            super();
            this.id = id;
            this.name = name;
            this.surname = surname;
            this.city = city;
        }

        public Actor build() {
            return new Actor(this);
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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPinCode() {
        return pinCode;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getOwnedVehical() {
        return OwnedVehical;
    }

    public void setOwnedVehical(String ownedVehical) {
        OwnedVehical = ownedVehical;
    }

    public int getVehicalNumber() {
        return vehicalNumber;
    }

    public void setVehicalNumber(int vehicalNumber) {
        this.vehicalNumber = vehicalNumber;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", city='" + city + '\'' +
                ", age=" + age +
                ", pinCode=" + pinCode +
                ", qualification='" + qualification + '\'' +
                ", address='" + address + '\'' +
                ", OwnedVehical='" + OwnedVehical + '\'' +
                ", vehicalNumber=" + vehicalNumber +
                '}';
    }
}
