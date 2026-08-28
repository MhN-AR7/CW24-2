package Q4.FoodDeliverySystem.strategy;

// Like Navigator
public class DeliveryContext {
    private DeliveryMethod delivery;

    public DeliveryContext(DeliveryMethod delivery) {
        this.delivery = delivery;
    }

    public void setDelivery(DeliveryMethod delivery) {
        this.delivery = delivery;
    }

    public double calculateDeliveryCost() {
        return delivery.calculateCost();
    }
}
