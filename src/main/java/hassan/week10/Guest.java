package hassan.week10;

public class Guest {
    private String reservationName;
    private int groupSize;

    public Guest(String reservationName, int groupSize) {
        this.reservationName = reservationName;
        this.groupSize = groupSize;
    }

    public String getReservationName() {
        return reservationName;
    }

    public int getGroupSize() {
        return groupSize;
    }
}
