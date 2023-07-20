package CreationalDesignPattern.BuilderPattern;

public class CricketerMain {
    public static void main(String[] args) {

        Cricketer c = new Cricketer.CricketerBuilder(101, "Mahendra Singh", "India", 10000,50).build();

        c.setSurname("Dhoni");
        c.setAge(39);

        System.out.println("Cricketer mandatory info : " + c);


        Cricketer.CricketerBuilder cb = new Cricketer.CricketerBuilder(102, "Virat", "India", 9000, 30);
        cb.build();
        Cricketer c2 = new Cricketer(cb);
        System.out.println(c2);


    }
}
