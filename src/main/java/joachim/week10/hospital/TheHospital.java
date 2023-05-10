package joachim.week10.hospital;

public class TheHospital {
    public static void main(String[] args) {
        NewHospital hospital = new NewHospital("Hospital");

        for (int i = 0; i < 10; i++) {
            hospital.findOrCreateClient(Client.createNames("Client", i));
        }
        System.out.println(hospital.getClientList());
    }
}

