package eric.week08;

public class PhotoMain {
    public static void main(String[] args) {
        PhotoData data = new PhotoData("18mm","200mm",
                "Canon - 850D", "Nikon", 45.7);

        System.out.println(data);

        System.out.println("---");
        String message = "Photo was taken!";
        data.takePhoto(message);
    }
}
