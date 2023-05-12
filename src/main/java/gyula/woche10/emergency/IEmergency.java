package gyula.woche10.emergency;

public interface IEmergency {
    public boolean isFree();

    public void alarm();

    public void start();

    public void returnToBase();
}
