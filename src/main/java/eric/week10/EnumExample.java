package eric.week10;

public class EnumExample {
    enum Abc {ALPHA, BRAVO, CHARLIE};

    public EnumExample() {
    }

    public static void main(String[] args) {
        System.out.println(Abc.ALPHA);
        System.out.println(Abc.BRAVO);
        System.out.println(Abc.CHARLIE);

        Abc value = Abc.BRAVO;
        if (value == Abc.ALPHA){
            System.out.println("Oh nooooo!");
        }

        switch (value){
            case ALPHA:
                System.out.println("Ich bin alpha");
                break;
            case BRAVO:
                System.out.println("Oups");
                break;
            default:
                System.out.println("Etwas anderes");
                break;
        }

        if (value == Abc.ALPHA){

        } else if (value == Abc.BRAVO){

        } else {

        }
    }
}
