package benjamin.week08.FotoapparatEx2;

public class TestCamera2 {
    public static void main(String[] args) {



        MemoryCard2 mem = new MemoryCard2("SanDisk",500);
        Objective2 obj = new Objective2("Nikon", 18, 70);
        Camera2 cam = new Camera2("D850","Nikon",70);


        //Test if everything works
        cam.putOnObjective(obj);
        cam.insertMemorycard(mem);
        obj.setFocalLength(50);
        System.out.println(cam);
        cam.takePhoto();
        //Test photo count and Used Memory count
        cam.getPhotosTaken();
        mem.getFreeMemory();
        System.out.println(mem);
        //Test without memory Card
        cam.removeMemoryCard();
        System.out.println(cam);
        cam.takePhoto();
        //Test again if everything works
        cam.insertMemorycard(mem);
        cam.takePhoto();
        cam.getPhotosTaken();
        mem.getFreeMemory();
        System.out.println(mem);
        //Test without Objectiv
        cam.removeObjective();
        System.out.println(cam);
        cam.takePhoto();
        //Test delete Memory
        mem.deleteMemory();
        System.out.println(mem);
        //Test capacity limit
        cam.putOnObjective(obj);
        for (int i = 0; i < 40; i++) {
            cam.takePhoto();
        }
        cam.getPhotosTaken();
        System.out.println(mem);

    }
}
