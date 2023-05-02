package sandro.week08.ZooTycoon;

import java.util.Vector;

public class ZooKeeper {
    private String name;

    private Vector<Enclosure> tasklist;

    public ZooKeeper(String name) {
        this.name = name;
        this.tasklist = new Vector<>();
    }

    public String getName() {
        return name;
    }

    public Vector<Enclosure> getTasklist() {
        return tasklist;
    }

    public void addTask(Zoo zoo, Enclosure task) {
        zoo.addZooKeeper(this);
        tasklist.add(task);
    }

    public void removeTask(Enclosure task) {
        tasklist.remove(task);
    }
    public void taskdesciption (){
        for (Enclosure task: tasklist) {
            System.out.println(name + " walks over to " + task.getName());

        }

    }



    public void printTask() {
        System.out.print("├── " + name + " works at: ");
        if (tasklist.isEmpty()){
            System.out.println("│   ├── (has no job)");
        }
        for (Enclosure task : tasklist) {
            if (!task.equals(tasklist.firstElement())){
                if (!task.equals(tasklist.lastElement())) {
                    System.out.print(", ");
                } else {
                    System.out.print(" und ");
                }
            }
            System.out.print(task.getName());
        }
        System.out.println();
    }
}
