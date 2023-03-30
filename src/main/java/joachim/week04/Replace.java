package joachim.week04;

public class Replace {
    public static void main(String[] args) {
        String text = "Heute wird ein guter Tag! Heute wird ein noch guterer Tag! Heute wird ein spitzen guter Tag!";
        String text2 = "7498132471329847120394871230495871204398712039487";
        System.out.println(words(text, "wird"));
        words2(text, "[a-z]");
        words3(text, "[A-Z]");
        words4(text, "[ ]");
        words5(text, "[!]");
        number(text2, "[0-9]");
        number2(text2, "[1-9]");
        number3(text2, "[2-4]");
        number4(text2, "[1-36-9]");

    }

    public static String words(String text, String regex) {
        String newText = text;
        newText = newText.replace(regex, "war und ist");
        return newText;
    }

    public static void words2(String text, String regex) {
        String newtext = text.replaceAll(regex, "");
        System.out.println(newtext);
    }

    public static void words3(String text, String regex) {
        String newtext = text.replaceAll(regex, "");
        System.out.println(newtext);
    }

    public static void words4(String text, String regex) {
        String newtext = text.replaceAll(regex, "");
        System.out.println(newtext);
    }
    public static void words5(String text, String regex) {
        String newtext = text.replaceAll(regex, "");
        System.out.println(newtext);
    }
    public static void number(String text, String regex) {
        String newtext = text.replaceAll(regex, "");
        System.out.println(newtext);
    }
    public static void number2(String text, String regex) {
        String newtext = text.replaceAll(regex, "");
        System.out.println(newtext);
    }
    public static void number3(String text, String regex) {
        String newtext = text.replaceAll(regex, "");
        System.out.println(newtext);
    }
    public static void number4(String text, String regex) {
        String newtext = text.replaceAll(regex, "");
        System.out.println(newtext);
    }
}


