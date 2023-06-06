package mert.week14;

public class BankMain {
    public static void main(String[] args) {
        DbManager db = DbManager.getInstance();

//        db.kundeErstellen("Gyula");

       Kunde k =  db.kundeNachId(7);
        System.out.println(k);

        Kunde kunde = db.kundeNachId(7);
        if (kunde != null){
            db.KundeLoeschen(kunde);

        }

    }
}
