package Lab5.Prob4.extpackage;

import Lab5.Prob4.CustOrderFactory;
import Lab5.Prob4.Customer;
import Lab5.Prob4.Order;

import java.time.LocalDate;

//import lesson5.labs.prob4.Customer;
//import lesson5.labs.prob4.Order;

public class Main {
	public static void main(String[] args) {
//		Customer cust = new Customer("Bob");
//		Order order = Order.newOrder(cust, LocalDate.now());
//		order.addItem("Shirt");
//		order.addItem("Laptop");
//
//		order = Order.newOrder(cust, LocalDate.now());
//		order.addItem("Pants");
//		order.addItem("Knife set");
//
//		System.out.println(cust.getOrders());
		Customer cust = CustOrderFactory.createCustomer("Bob");
		Order order = CustOrderFactory.createOrder(cust, LocalDate.now());
		order.addItem(CustOrderFactory.createItem("Shirt"));
		order.addItem(CustOrderFactory.createItem("Laptop"));

		order = CustOrderFactory.createOrder(cust, LocalDate.now());
		order.addItem(CustOrderFactory.createItem("Pants"));
		order.addItem(CustOrderFactory.createItem("Knife set"));
		System.out.println(cust.getOrders());


	}
}

		
