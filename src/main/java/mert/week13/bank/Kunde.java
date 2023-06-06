package mert.week13.bank;

public class Kunde {
    private long kundenID;
    private String name;

    public String getName() {
        return name;
    }

    public long getKundenID() {
        return kundenID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setKundenID(long kundenID) {
        this.kundenID = kundenID;
    }

    @Override
    public String toString() {
        return "Kunde{" +
                "kundenID=" + kundenID +
                ", name='" + name + '\'' +
                '}';
    }
}
