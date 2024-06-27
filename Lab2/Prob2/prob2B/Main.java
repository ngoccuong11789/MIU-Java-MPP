package Lab2.Prob2.prob2B;

public class Main {
    public static void main(String[] args) {
        Order order = new Order("1");
        OrderLine orderLine1 = new OrderLine("order line 1", order);
        OrderLine orderLine2 = new OrderLine("order line 2", order);

        order.addOrderLine(orderLine1);
        order.addOrderLine(orderLine2);
        System.out.println("Order Number : " + order.getOrderNumber());
        System.out.println("Order line :");

        for(OrderLine orderLine : order.getOrderLineList()) {
            System.out.println(" - " + orderLine.getName());
            System.out.println(" - " + orderLine.getOrder().getOrderNumber());
        }
    }
}
