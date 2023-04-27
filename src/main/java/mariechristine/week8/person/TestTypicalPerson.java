package mariechristine.week8.person;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class TestTypicalPerson {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("ddMMyy");

        ArrayList<TypicalPerson> aL = new ArrayList<>();
        aL.add(new TypicalPerson("Peter Brown", sdf.parse("01051995"), 178, 75.0));
        aL.add(new TypicalPerson("Peter Brown", sdf.parse("01051995"), 178, 75.0));
        aL.add(new TypicalPerson("Peter Brown", sdf.parse("01051995"), 178, 75.0));
        aL.add(new TypicalPerson("Peter Brown", sdf.parse("01051995"), 178, 75.0));
        aL.add(new TypicalPerson("Peter Brown", sdf.parse("01051995"), 178, 75.0));
        aL.add(new TypicalPerson("Peter Brown", sdf.parse("01051995"), 178, 75.0));
        aL.add(new TypicalPerson("Peter Brown", sdf.parse("01051995"), 178, 75.0));
        aL.add(new TypicalPerson("Peter Brown", sdf.parse("01051995"), 178, 75.0));
        aL.add(new TypicalPerson("Peter Brown", sdf.parse("01051995"), 178, 75.0));
        aL.add(new TypicalPerson("Peter Brown", sdf.parse("01051995"), 178, 75.0));

        TypicalPersonStatistics statistics = TypicalPersonStatistics.calculate(aL);
        System.out.println(statistics);
    }


}
