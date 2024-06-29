package Lab4.PartE;

public class SavingsAccount extends Account{

    private double interestRate;

    public SavingsAccount(String accId, double interestRate, double startBalance) {
        super(accId, startBalance);
        this.interestRate = interestRate;
    }

    @Override
    public double computeUpdatedBalance() {
        return balance + (interestRate * balance);
    }


}
