package CreationalDesignPattern.SingletonPattern;

import java.util.concurrent.Callable;

public class CallableTask implements Callable<MySingletonClass> {

    @Override
    public MySingletonClass call() throws Exception {
        return	MySingletonClass.getMySingletonObject();

    }

}
