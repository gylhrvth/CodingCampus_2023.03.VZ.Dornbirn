package mert.week08.Foto;

public class FotoapparatMain {
    public static void main(String[] args) {
        Fotoapparat foto = new Fotoapparat("EOS R5", "Canon", 45);
        SpeicherKarte sk = new SpeicherKarte(64, 35);
        System.out.println(foto.toString());
    }

}
