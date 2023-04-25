package joachim.week08.photoapparat;

public class PhotoapparatMain {
    public static void main(String[] args) {
        PhotoapparatEinstellungen pe = new PhotoapparatEinstellungen(100, "xyz", "Canon", 5 );

        System.out.println(pe);
        pe.setStatBrennweite(150);
        pe.setModel("abc");
        pe.setHersteller("Nikon");
        pe.setMegapixel(150);
        System.out.println(pe);
    }
}
