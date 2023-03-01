package singleTonClass;

import java.lang.reflect.Constructor;

class Singleton {
    private static final Singleton INSTANCE = new Singleton();
    private Singleton() {
        // private constructor
    }

    public static Singleton getInstance() {
        return INSTANCE;
    }
}

public class ReflectionExample {
    public static void main(String[] args) throws Exception {
        Singleton instance1 = Singleton.getInstance();
        Constructor<Singleton> constructor = Singleton.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        Singleton instance2 = constructor.newInstance();
        System.out.println(instance1 == instance2); // Output: false
    }
}
