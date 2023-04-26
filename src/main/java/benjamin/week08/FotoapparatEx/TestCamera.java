package benjamin.week08.FotoapparatEx;

public class TestCamera {
    public static void main(String[] args) {


        MemoryCard card1 = new MemoryCard(10000, 10000);
        MemoryCard card2 = new MemoryCard(500,500);

        Objective objective = new Objective("Sony",50);

        Camera cam1 = new Camera("D850", "Nikon", 46, 0.3);
        Camera cam2 = new Camera("Alpha 6000", "Sony", 36, 0.3);

        System.out.println(cam1);
        //Test1
        cam1.takePhoto();
        cam1.insertMemoryCard(card1);
        cam1.takePhoto();
        cam1.putOnObjective(objective);
        //Test Freespace
        cam1.takePhoto();
        System.out.println(cam1);
        //Test with memory card und objective switch
        cam1.removeMemoryCard();
        cam1.takePhoto();
        cam1.insertMemoryCard(card1);
        cam1.removeObjective();
        cam1.takePhoto();
        cam1.putOnObjective(objective);
        cam1.takePhoto();
        System.out.println(cam1);
    }
}
