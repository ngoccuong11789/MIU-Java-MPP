package Lab4.PartE;

import java.util.List;

public class Admin {
	public static double computeUpdatedBalanceSum(List<Employee> list) {
		//implement
		double totalBalance = 0.0;
		for (Employee employee : list) {
			System.out.println("computeUpdatedBalanceSum : " + employee.computeUpdatedBalanceSum());
			totalBalance += employee.computeUpdatedBalanceSum();
		}
		return totalBalance;
	}
}
