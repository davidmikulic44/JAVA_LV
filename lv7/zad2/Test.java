package zad2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {
    public static void main(String[] args){
        LansirnaRampa lr = new LansirnaRampa();
        Raketa r1 = new Raketa("Raketa1", lr);
        Raketa r2 = new Raketa("Raketa2", lr);

        new Thread(r1).start();
        new Thread(r2).start();

        /*ExecutorService threadExecutor = Executors.newCachedThreadPool();

        threadExecutor.execute(r1);
        threadExecutor.execute(r2);*/
    }
}