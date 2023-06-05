package mariechristine.week14;

import mariechristine.week13.model.Account;
import mariechristine.week13.model.Customer;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DataBaseManager {

    private Connection connection;

    public DataBaseManager(Connection connection) {
        this.connection = connection;
    }

    public Account createAccount() throws SQLException {
        //SQL Anweisung wird an Datenbank geschickt; vorbereitet
        PreparedStatement stmt = connection.prepareStatement("INSERT INTO account () VALUES()", Statement.NO_GENERATED_KEYS);
        stmt.executeUpdate(); //führt stmt aus; wird verwendet für SQL-Anweisungen die Inhalte manipulieren (INSERT, UPDATE, DELETE)
        ResultSet set = stmt.getGeneratedKeys(); //speichert Daten, die nach der SQL-Anweisung zurückgegeben werden
        set.first();
        long primaryKey = set.getLong(1);
        Account a = new Account();
        a.setAccountID(primaryKey);
        set.close();
        stmt.close();
        return a;
    }

    public Customer createCustomer(String name, String address) throws SQLException {
        PreparedStatement stmt = connection.prepareStatement("insert into kunde (KundenID, Name, Adresse) values (default, ?, ?)", Statement.RETURN_GENERATED_KEYS);
        try {
            stmt.setString(1, name);
            stmt.setString(2, address);
            stmt.executeUpdate();
            ResultSet set = stmt.getGeneratedKeys();
            try {
                set.first();
                long primaryKey = set.getLong(1);
                Customer c = new Customer();
                c.setName(name);
                c.setAddress(address);
                c.setCustomerID(primaryKey);
                return c;
            } finally {
                set.close();
            }
        } finally {
            stmt.close();
        }
    }

    public List<Customer> getCustomers() throws SQLException {
        PreparedStatement stmt = connection.prepareStatement("SELECT KundenID, Name FROM Kunde");
        ResultSet set = stmt.executeQuery(); //executeQuery wird bei SELECT-Abfragen verwendet

        List<Customer> customers = new ArrayList<>();

        while (set.next()) {
            Customer c = new Customer();

            c.setCustomerID(set.getLong(1));
            c.setName(set.getString(2));

            customers.add(c);
        }
        set.close();
        stmt.close();

        return customers;
    }

    public void updateCustomer(Customer updateCustomer) throws SQLException {
        PreparedStatement stmt = connection.prepareStatement("UPDATE Kunde SET Name = ? WHERE KundenID = ?");
        stmt.setString(1, updateCustomer.getName());
        stmt.setLong(2, updateCustomer.getCustomerID());
        stmt.executeUpdate();
    }

    public void connect(Customer customer, Account account, String role) throws SQLException {
        PreparedStatement stmt = connection.prepareStatement("INSERT INTO Konto" +
                "(Konto_KundenID_FK, role)" + "VALUES(?, ?, ?)");
        stmt.setLong(1, customer.getCustomerID());
        stmt.setLong(2, account.getAccountID());
        stmt.setString(3, role);
        stmt.executeUpdate();
        stmt.close();
    }
}
