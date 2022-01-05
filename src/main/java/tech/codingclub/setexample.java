package tech.codingclub;

import java.util.*;

public class setexample {
    public static void main(String[] args) {
        System.out.println("naman" + new Date().toString());
        ArrayList<String> emails = new ArrayList<String>();

        emails.add("contact@codingclub.com");
        emails.add("admin@codingclub.com");
        emails.add("student@codingclub.com");
        emails.add("student@codingclub.com");
        emails.add("student@codingclub.com");

        Set<String> uniqueemails = new HashSet<String>();
        uniqueemails.add("hr@google.com");
        uniqueemails.addAll(emails);

        Iterator<String> iterator = uniqueemails.iterator();
        while (iterator.hasNext()) {
            System.out.println("Iterator showing:" + iterator.next());
        }
        for (String x : emails) {
            System.out.println("for loop showing:" + x);
        }

        System.out.println("SIZE OF SET:" + uniqueemails.size());
        uniqueemails.remove("admin@codingclub.com");
        for (String x : uniqueemails) {
            System.out.println("for loop showing:" + x);
        }

        boolean x = uniqueemails.contains("contact@codingclub.com");
        System.out.println("conding club exists:" + x);

    }

}
