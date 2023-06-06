package sandro.week13.database;


import sandro.week13.database.tables.Konto;
import sandro.week13.database.tables.Kunden;

import java.sql.Connection;
import java.sql.SQLException;

public class DatabaseMain {
    public static void main(String[] args) throws SQLException {
        DatabaseManager manager = new DatabaseManager();

     //   System.out.println(manager.erstelleKunden("Gyula"));

//        for (Kunden k: manager.kundenListe()) {
//            k.setName(k.getName()+"1");
//            manager.updateKunden(k);
//        }
//
//        System.out.println(manager.kundenListe());

//
//        Konto testkonto = manager.erstelleKonto();
//
//        System.out.println();
//
//        //kunde kommt in die Bank
//        Kunden kurt = manager.erstelleKunden("Kurt");
//
//        //Kurt möchte 3 Konten
//        Konto konto = manager.erstelleKonto();
//        manager.verbindeKundeMitKonto(kurt,konto,"Besitzer");
//
//        Konto konto2 = manager.erstelleKonto();
//        manager.verbindeKundeMitKonto(kurt,konto2,"Berechtigt");
//
//        Konto konto3 = manager.erstelleKonto();
//        manager.verbindeKundeMitKonto(kurt,konto3,"Teil_Besitzer");





    }
}
