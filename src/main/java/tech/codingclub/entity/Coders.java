package tech.codingclub.entity;

public class Coders {
    public String getName() {
        return name;
    }

    public long getAge() {
        return age;
    }

    private String name;
    private long age;
    public Coders(String name, long age) {
        this.name = name;
        this.age = age;
    }


    public Coders(){

    }
}
