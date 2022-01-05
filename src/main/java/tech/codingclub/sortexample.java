package tech.codingclub;

import java.util.*;

public class sortexample {
    public static void main(String[] args) {

        System.out.println("naman" + new Date().toString());
        ArrayList<String> emails = new ArrayList<String>();

        emails.add("contact@codingclub.com");
        emails.add("admin@codingclub.com");
        emails.add("student@codingclub.com");


        for (String mail : emails) {
            System.out.println(mail);
        }
        Collections.sort(emails);
        for (String mail : emails) {
            System.out.println(mail);
        }

    }
}
