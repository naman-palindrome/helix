package tech.codingclub;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Test9 {
    public static void main(String[] args) {
        System.out.println("naman" + new Date().toString());


        Map<String, String> countryToCapital = new HashMap<String, String>();

        countryToCapital.put("india", "delhi");
        countryToCapital.put("china", "beijing");
        countryToCapital.put("canada", "ottawa");

        if (countryToCapital.containsKey("india"))
            System.out.println("capital of india is:" + countryToCapital.get("india"));

        if (countryToCapital.containsKey("russia"))
            System.out.println("capital of russia is:" + countryToCapital.get("russia"));
        else
            System.out.println("capital of india is:" + "moscow");

        System.out.println("keys below");
        for (String key : countryToCapital.keySet()) {
            System.out.println(key);
        }
        System.out.println("values below");
        for (String values : countryToCapital.values()) {
            System.out.println(values);
        }
        System.out.println("##############");

        for (String key : countryToCapital.keySet())
            System.out.println(key + ":" + countryToCapital.get(key));


    }
}
