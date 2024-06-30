package Lab5.Prob4;

import java.time.LocalDate;

public class CustOrderFactory {
      private CustOrderFactory() {};
      public static Customer createCustomer(String name) {
        return new Customer(name);
      }

      public static Order createOrder(Customer cust, LocalDate date) {
          if(cust == null) throw new NullPointerException("Null customer");
          Order ord = new Order(date);
          cust.addOrder(ord);
          return ord;
      }

    public static Item createItem (String name) {
        return new Item(name);
    }

}
