package sandro.week13;

import java.util.UUID;

public class ShoUUID {
    public static void main(String[] args) {
        String helloWorld = "Hello World!";

        System.out.println(helloWorld);
        System.out.println(helloWorld.hashCode());
        System.out.println(UUID.randomUUID());
    }
}
