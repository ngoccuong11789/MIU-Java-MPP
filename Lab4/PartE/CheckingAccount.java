package Lab4.PartE;

public class CheckingAccount extends Account{

    //private double balance;
    private double monthlyFee;
    //private String accId;
    public CheckingAccount(String accId, double fee, double startBalance) {
        super(accId, startBalance);
        this.monthlyFee = fee;
    }


    @Override
    public double computeUpdatedBalance() {
        return balance - monthlyFee;
    }

}
