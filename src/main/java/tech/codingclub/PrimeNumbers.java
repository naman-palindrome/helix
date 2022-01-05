package tech.codingclub;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number");
        int flag;
        int n=scan.nextInt();
        for(int i=2;i<n;i++)
        { flag=1;
            for (int j=2;j<i;j++)
            {
                if(i%j==0)
                {
                    flag=0;
                    break;

                }

            }
            if(flag==1)
            System.out.println(i);

        }
    }
}