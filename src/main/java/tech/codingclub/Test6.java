package tech.codingclub;

import java.util.Date;
import java.util.Random;

public class Test6 {
    public static void main(String[] args) {
        System.out.println("Naman this side" + new Date().toString() + "sharp");

        Random random = new Random();
        int randomIntValue = random.nextInt(100);
        System.out.println("randomintvalue:" + randomIntValue);

        int randomIntValueInRange = 50 + random.nextInt(50);
        System.out.println("randomIntValue:50-99" + randomIntValueInRange);

        String string = "HELLO WORLD";
        System.out.println("printing string:" + string);
        string = string + "!";
        System.out.println("printing modifief string:" + string);

        System.out.println("current length:" + string.length());
        System.out.println("string(5,end)" + string.substring(5));
        System.out.println("string(5,6)" + string.substring(5, 7));
        System.out.println("UC:" + string.toUpperCase());
        System.out.println("LC:" + string.toLowerCase());

        int h = string.indexOf('W');
        System.out.println("index of h:" + h);

        char g = string.charAt(6);
        System.out.println("char at 6:" + g);
        String s1 = "abc";
        String s2 = "abd";
        System.out.println(s1.compareTo(s2));
        Date date = new Date();
        long sum = 0;
        long currentepoctime = date.getTime();
        for (int i = 0; i < 10000000; i++) {
            sum = sum + 1;
        }
        long timenow = date.getTime();
        long diff = (timenow - currentepoctime);
        System.out.println("diff:" + diff);
        Date dateFromEpoch = new Date(1584635277184L);
        System.out.println(dateFromEpoch.toString());
        System.out.println("current time:" + new Date().toString());

    }
}
