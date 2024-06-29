package Lab4.PartC;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Order> orders = new ArrayList<>();
        orders.add(new Order(LocalDate.of(2024, 5, 10), 3000, 1));
        orders.add(new Order(LocalDate.of(2024, 5, 20), 5000, 2));
        orders.add(new Order(LocalDate.of(2024, 6, 15), 7000, 2));

        Employee hourlyEmployee = new Hourly("E001", 15.0, 40);
        Employee salariedEmployee = new Salaried("E002", 3000);
        Employee comissionedEmployee = new Commissioned("E003", 0.1,1500, orders);

        System.out.println("Hourly Employee Paycheck for May 2024:");
        Paycheck hourlyPaycheckMay = hourlyEmployee.calcCompensation(5, 2024);
        hourlyPaycheckMay.print();

        System.out.println("\nSalaried Employee Paycheck for May 2024:");
        Paycheck salariedPaycheckMay = salariedEmployee.calcCompensation(5, 2024);
        salariedPaycheckMay.print();

        System.out.println("\nCommissioned Employee Paycheck for May 2024:");
        Paycheck commissionedPaycheckMay = comissionedEmployee.calcCompensation(5, 2024);
        commissionedPaycheckMay.print();

        System.out.println("\nCommissioned Employee Paycheck for June 2024:");
        Paycheck commissionedPaycheckJune = comissionedEmployee.calcCompensation(6, 2024);
        commissionedPaycheckJune.print();

    }
}
