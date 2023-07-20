package CreationalDesignPattern.SingletonPattern;

public class MySingletonClass {
    //Early initialization of a singleton class
    //private static MySingletonClass singletonObj = new MySingletonClass();

    private static MySingletonClass singletonObj;

    //private means this constructor cannot be accesses outside this class
    private MySingletonClass(){

    }

    public static MySingletonClass getSingletonObj() {
        //Lazy Initialization
        if(singletonObj == null){
            singletonObj = new MySingletonClass();
        }
        return singletonObj;
    }
    public void display(){
        System.out.println("Welcome from inside display method");
    }
}