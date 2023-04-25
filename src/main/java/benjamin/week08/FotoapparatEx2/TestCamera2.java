package benjamin.week08.FotoapparatEx2;

public class TestCamera2 {
    public static void main(String[] args) {



        MemoryCard2 mem = new MemoryCard2("SanDisk", 499, 500, 0);

        Objective2 obj = new Objective2("Nikon", 18, 70);
        Camera2 cam = new Camera2("D850","Nikon",50);

        System.out.println("Testen mit Objectiv und mit Speicherkarte");

        cam.putOnObjective(obj);
        cam.insertMemorycard(mem);
        System.out.println(cam);
        cam.takePhoto();
        System.out.println(cam);
        System.out.println("Frage nach Inhalt der Speicherkarte");

        System.out.println();
        System.out.println(mem);
        System.out.println("Teste entfernen Objectiv und Speicherkarte");


        cam.removeMemoryCard();
        cam.removeObjective();
        System.out.println(cam);
        cam.takePhoto();

        System.out.println("Teste einfügen von Objectiv und Speicherkarte");
        cam.putOnObjective(obj);
        cam.insertMemorycard(mem);
        cam.takePhoto();
        System.out.println(cam);

        System.out.println();
        System.out.println("MemoryCard löschen");
        System.out.println();
        mem.deleteMemory();
        System.out.println(mem);

    }
}
