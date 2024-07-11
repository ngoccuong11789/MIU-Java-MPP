package Lab8.Prob2.A;

import java.util.Comparator;

/* A functor, but not a closure */
public class EmployeeNameComparator implements Comparator<Employee> {
	@Override
	public int compare(Employee e1, Employee e2) {
		int compare = e1.getName().compareTo(e2.getName());
		if (compare != 0) {
			return compare;
		}
		//return e1.name.compareTo(e2.name);
		return Integer.compare(e1.getSalary(), e2.getSalary());
	}
}
