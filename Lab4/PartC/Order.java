package Lab4.PartC;

import java.time.LocalDate;

public class Order {

    private int orderNo;
    private LocalDate orderDate;
    private double orderAmount;

    public Order(LocalDate orderDate, double orderAmount, int orderNo) {
        this.orderDate = orderDate;
        this.orderAmount = orderAmount;
        this.orderNo = orderNo;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public double getOrderAmount() {
        return orderAmount;
    }

}
