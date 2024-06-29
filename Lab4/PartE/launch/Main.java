package Lab4.PartE.launch;

import Lab4.PartE.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//import prob2.*;

/** This class tests the code package */
public class Main {
    // Uncomment when you are ready to test your code
	public static void main(String[] args) {
		Account[] someCheckingAccounts = new CheckingAccount[2];
		someCheckingAccounts[0] = new CheckingAccount("231-471", 25.00, 100);
		someCheckingAccounts[1] = new CheckingAccount("446-973", 25.00, 200);
		Account[] someSavingsAccounts = new SavingsAccount[3];
		someSavingsAccounts[0] = new SavingsAccount("44-8123", 0.03, 200);
		someSavingsAccounts[1] = new SavingsAccount("21-9672", 0.03, 200);
		someSavingsAccounts[2] = new SavingsAccount("68-0902", 0.04, 600);


		Employee e1 = new Employee("Joe");
		Employee e2 = new Employee("Ralph");
		Employee e3 = new Employee("Tom");

			e1.addAccount(someCheckingAccounts[0]);
			e1.addAccount(someSavingsAccounts[0]);
			e2.addAccount(someCheckingAccounts[1]);
			e2.addAccount(someSavingsAccounts[1]);
			e3.addAccount(someSavingsAccounts[2]);

		List<Employee> employees = new ArrayList<>();
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);

		System.out.println(Admin.computeUpdatedBalanceSum(employees));

//		Employee e1 = new Employee("John");
//		Employee e2 = new Employee("Jane");
//
//		CheckingAccount ca1 = new CheckingAccount("CA1", 5, 1000);
//		SavingsAccount sa1 = new SavingsAccount("SA1", 0.05, 2000);
//
//		CheckingAccount ca2 = new CheckingAccount("CA2", 10, 1500);
//		SavingsAccount sa2 = new SavingsAccount("SA2", 0.02, 3000);
//
//		e1.addAccount(ca1);
//		e1.addAccount(sa1);
//
//		e2.addAccount(ca2);
//		e2.addAccount(sa2);
//
//		Admin admin = new Admin();
//		double totalBalanceSum = Admin.computeUpdatedBalanceSum(Arrays.asList(e1, e2));
//
//		System.out.println("Total Updated Balance Sum: " + totalBalanceSum);


	}

}
