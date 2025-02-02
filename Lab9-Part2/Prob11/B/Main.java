package Lab9.Part2.Prob11.B;



import java.util.*;
import java.util.stream.Collectors;


public class Main {

	public static void main(String[] args) {
		List<Employee> emp = Arrays.asList(new Employee("Joe", "Davis", 120000),
				          new Employee("John", "Sims", 110000),
				          new Employee("Joe", "Stevens", 200000),
		                  new Employee("Andrew", "Reardon", 80000),
		                  new Employee("Joe", "Cummings", 760000),
		                  new Employee("Steven", "Walters", 135000),
		                  new Employee("Thomas", "Blake", 111000),
		                  new Employee("Alice", "Richards", 101000),
		                  new Employee("Donald", "Trump", 100000));


		System.out.println(Library.apply(emp,'M',100000));



	}

	public static final TriFunction<List<Employee>, Character, Integer,String> Library = (list, Char, salaryemp) ->
			list.stream().filter(e->e.salary > salaryemp 	&& e.getLastName().charAt(0) > Char)
					.map(e -> e.getFirstName() + " " + e.getLastName())
					.sorted()
					.collect(Collectors.joining(", "));

}
