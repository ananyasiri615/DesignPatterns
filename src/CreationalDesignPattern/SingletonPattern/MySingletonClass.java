package CreationalDesignPattern.SingletonPattern;

/*public class MySingletonClass {
    //Early initialization of a singleton class
    //private static MySingletonClass singletonObj = new MySingletonClass();

    private static MySingletonClass singletonObj;

    //private means this constructor cannot be accesses outside this class
    //that means no object can be created outside this class
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
}*/
public class MySingletonClass {
    /*
     * //Early initialization of singleton object private static MySingletonClass
     * singletonObj = new MySingletonClass();
     */

    private static MySingletonClass singletonObj;
    private static int noOfObjects;

    public void display() {
        System.out.println("From inside display method");
        System.out.println("Total number of objects created here " + noOfObjects);
    }

    // private means this constructor cannot be accessed outside this class
    // that means no object can be created outside this class
    private MySingletonClass() {

    }

    //Double checked locking Singleton
    public static MySingletonClass getMySingletonObject() {

        if (singletonObj == null) {
            // Lazy initialization
            synchronized (MySingletonClass.class) {

                if (singletonObj == null) {
                    singletonObj = new MySingletonClass();
                    noOfObjects++;
                }
            }

        }
        return singletonObj;
    }

}