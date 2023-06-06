package mariechristine.week13.model;

public class CustomerAccount {
    private long customer_customerID_fk;
    private long account_accountID_fk;
    private String role;

    public long getCustomer_customerID_fk() {
        return customer_customerID_fk;
    }

    public void setCustomer_customerID_fk(long customer_customerID_fk) {
        this.customer_customerID_fk = customer_customerID_fk;
    }

    public long getAccount_accountID_fk() {
        return account_accountID_fk;
    }

    public void setAccount_accountID_fk(long account_accountID_fk) {
        this.account_accountID_fk = account_accountID_fk;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "CustomerAccount{" +
                "customer_customerID_fk=" + customer_customerID_fk +
                ", account_accountID_fk=" + account_accountID_fk +
                ", role='" + role + '\'' +
                '}';
    }
}
