package gyula.woche10.emergency;

public abstract class EmergencyGroup implements IEmergency{
    protected boolean inAction;

    protected EmergencyGroup(){
        inAction = false;
    }

    @Override
    public void alarm() {
        System.out.println(this + " has been alarmed. They prepare for the emergency response.");
    }

    @Override
    public boolean isFree() {
        return !inAction;
    }
}
