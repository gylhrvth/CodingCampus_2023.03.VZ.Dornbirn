package sandro.week08;

import java.util.Vector;

public class SandboxByGyula {
    static Vector<Integer> zahlen = new Vector<>();

    static Vector<Integer> dailyTasks = new Vector<>();

    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            zahlen.add(i);
        }

        simulation();
    }

    public static void simulation(){
        for (int tag = 1; tag <= 5; tag++) {
            System.out.println("Beginn Tag " + tag + ".");
            initDailyTasks();

            while (!dailyTasks.isEmpty()){
                Integer value = dailyTasks.remove(0);
                System.out.println("Start Task " + value);
            }
            System.out.println("Ende Tag " + tag + ".");
            System.out.println();

        }
    }

    public static void initDailyTasks() {
        dailyTasks.clear();
        dailyTasks.addAll(zahlen);
    }


        /*
        // Delete every value devedable by 7
        for (Integer i : zahlen) {
            if (i % 7 == 0){
                zahlen.remove(i);
            }
        }
         */

}
