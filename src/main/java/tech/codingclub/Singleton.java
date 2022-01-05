package tech.codingclub;

public class Singleton {
    public int data;

    private static Singleton singleton;

    private Singleton(int data) {
        this.data = data;
        System.out.println("constructor was called when data was:" + data);
    }

    public static Singleton getSingletonInstance(int data) {
        if (singleton == null) {
            singleton = new Singleton(data);
        }
        return singleton;
    }

}