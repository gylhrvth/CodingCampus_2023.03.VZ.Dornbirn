package gyula.woche10.emergency;

import java.util.Calendar;
import java.util.Vector;

public class CallCenter {
    Vector<IEmergency> ressources;

    public CallCenter(){
        ressources = new Vector<>();
    }


    public void addRessource(IEmergency em){
        ressources.add(em);
    }

    public void call(){
        for (IEmergency eg: ressources) {
            if (eg.isFree()){
                eg.alarm();
                eg.start();
                return;
            }
        }
    }
}
