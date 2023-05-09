package joachim.week10.hospital;

import java.util.List;
import java.util.Vector;

public class NewHospital {
    private String name;
    private List<Ambulance> ambulanceList;
    private List<Station> stationList;
    private List<Client> clientList;

    public NewHospital(String name){
        this.name = name;
        this.stationList = new Vector<>();
        this.ambulanceList = new Vector<>();
        this.clientList = new Vector<>();
    }

    public Client findOrCreateClient(String name){
        for(Client client : clientList){
            if(client.getName().equals(name)){
                return client;
            }
        }
        Client client = new Client(name);
        clientList.add(client);
        return client;
    }

    public List<Client> getClientList() {
        return clientList;
    }

}
