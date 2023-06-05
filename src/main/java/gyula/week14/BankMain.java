package gyula.week14;

import gyula.week14.controller.DBManager;
import gyula.week14.model.Konto;

import java.util.List;

public class BankMain {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        DBManager db = DBManager.getInstance();

        //Konto k = db.kontoOeffnen("Gyula");

        Konto k = db.kontoNachID(7);
        System.out.println(k);
        System.out.println();

        db.kontoAenderung(k, -201);
        System.out.println(k);
        System.out.println();

        List<Konto> kontoList = db.kontoNachInhaber("Gyula");
        System.out.println(kontoList);

        Konto kontoZuSchliessen = db.kontoNachID(6);
        if (kontoZuSchliessen != null) {
            db.kontoSchliessen(kontoZuSchliessen);
        }
        kontoList = db.kontoNachInhaber("Gyula");
        System.out.println(kontoList);
        System.out.println();


        db.disconnect();
    }


}
