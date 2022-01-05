package tech.codingclub;

import java.util.Date;

public class Test2 {
    public static void main(String[] args) {
        System.out.println("NAMAN SAYS hello world" + new Date().toString() + "sharp");

        int a = 400;
        int b = 8;
        int c = a + b;
        System.out.println("sum of" + a + "+" + b + "=" + c);
        double wideningVariable = a;
        System.out.println("widening variable value" + "=" + wideningVariable);

        wideningVariable = a + 0.1;
        System.out.println("modified widening variable value" + "=" + wideningVariable);

        int narrowingVariable = (int) wideningVariable;
        System.out.println("Narrowing variable value" + "=" + narrowingVariable);

        int overflowVariable = Integer.MAX_VALUE;
        int negativeVariable = Integer.MIN_VALUE;
        System.out.println("Min value of integer" + "=" + negativeVariable);
        System.out.println("Max value of integer" + "=" + overflowVariable);
        overflowVariable += 4;
        System.out.println("modified value of  integer" + "=" + overflowVariable);
    }
}
