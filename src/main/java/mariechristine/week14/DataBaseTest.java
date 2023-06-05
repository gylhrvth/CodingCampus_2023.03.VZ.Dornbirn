package mariechristine.week14;

import mariechristine.week13.DataBase;
import mariechristine.week13.model.Customer;

import java.sql.Connection;
import java.sql.SQLException;

public class DataBaseTest {
    public static void main(String[] args) throws SQLException {
        DataBase dataBase = new DataBase();
        dataBase.connect();

        Connection connection = dataBase.getConn();

        DataBaseManager manager = new DataBaseManager(connection);

        System.out.println(manager.createCustomer("Thea", "Straße 5, Dornbirn"));

        System.out.println(manager.getCustomers());

        for (Customer c : manager.getCustomers()) {
            c.setName(c.getName() + "1");
        }

    }
}
