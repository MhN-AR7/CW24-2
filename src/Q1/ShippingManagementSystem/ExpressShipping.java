package Q1.ShippingManagementSystem;

public class ExpressShipping implements ShippingStrategy{
    @Override
    public void calculateShippingCost(Order order) {
        double calculate = order.getWeight() * 10;
        System.out.println("order shipping in Express shipping. shipping cost : " + calculate);
    }
}
