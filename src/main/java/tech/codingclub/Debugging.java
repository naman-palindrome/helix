package tech.codingclub;

import java.util.Date;

public class Debugging {


    public static void main(String[] args) {
        int N=10;
        int sum=0;

        for (int i = 0; i < 10; i++)
            sum+=i;

        Singleton singleton=Singleton.getSingletonInstance(456);
        Singleton singletonSecond=Singleton.getSingletonInstance(106);
        System.out.println("sum till n number:"+N);
        System.out.println(new Date().toString());
        System.out.println(singleton.data+sum);
        int x=sum;
        int y=55;
        int z=x+y;
        System.out.println(z+"must be 100");
    }
}
