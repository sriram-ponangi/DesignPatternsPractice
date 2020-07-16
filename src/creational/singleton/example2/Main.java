package creational.singleton.example2;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Thread[] threads = new Thread[10];
        for(int i = 0 ; i < threads.length ; i++) {
            threads[i] = new Thread(() -> {
                Random random = new Random();
                ThreadSafeLazySingleton singleton = ThreadSafeLazySingleton.getInstance(random.nextInt(10000));
                System.out.println("Singleton Object-Id: "+singleton.hashCode() + " :: Value: "+singleton.getValue());
            });
        }

        for (int j = 0; j < threads.length; j++) {
            threads[j].start();
        }
    }
}
