package Lab2.Prob2.prob2B;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private String orderNumber;
    private List<OrderLine> orderLineList;

    public Order(String orderNumber) {
        this.orderNumber = orderNumber;
        this.orderLineList = new ArrayList<>();
    }

    public void addOrderLine(OrderLine orderLine) {
        orderLineList.add(orderLine);
    }

    public String getOrderNumber() {
        return orderNumber;
    }
    public List<OrderLine> getOrderLineList() {
        return orderLineList;
    }
}
