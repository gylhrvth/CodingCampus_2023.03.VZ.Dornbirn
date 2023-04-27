package joachim.week08.Photoapparat2;

public class Anleitung {
    public static void main(String[] args) {
        Kamera ka = new Kamera("Nikon", "D90 SLR", 33);
        Memory me = new Memory("Kingstone", "Ultra 1000", 1000000, 499980);
        Memory me2 = new Memory("Kingstone", "Ultra 1000", 1000000, 0);
        Objectiv ob = new Objectiv("Nikon","Herbert",69420,1337);
        System.out.println(ka);
        System.out.println(me);


        ka.memoryEinfuegen(me); //die Memorycard wird in das Kamerasocket gesteckt.
        ka.objectivEinfuegen(ob); //Objectiv wir angedreht.

        for (int i = 0; i < 100; i++) {
            if (ka.getFreeMemory() < 500000){
                ka.memoryEntfernen();
                ka.memoryEinfuegen(me2);
            }

            ka.takeAPhoto();        //takeAPhoto kontrolliert alle sockets ob dies auch gefüllt sind.

        }
    }

}
