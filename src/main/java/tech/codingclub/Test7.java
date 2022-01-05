package tech.codingclub;

import java.util.ArrayList;
import java.util.Date;

public class Test7 {
    public static void main(String[] args) {
        System.out.println("naman ahuja" + new Date().toString());


        ArrayList<String> arrayList = new ArrayList();

        arrayList.add("welcome");
        arrayList.add("to");
        arrayList.add("the");
        arrayList.add("Java");
        arrayList.add("code");
        arrayList.add("remove me");
        String first = arrayList.get(0);
        System.out.println("First one:" + first);
        arrayList.set(2, "THE");

        int size = arrayList.size();
        arrayList.remove(size - 1);

        for (int i = 0; i < arrayList.size(); i++)
            System.out.print(arrayList.get(i));

        arrayList.clear();
        System.out.println("size after clearing:" + arrayList.size());


    }
}
