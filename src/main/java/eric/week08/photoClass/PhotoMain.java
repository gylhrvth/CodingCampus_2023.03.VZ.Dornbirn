package eric.week08.photoClass;

import lukas.week03.day4.Colors;

public class PhotoMain {
    public static void main(String[] args) {
        Camera myCanon = new Camera("Canon - 850D", "Nikon");
        MemoryCard memory = new MemoryCard("Sandisk Micro SD 1GB");
        Lens lens = new Lens();

        System.out.println(Colors.COLORS[3] + "Camera being used + components" + Colors.RESET);

        myCanon.setLens(lens);
        myCanon.setMc(memory);
        System.out.println(myCanon);

        System.out.println(Colors.COLORS[3] + "---" + Colors.RESET);

        for (int i = 0; i < 10; i++) {
            myCanon.takePhoto();
        }

        System.out.println(Colors.COLORS[3] + "---" + Colors.RESET);
        System.out.println(myCanon);
    }
}
