package Q1.ShippingManagementSystem;

public class SameDayShipping implements ShippingStrategy {
    @Override
    public void calculateShippingCost(Order order) {
        double calculate = order.getWeight() * 15;
        System.out.println("order shipping in Same_Day shipping. shipping cost : " + calculate);
    }
}