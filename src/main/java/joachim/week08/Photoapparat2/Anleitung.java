package joachim.week08.Photoapparat2;

public class Anleitung {
    public static void main(String[] args) {
        Kamera ka = new Kamera("Nikon", "D90 SLR", 12);
        Memory me = new Memory("Kingstone", "Ultra 1000", 1024 * 1024, 90_000_000);
        Memory me2 = new Memory("Kingstone", "Ultra 1000", 1024 * 1024, 0);
        System.out.println(ka);
        System.out.println(me);


        ka.memoryEinfuegen(me); //die Memorycard wird in das Kamerasocket gesteckt.

        for (int i = 0; i < 100; i++) {
            if (ka.getFreeMemory() > 5_000_000){
                ka.memoryEntfernen();
                ka.memoryEinfuegen(me2);
            }

            ka.takeAPhoto();        //takeAPhoto kontrolliert alle sockets ob dies auch gefüllt sind.
        }
    }

}
