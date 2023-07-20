package CreationalDesignPattern.SingletonPattern;

public class MainClass {
    public static void main(String[] args) {
        MySingletonClass obj = MySingletonClass.getSingletonObj();

        obj.display();

        MySingletonClass  obj1 = MySingletonClass.getSingletonObj();

        if (obj == obj1){
            System.out.println("Both objects are same");
        }
        else {
            System.out.println("Both objects are diffrent");
        }
    }
}
