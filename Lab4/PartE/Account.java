package Lab4.PartE;

public abstract class Account {
    protected String accId;
    protected double balance;

    public Account(String accId, double balance) {
        this.accId = accId;
        this.balance = balance;
    }

    public String getAccountID() {
        return accId;
    }

    public double getBalance() {
        return balance;
    }

    public abstract double computeUpdatedBalance();
}
