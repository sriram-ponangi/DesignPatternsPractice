package creational.singleton.example1;

public class LazySingletonDemo {
    private static LazySingletonDemo instance;
    private int value;

    private LazySingletonDemo(int value){
        this.value = value;
    }
    public static LazySingletonDemo getInstance(int value) {
        if(instance == null){
            System.out.println("CREATING an instance :: Thread-Id: "+Thread.currentThread().hashCode());
            instance = new LazySingletonDemo(value);
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
