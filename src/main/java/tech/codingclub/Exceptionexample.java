package tech.codingclub;

import java.util.Scanner;

public class Exceptionexample {
    public static void main(String[] args) {
        int x = 100;
        Scanner scan = new Scanner(System.in);
        int y = scan.nextInt();
        try {
            int ans = x / y;
            System.out.println(ans);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

}