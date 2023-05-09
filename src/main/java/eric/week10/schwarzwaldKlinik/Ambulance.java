package eric.week10.schwarzwaldKlinik;

public class Ambulance {
    private int opensAt;
    private int closesAt;
    private int amountOfSeats;
    private int amountOfSeatsTaken;

    public Ambulance(int opensAt, int closesAt, int amountOfSeats) {
        this.opensAt = opensAt;
        this.closesAt = closesAt;
        this.amountOfSeats = amountOfSeats;
    }
}
