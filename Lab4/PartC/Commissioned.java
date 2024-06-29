package Lab4.PartC;

import java.util.List;

public class Commissioned extends Employee{

    private double commission;
    private double baseSalary;

    private List<Order> orders;
    public Commissioned(String empId, double commission, double baseSalary, List<Order> orders) {
        super(empId);
        this.commission = commission;
        this.baseSalary = baseSalary;
        this.orders = orders;
    }

    @Override
    public double calcGrossPay(int month, int year) {
        double totalOrderAmount = 0.0;
        for (Order order : orders) {
            if((order.getOrderDate().getMonthValue() == month) && (order.getOrderDate().getYear() == year)) {
                totalOrderAmount += order.getOrderAmount();
            }
        }


        double grossPay = baseSalary + (totalOrderAmount * commission);
        return grossPay;

    }

}
