package eric.osterFerien.StringManipulation;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class KalenderDatum {
    public static void main(String[] args) {
        LocalDate heute = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yy");
        String datumString = heute.format(formatter);
        System.out.println("Heute ist der: " + datumString);
    }
}
