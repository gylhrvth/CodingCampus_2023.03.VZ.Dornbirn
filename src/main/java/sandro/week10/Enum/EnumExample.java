package sandro.week10.Enum;

public class EnumExample {
    public enum Direction {
        UP, DOWN, LEFT, RIGHT
    }

    public static void main(String[] args) {
        Direction d = Direction.UP;

        if (d == Direction.UP){

        } else if (d == Direction.DOWN){

        } else if (d == Direction.LEFT) {

        } else {

        }


        switch (d){
            case UP:
                System.out.println("up");
                break;
            case DOWN:
                System.out.println("down");
                break;
            case LEFT:
                System.out.println("left");
                break;
            default:
                System.out.println("Etwas anderes");
                break;
        }

        switch (d){
            case UP:
            case DOWN:
                System.out.println("up and down");
                break;
            case LEFT:
            default:
                System.out.println("left-right");
                break;
        }


    }
}
