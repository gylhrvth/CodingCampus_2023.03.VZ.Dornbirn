package sandro.week06;

import org.w3c.dom.Text;

import javax.swing.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class CalendarBirthday {
    public static void main(String[] args) {
        GregorianCalendar now = new GregorianCalendar();
        SimpleDateFormat date = new SimpleDateFormat("dd.MM.yyyy");
        SimpleDateFormat year = new SimpleDateFormat("yyyy");


        GregorianCalendar calenderBirthday = new GregorianCalendar();
        boolean readSuccess = false;
        while (!readSuccess) {
            String birthdayText = getInput("Enter your Birthday, in Format = dd.MM.yyyy");
            try {
                Date birthday = date.parse(birthdayText);
                String testText = date.format(birthday);

                if (birthdayText.equals(testText)) {
                    readSuccess = true;
                    calenderBirthday.setTime(birthday);
                }
            } catch (ParseException pe) {
                //pe.printStackTrace();
            }
            if (!readSuccess){
                System.out.println(birthdayText + " is not a valid formated date. Please enter date again.");
            }
        }


        SimpleDateFormat day = new SimpleDateFormat("EEEE");             //EEE = Mi. und EEEE = Mittwoch
        System.out.println(date.format(calenderBirthday.getTime()));
        System.out.println("Your Birthday was/or is a: " + day.format(calenderBirthday.getTime()) + " in the Year of " + year.format(calenderBirthday.getTime()));


    }

    public static String getInput(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        return sc.nextLine();
    }

}
