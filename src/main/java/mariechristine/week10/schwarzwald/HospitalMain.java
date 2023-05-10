package mariechristine.week10.schwarzwald;



public class HospitalMain {
    public static void main(String[] args) {
        Hospital swk = new Hospital("BLACK FOREST HOSPITAL");
        new Station(swk, "X-Ray Station");
        new Station(swk, "Y-Ray Station");
        new Station(swk, "Charles Ray Station");

        swk.printStructure();
        for (int i = 0; i < 8; i++) {
            swk.setNewDay();
        }



    }

}
