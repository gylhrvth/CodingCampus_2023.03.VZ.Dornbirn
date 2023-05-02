package hassan.week09.etwas;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, Double> deutschArabischWoerterbuch = new HashMap<>();

        deutschArabischWoerterbuch.put("Apfel", 18.0);
        System.out.println(deutschArabischWoerterbuch);
        deutschArabischWoerterbuch.put("Apfel", 5.5);
        deutschArabischWoerterbuch.put("Birne", 2.0);
        deutschArabischWoerterbuch.put("Banane", -4.0);
        deutschArabischWoerterbuch.put("Orange", 0.0);
        System.out.println(deutschArabischWoerterbuch);

        System.out.println("**********");

        for (String key: deutschArabischWoerterbuch.keySet()) {
            System.out.println(key + "  ==> " + deutschArabischWoerterbuch.get(key));
        }

        System.out.println("containsKey: " + deutschArabischWoerterbuch.containsKey("YZitrone"));
        System.out.println("containsValue: " + deutschArabischWoerterbuch.containsValue(5));


    }
}
