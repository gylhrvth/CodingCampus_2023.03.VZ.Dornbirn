package benjamin.week08.FotoapparatEx2;

public class TestCamera2 {
    public static void main(String[] args) {

        MemoryCard2 mem = new MemoryCard2("SanDisk",500);
        Objective2 obj = new Objective2("Nikon", 18, 70);
        Camera2 cam = new Camera2("D850","Nikon",45);

//        //Test if everything works
//        cam.putOnObjective(obj);
//        cam.insertMemorycard(mem);
//        obj.setFocalLength(10);
//        System.out.println(cam);
//        cam.takePhoto();
//        //Test photo count and Used Memory count
//        cam.getPhotosTaken();
//        mem.getFreeMemory();
//        System.out.println(mem);
//        //Test without memory Card
//        cam.removeMemoryCard();
//        System.out.println(cam);
//        cam.takePhoto();
//        //Test again if everything works
//        cam.insertMemorycard(mem);
//        cam.takePhoto();
//        cam.getPhotosTaken();
//        mem.getFreeMemory();
//        System.out.println(mem);
//        //Test without Objective
//        cam.removeObjective();
//        System.out.println(cam);
//        cam.takePhoto();
//        //Test delete Memory
//        mem.deleteMemory();
//        System.out.println(mem);
//        //Test capacity limit
//        cam.putOnObjective(obj);
//        for (int i = 0; i < 40; i++) {
//            cam.takePhoto();
//        }
//        cam.getPhotosTaken();
//        System.out.println(mem);

        Objective2 canon = new Objective2("Canon", 18, 70);
        Objective2 fujiFilms = new Objective2("FujiFilms", 18, 70);
        Objective2 hasselbad = new Objective2("Hasselbad", 18, 70);
        Objective2 leica = new Objective2("Leica", 18, 70);
        Objective2 mamiya = new Objective2("Mamiya", 18, 70);
        Objective2 olympus = new Objective2("Olympus", 18, 70);
        Objective2 panasonic = new Objective2("Panasonic", 18, 70);
        Objective2 polaroid = new Objective2("Polaroid", 18, 70);
        Objective2 phaseOne = new Objective2("PhaseOne", 18, 70);
        Objective2 pentax = new Objective2("Pentax", 18, 70);
        Objective2 gr = new Objective2("Gr", 18, 70);
        Objective2 rolleiflex = new Objective2("Rolleiflex", 18, 70);
        Objective2 sigma = new Objective2("Sigma", 18, 70);
        Objective2 sinar = new Objective2("Sinar", 18, 70);
        Objective2 sony = new Objective2("Sony", 18, 70);


        Objective2[] objectives = new Objective2[]{canon,fujiFilms,hasselbad,leica,mamiya,olympus,panasonic,polaroid,phaseOne,pentax,gr,rolleiflex,sigma,sinar,sony};

        sort(objectives);
        printnames(objectives);

    }
    public static void printnames(Objective2[] dim) {
        for (int i = 0; i < dim.length; i++) {
            System.out.print(dim[i] + " ");
        }
        System.out.println();
    }

    public static void sort(Objective2[] lens) {
        for (int i = 0; i < lens.length; i++) {
            for (int j = 0; j < lens.length - i - 1; j++) {
                if (lens[j].getProducer().compareTo(lens[j + 1].getProducer()) > 0) {
                    Objective2 temp = lens[j];
                    lens[j] = lens[j + 1];
                    lens[j + 1] = temp;
                }
            }
        }
    }
}
