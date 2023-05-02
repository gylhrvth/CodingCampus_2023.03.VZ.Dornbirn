package mariechristine.week8.person;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class TestTypicalPerson {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("ddMMyy");

        ArrayList<TypicalPerson> aL = new ArrayList<>();
        aL.add(new TypicalPerson("Peter Brown", 18, 178, 75.0));
        aL.add(new TypicalPerson("Maria Kalt", 20, 178, 77.0));
        aL.add(new TypicalPerson("Harry Smith", 30, 178, 88.5));
        aL.add(new TypicalPerson("Jenny Garden", 45, 178, 79.0));
        aL.add(new TypicalPerson("Hank Tower", 67, 178, 60.5));
        aL.add(new TypicalPerson("Lisa Blum", 19, 178, 67.6));
        aL.add(new TypicalPerson("Berry Ju", 88, 178, 55.5));
        aL.add(new TypicalPerson("Jonny Rage", 24, 178, 95.5));
        aL.add(new TypicalPerson("Mira Slow", 7, 178, 99.0));
        aL.add(new TypicalPerson("Max Griffin", 25, 178, 81.0));

        TypicalPersonStatistics statistics = TypicalPersonStatistics.calculate(aL);
        System.out.println(statistics);
    }


}
