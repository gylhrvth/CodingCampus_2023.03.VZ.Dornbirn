package eric.week10.schwarzwaldKlinik;

public class Patient {
    private String name;
    private String injury;
    private int painMeter;
    private boolean isHealed;

    public Patient(String name, String injury, int painMeter) {
        this.name = name;
        this.injury = injury;
        this.painMeter = painMeter;
        isHealed = false;
    }

    public String getName() {
        return name;
    }

    public int getPainMeter() {
        return painMeter;
    }

    public String getInjury() {
        return injury;
    }

    public void getTreatment() {
        if (isHealed){
            if (painMeter > 90){
                System.out.println("The Patient is in critical condition and cannot leave the hospital");
            }
            if (painMeter > 75){
                System.out.println("The Patient has to stay in the Hospital to be treated");
            }
            if (painMeter > 50){
                System.out.println("The Patient is on his way to get Better");
            }
            if (painMeter > 25){
                System.out.println("The patient will soon be discharged");
            }
            if (painMeter == 0){
                System.out.println("The patient was discharged");
                isHealed = true;
            }
        }
    }
}
