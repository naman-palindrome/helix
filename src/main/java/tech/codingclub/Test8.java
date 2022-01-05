package tech.codingclub;

import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;

public class Test8 {
    public static void main(String[] args) {
        System.out.println("naman" + new Date().toString());

        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("this");
        linkedList.add("is");
        linkedList.add("how");
        linkedList.add("you");
        linkedList.add("code");
        linkedList.add("linked list");

        String first = linkedList.getFirst();
        String last = linkedList.getLast();
        System.out.println(first + ":" + last);
        linkedList.size();

        Iterator<String> iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            String data = (String) iterator.next();
            System.out.println(data);
        }

    }
}
