package hassan.week08.PhotoNew;

public class TestFunktionCam {
    public static void main(String[] args) {

        Camera sony = new Camera("EOS","Sony",20,1.0);

        sony.setBrennweite(50);

        NewMemory memory = new NewMemory("Disk",128,100);
        //sony.insertMemoryCard(memory);

        Lens lens = new Lens("Sony 30mm",50);
       sony.mountObjective(lens);

        System.out.println("====");
        sony.takePhoto();
        System.out.println(sony.toString());

        sony.removeMemoryCard();
        sony.dismountObjective();
    }
}
