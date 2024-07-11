package Lab8.Prob6;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.Comparator;

public class Examples {
    public static void main(String[] args) {
        // A. (Employee e) -> e.getName()
        Function<Employee, String> getName1 = (Employee e) -> e.getName();
        Function<Employee, String> getName2 = Employee::getName; // Method reference type: Class::instanceMethod

        // B. (Employee e, String s) -> e.setName(s)
        BiConsumer<Employee, String> setName1 = (Employee e, String s) -> e.setName(s);
        BiConsumer<Employee, String> setName2 = Employee::setName; // Method reference type: Class::instanceMethod

        // C. (String s1, String s2) -> s1.compareTo(s2)
        BiFunction<String, String, Integer> compareTo1 = (String s1, String s2) -> s1.compareTo(s2);
        BiFunction<String, String, Integer> compareTo2 = String::compareTo; // Method reference type: Class::instanceMethod

        // D. (Integer x, Integer y) -> Math.pow(x, y)
        BiFunction<Integer, Integer, Double> pow1 = (Integer x, Integer y) -> Math.pow(x, y);
        BiFunction<Integer, Integer, Double> pow2 = Math::pow; // Method reference type: Class::staticMethod

        // E. (Apple a) -> a.getWeight()
        Function<Apple, Double> getWeight1 = (Apple a) -> a.getWeight();
        Function<Apple, Double> getWeight2 = Apple::getWeight; // Method reference type: Class::instanceMethod

        // F. (String x) -> Integer.parseInt(x)
        Function<String, Integer> parseInt1 = (String x) -> Integer.parseInt(x);
        Function<String, Integer> parseInt2 = Integer::parseInt; // Method reference type: Class::staticMethod

        // G. (Employee e1, Employee e2) -> comp.compare(e1, e2)
        EmployeeNameComparator comp = new EmployeeNameComparator();
        Comparator<Employee> compare1 = (Employee e1, Employee e2) -> comp.compare(e1, e2);
        Comparator<Employee> compare2 = comp::compare; // Method reference type: instance::instanceMethod
    }
}

class Employee {
    private String name;
    private int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', salary=" + salary + '}';
    }
}

class EmployeeNameComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        return e1.getName().compareTo(e2.getName());
    }
}

class Apple {
    private double weight;

    public Apple(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }
}

