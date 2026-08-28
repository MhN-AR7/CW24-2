package Q1.ShippingManagementSystem;

public class MainApp {
    static void main() {
        Order order = new Order(1L, 5);
        ShippingStrategy standardStrategy = new StandardShipping();
        ShippingStrategy expressStrategy = new ExpressShipping();
        ShippingStrategy sameDayStrategy = new SameDayShipping();


        Manager manager = new Manager(standardStrategy);
        manager.calculateShippingCost(order);
        System.out.println("------------");
        manager.setStrategy(expressStrategy);
        manager.calculateShippingCost(order);
        System.out.println("------------");
        manager.setStrategy(sameDayStrategy);
        manager.calculateShippingCost(order);

    }
}
