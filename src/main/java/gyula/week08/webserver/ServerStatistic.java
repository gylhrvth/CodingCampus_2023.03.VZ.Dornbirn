package gyula.week08.webserver;

public class ServerStatistic {
    private String serverName;
    private String brandName;
    private int ramInGB;
    private long userToday;

    public ServerStatistic(String serverName, String brandName){
        this.serverName = serverName;
        this.brandName = brandName;
        this.ramInGB = 0;
        this.userToday = 0;
    }

    public void addUser(){
        ++userToday;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setRamInGB(int ramInGB) {
        if (ramInGB < 2){
            System.out.println("Not enough RAM for a server.");
        } else {
            this.ramInGB = ramInGB;
        }
    }

    @Override
    public String toString() {
        return serverName + " (" + ramInGB + " GByte RAM, daily users: " + userToday + ")";
    }
}
