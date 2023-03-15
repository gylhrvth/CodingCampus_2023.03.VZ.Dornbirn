package hassan.week02;
import java.util.*;
public class AtHome {

    public static void main(String[] args) {
            Random rand = new Random();
            int value = rand.nextInt(10000);
            int numGuesses = 0;
            Scanner sc = new Scanner(System.in);

            while (numGuesses < 20) {
                System.out.println("Eratte einen zahl zwischen 0 und 9999: ");
                int guess = sc.nextInt();

                if (guess == value) {
                    System.out.println("Graturliere! Du hast es eratten in " + (numGuesses + 1) + " Versuche.");
                    return;
                }

                int numRichtigeZiffern = 0;
                int numVorhandeneZiffern = 0;
                String valueStr = Integer.toString(value);
                String guessStr = Integer.toString(guess);

                for (int i = 0; i < 4; i++) {
                    if (valueStr.charAt(i) == guessStr.charAt(i)) {
                        numRichtigeZiffern++;
                    } else if (valueStr.indexOf(guessStr.charAt(i)) != -1) {
                        numVorhandeneZiffern++;
                    }
                }

                System.out.println(numRichtigeZiffern + " Ziffern sind richtig und auf dem richtiger platz.");
                System.out.println(numVorhandeneZiffern + " Ziffern sind vorhanden aber auf dem falschen platz.");
                numGuesses++;
            }

            System.out.println("Sorry, Du hast den zahl nicht in 20 versuche eratten. Der zahl war: " + value + ".");
        }
    }


