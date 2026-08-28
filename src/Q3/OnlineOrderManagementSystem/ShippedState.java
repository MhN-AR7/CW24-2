package Q3.OnlineOrderManagementSystem;

public class ShippedState implements OrderState{
    private final Order order;

    public ShippedState(Order order) {
        this.order = order;
    }

    @Override
    public void pay() {
        System.out.println("Order Already Paid(Current State: Shipped)");
    }

    @Override
    public void ship() {
        System.out.println("Order Already Shipped(Current State: Shipped)");
    }

    @Override
    public void deliver() {
        order.changeState(new DeliveredState(order));
        System.out.println("Order Delivered Successfully!");
    }

    @Override
    public void cancel() {
        System.out.println("Cannot Cancel Shipped Order!");
    }
}
