package gyula.week08.webserver;

public class WebServerMain {
    public static void main(String[] args) {
        ServerStatistic stat = new ServerStatistic("DCV WebServer", "Dell XPS 19");
        ServerStatistic mailStat = new ServerStatistic("DCV MailServer", "Dell XPS 19");
        System.out.println("Server has been created.");

        stat.addUser();
        for (int i = 0; i < 12; i++) {
            mailStat.addUser();
        }
        System.out.println("add usage...");
        stat.setRamInGB(-5);
        mailStat.setRamInGB(6);


        System.out.println(stat);
        System.out.println(mailStat);
        System.out.println("Brand: " + mailStat.getBrandName());


    }
}
