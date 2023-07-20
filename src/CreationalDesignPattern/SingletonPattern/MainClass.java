package CreationalDesignPattern.SingletonPattern;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/*public class MainClass {
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
}*/
public class MainClass {

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        Callable<MySingletonClass> task = new CallableTask();

        FutureTask [] ft = new FutureTask[10];

        for(int i=0; i<10; i++) {
            CallableTask ct = new CallableTask();
            ft[i] = new FutureTask(ct);

            Thread t = new Thread(ft[i]);
            t.start();
        }

        for (int i = 0; i < 10; i++)
        {
            MySingletonClass obj = (MySingletonClass)ft[i].get();
            obj.display();
        }

        System.out.println("Program ended successfully");


    }

}
