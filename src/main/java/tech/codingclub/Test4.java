package tech.codingclub;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {

        int arr[] = {10, 20, 30, 40};
        arr[3] = 80;
        System.out.println("last value is :" + arr[arr.length - 1]);
        int marr[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}};
        System.out.println("last column last row:" + marr[1][3]);
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a:");
        int a = scan.nextInt();
        System.out.println("enter b:");
        int b = scan.nextInt();
        System.out.println("sum of a and b=" + (a + b));

    }
}
