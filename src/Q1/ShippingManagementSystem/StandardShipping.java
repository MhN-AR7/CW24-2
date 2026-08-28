package Q1.ShippingManagementSystem;

public class StandardShipping implements ShippingStrategy {
    @Override
    public void calculateShippingCost(Order order) {
        double calculate = order.getWeight() * 5;
        System.out.println("order shipping in standard shipping. shipping cost : " + calculate);
    }
}
