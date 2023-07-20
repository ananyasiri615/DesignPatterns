package CreationalDesignPattern.BuilderPattern;

public class ActorMain {

    public static void main(String[] args) {


        Actor a = new Actor.ActorBuilder(101, "Arjun", "Kumar", "Mumbai").build();

        a.setAge(33);

        System.out.println("Actor mandatory info : " + a);

    }

}
