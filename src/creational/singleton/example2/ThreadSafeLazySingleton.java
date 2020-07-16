package creational.singleton.example2;

public class ThreadSafeLazySingleton {
    private static ThreadSafeLazySingleton instance;
    private int value;

    private ThreadSafeLazySingleton(int value){
        this.value = value;
    }
    public static ThreadSafeLazySingleton getInstance(int value) {
        synchronized(ThreadSafeLazySingleton.class) {
            if (instance == null) {
                System.out.println("CREATING an instance :: Thread-Id: " + Thread.currentThread().hashCode());
                instance = new ThreadSafeLazySingleton(value);
            }
        }
        return instance;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
