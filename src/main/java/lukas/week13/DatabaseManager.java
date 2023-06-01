package lukas.week13;

import lukas.week13.model.Account;
import lukas.week13.model.Customer;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DatabaseManager {
    private Connection connection;

    public DatabaseManager(Connection connection) {
        this.connection = connection;
    }

    public Account createAccount() throws SQLException {
        PreparedStatement stmt = connection.prepareStatement("INSERT INTO account () VALUES()", Statement.RETURN_GENERATED_KEYS);
        stmt.executeUpdate();
        ResultSet set = stmt.getGeneratedKeys();
        set.first();
        long primaryKey = set.getLong(1);
        Account a = new Account();
        a.setAccountID(primaryKey);
        set.close();
        stmt.close();
        return a;
    }

    public void connect(Customer customer, Account account, String role) throws SQLException {
        PreparedStatement stmt = connection.prepareStatement("INSERT INTO customerAccount" +
                "(customer_customerID_fk, account_accountID_fk, role)" +
                "VALUES(?, ?, ?)");
        stmt.setLong(1, customer.getCustomerID());
        stmt.setLong(2, account.getAccountID());
        stmt.setString(3, role);
        stmt.executeUpdate();
        stmt.close();
    }

    public Customer createCustomer(String name) throws SQLException {
        PreparedStatement stmt = connection.prepareStatement("INSERT INTO customer (name) VALUES(?)", Statement.RETURN_GENERATED_KEYS);
        try {
            stmt.setString(1, name);
            stmt.executeUpdate();
            ResultSet set = stmt.getGeneratedKeys();
            try {
                set.first();
                long primaryKey = set.getLong(1);
                Customer c = new Customer();
                c.setName(name);
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
        PreparedStatement stmt = connection.prepareStatement("SELECT customerID, name FROM customer");
        ResultSet set = stmt.executeQuery();

        List<Customer> customers = new ArrayList<>();

        while(set.next()) {
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
        PreparedStatement stmt = connection.prepareStatement("UPDATE customer SET name = ? WHERE customerID = ?");
        stmt.setString(1, updateCustomer.getName());
        stmt.setLong(2, updateCustomer.getCustomerID());
        stmt.executeUpdate();
    }
}
