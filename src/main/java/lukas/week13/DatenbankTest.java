package lukas.week13;

import lukas.week13.model.Account;
import lukas.week13.model.Customer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DatenbankTest {
    public static void main(String[] args) throws SQLException {
        Database database = new Database();

        database.connect();

        Connection connection = database.getConn();

        DatabaseManager manager = new DatabaseManager(connection);

        System.out.println(manager.createCustomer("Sandroid"));

        System.out.println(manager.getCustomers());

        for(Customer c : manager.getCustomers()) {
            c.setName(c.getName()+"1");
            manager.updateCustomer(c);
        }


        //Kunde kommt in die Bank
        Customer kurt = manager.createCustomer("Kurt");

        //Kurt möchte 3 konten
        Account account = manager.createAccount();
        manager.connect(kurt, account, "Besitzer");

        account = manager.createAccount();
        manager.connect(kurt, account, "Pate");

        account = manager.createAccount();
        manager.connect(kurt, account, "Zeichnungsberechtigt");



//        System.out.println(stmt.getGeneratedKeys().getLong(1));

        database.disconnect();
    }
}
