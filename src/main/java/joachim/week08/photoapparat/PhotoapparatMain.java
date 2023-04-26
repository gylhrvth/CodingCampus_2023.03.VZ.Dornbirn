package joachim.week08.photoapparat;

public class PhotoapparatMain {
    public static void main(String[] args) {
        Kamera pe = new Kamera("Nikon", "D90 SLR", 12);
        System.out.println(pe);


        Objectiv o = new Objectiv(true);
        pe.anschraubenObjektiv(o);
        System.out.println(pe);


        Memory m = new Memory("Kingstone", "Ultra 1000", 1000, 75, 750);
        pe.einsteckenSpeicherKarte(m);
        System.out.println(pe);

        System.out.println("<--------------------------->");
        pe.takeAPhoto();
        System.out.println(pe);

        System.out.println("======================================");

        /*
        String s1 = (pe != null ? "ABC" : "123");
        System.out.println(s1);


        String s2;
        if (pe != null){
            s2 = "ABC";
        } else {
            s2 = "123";
        }
        System.out.println(s2);
        */

    }
}
