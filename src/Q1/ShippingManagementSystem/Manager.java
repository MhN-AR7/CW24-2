package Q1.ShippingManagementSystem;

public class Manager{
    private ShippingStrategy strategy;

    public Manager(ShippingStrategy strategy) {
        this.strategy = strategy;
    }

    public void calculateShippingCost(Order order) {
        strategy.calculateShippingCost(order);
    }

    public void setStrategy(ShippingStrategy strategy) {
        this.strategy = strategy;
    }
}
