package gyula.week04;

public class EmailCheck {
    public static void main(String[] args) {
        String testEmail = "gyula.horvath@digitalcampusvorarlberg.at";

        System.out.println("Valid: " + isEmailValid(testEmail));
    }

    public static boolean isEmailValid(String email){
        // TODO: 29.03.23 prüfen ob ein @ Zeichen drin ist 
        // TODO: 29.03.23 Prüfen am Ende die Länderkürzel .de, oder .com???? 
        return false;
    }
}
