package mariechristine.week10.schwarzwald;



public class HospitalMain {
    public static void main(String[] args) {
        Hospital bfh = new Hospital("BLACK FOREST HOSPITAL");
        Department rad = new Department("Radiology");
        Department ger = new Department("Geriatrics");
        Department pul = new Department("Pulmonology");
        bfh.addDepartment(rad);
        bfh.addDepartment(ger);
        bfh.addDepartment(pul);


        bfh.printStructure();
        for (int i = 0; i < 8; i++) {
            bfh.setNewDay();
        }



    }

}
