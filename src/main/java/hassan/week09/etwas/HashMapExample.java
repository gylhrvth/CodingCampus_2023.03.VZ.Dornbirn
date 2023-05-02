package hassan.week09.etwas;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, String> deutschArabischWoerterbuch = new HashMap<>();


        deutschArabischWoerterbuch.put("Apfel", "شحبثم");
        deutschArabischWoerterbuch.put("Birne", "زهقرث");
        deutschArabischWoerterbuch.put("Banane", "زشرشرث");
        deutschArabischWoerterbuch.put("Orange", "خقشرلث");

        for (String key: deutschArabischWoerterbuch.keySet()) {
            System.out.println(key + "  ==> " + deutschArabischWoerterbuch.get(key));
        }

        System.out.println("containsKey: " + deutschArabischWoerterbuch.containsKey("YZitrone"));
        System.out.println("containsValue: " + deutschArabischWoerterbuch.containsValue("زشرشرث"));


    }
}
