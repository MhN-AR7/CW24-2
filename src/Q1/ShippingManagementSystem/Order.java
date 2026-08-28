package Q1.ShippingManagementSystem;

public class Order {
    private Long id;
    private double weight;
    private ShippingStrategy strategy;

    public Order(Long id, double weight) {
        this.id = id;
        this.weight = weight;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public ShippingStrategy getStrategy() {
        return strategy;
    }

    public void setStrategy(ShippingStrategy strategy) {
        this.strategy = strategy;
    }

    public void calculateShippingCost() {
        strategy.calculateShippingCost(this);
    }
}
