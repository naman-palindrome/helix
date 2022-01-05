package tech.codingclub;

import java.util.Date;

public class Test5 {
    public static void main(String[] args) {
        System.out.println("Naman ahuja");
        System.out.println("time:" + new Date().toString() + "sharp");

        int a = 10;
        int b = 20;
        System.out.println("sum:" + (a + b));
        System.out.println("subtraction: " + (a - b));
        System.out.println("multiplication: " + (a * b));
        System.out.println("division: " + (a / b));
        System.out.println("modulo: " + (a % b));

        double c = -20.20;
        System.out.println("Math.abs()" + Math.abs(c));
        System.out.println("Math.ciel()" + Math.ceil(c));
        System.out.println("Math.floor()" + Math.floor(c));
        System.out.println("Math.min()" + Math.min(2, 3));
        System.out.println("Math.max()" + Math.max(2, 3));


    }


}
