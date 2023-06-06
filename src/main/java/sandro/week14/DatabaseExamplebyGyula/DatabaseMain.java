package sandro.week14.DatabaseExamplebyGyula;

import sandro.week14.Model.Konto;
import sandro.week14.Model.Kunden;
import sandro.week14.Model.KundenKonto;

import java.util.List;
import java.util.Random;

public class DatabaseMain {
public static Random rand = new Random();
    public static void main(String[] args) {


        DBManager db = DBManager.getInstance();

//        Konto k = db.kontoErstellen();
//        System.out.println(k);

//        Kunden kunde = db.kundenErstellen("Mike");
//        System.out.println(kunde);

//        KundenKonto kuko = db.kundenkontoErstellen(120,1017,"Besitzer");
//        System.out.println(kuko);

//        System.out.println("konto nach id");
//        Konto k = db.kontoNachID(120);
//        System.out.println(k);
//        System.out.println();
        System.out.println("kunden nach id");
        Kunden kunde = db.kundeNachID(1017);
        System.out.println(kunde);
        System.out.println();
//        System.out.println("Kundenkonto nach kontoID");
//        KundenKonto kuko = db.kukoNachKoID(120);
//        System.out.println(kuko);
//        System.out.println();
//        System.out.println("Kundenkonto nach KundenID");
//        List<KundenKonto> kukolist = db.kukoNachKuID(1014);
//        System.out.println(kukolist);
//        System.out.println();
//        System.out.println("kundenliste nach name");
//        List<Kunden> kundenList = db.kundeNachName("Mike");
//        System.out.println(kundenList);
//        System.out.println();
//        System.out.println("liste von kontoen nach kontostand");
//        List<Konto> kontoList = db.kontoNachKontostand(0);
//        System.out.println(kontoList);
//        System.out.println();
////        System.out.println("Kundenkonto rolle ändern");
////        KundenKonto kukoZuAendern = db.kukoNachKoID(117);
////        if (kukoZuAendern !=null){
////            db.kundenKontoAenderung(kukoZuAendern,"Berechtigt"+rand.nextInt(1,100));
////        }
////        System.out.println(kukoZuAendern);
////        System.out.println("kunden name ändern");
////        System.out.println("Kunde vor der änderung --> "+db.kundeNachID(1019));
////        Kunden kundeZuAendern = db.kundeNachID(1019);
////        if (kundeZuAendern != null){
////            db.kundenAenderung(kundeZuAendern,"Steve"+ rand.nextInt(1,100));
////        }
//       // System.out.println(kundeZuAendern);
//        System.out.println("kunde nach der änderung --> "+db.kundeNachID(1019));
//        System.out.println();
//        System.out.println("konto ändern");
//        Konto kontoZuAendern = db.kontoNachID(118);
//        if (kontoZuAendern != null){
//            db.kontoAenderung(kontoZuAendern, -150);
//        }
//        System.out.println(kontoZuAendern);
//        System.out.println();
////        System.out.println("Kundenkonto löschen");
////        KundenKonto kundenKontoZuLoeschen = db.kukoNachKoID(116);
////        if (kundenKontoZuLoeschen != null){
////            db.kundenkontoSchliessen(kundenKontoZuLoeschen);
////        }
////        System.out.println();
//
//        System.out.println("Kunden löschen");
//        Kunden kundeZuLoeschen = db.kundeNachID(1016);
//        if (kundeZuLoeschen != null){
//            db.kundeLoeschen(kundeZuLoeschen);
//        }else {
//            System.out.println("kein Kunde unter dieser Nummer gefunden");
//        }
//        System.out.println();
//        System.out.println("konto schließen");
//        //todo was ist wenn konto schon mit kunde verknüpft im KundenKonto, delete nicht möglich wegen foreignKeys !!!
//        Konto kontoZuSchliessen = db.kontoNachID(119);
//        if (kontoZuSchliessen != null){
//            db.kontoSchliessen(kontoZuSchliessen);
//        }
//        System.out.println("liste von Konten nach konto schließen");
//        kontoList = db.kontoNachKontostand(0);
//        System.out.println(kontoList);
//        System.out.println();

        db.disconnect();


    }
}
