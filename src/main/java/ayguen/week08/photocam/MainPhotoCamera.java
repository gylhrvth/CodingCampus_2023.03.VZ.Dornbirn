package ayguen.week08.photocam;

public class MainPhotoCamera {
    public static void main(String[] args) {

        PhotoCamera nikon = new PhotoCamera("Nikon", "D7500", 50, 10);
        System.out.println(nikon);

        MemoryCard kingston = new MemoryCard("Kingston 512", 512, 0);
        System.out.println(kingston);

        nikon.insertMemoryCard(kingston);
        System.out.println(nikon);

        boolean saveOK = true;
        while (saveOK){
            saveOK = nikon.takePhoto();
        }
        System.out.println(kingston);

/*
        String s1 = (nikon != null?"ABC":"123");
        System.out.println(s1);

        String s2;
        if (nikon != null){
            s2 = "ABC";
        } else {
            s2 = "123";
        }
        System.out.println(s2);
*/
    }
}
