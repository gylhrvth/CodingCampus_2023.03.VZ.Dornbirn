package hassan.week08.Photo;

public class PhotoMain {
    public static void main(String[] args) {
        PhotoAbarrat fotoapparat1 = new PhotoAbarrat(18,55,"EOS 700D","Canon",18);
        PhotoAbarrat fotoapparat2 = new PhotoAbarrat(24, 120, "D750", "Nikon", 24);
        PhotoAbarrat fotoapparat3 = new PhotoAbarrat(35, 135, "FE 55mm F1.8", "Sony", 24);

        fotoapparat1.takePhoto();
        System.out.println(fotoapparat1.toString());


        fotoapparat2.takePhoto();
        System.out.println(fotoapparat2.toString());


        fotoapparat3.takePhoto();
        System.out.println(fotoapparat3.toString());
    }
}
