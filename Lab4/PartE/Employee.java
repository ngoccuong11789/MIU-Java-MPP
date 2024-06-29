package Lab4.PartE;

import java.util.ArrayList;
import java.util.List;

public class Employee {

	private String name;
	private List<Account> accounts;

	public Employee(String name) {
		this.name = name;
		this.accounts = new ArrayList<>();
	}

	public String getName() {
		return name;
	}

	public void addAccount(Account account) {
		accounts.add(account);
	}

	public double computeUpdatedBalanceSum() {
		//implement
		double balance = 0.0;
		for (Account account : accounts) {
			balance += account.computeUpdatedBalance();
		}
		System.out.println("balance : " + balance);
		return balance;
	}
}
