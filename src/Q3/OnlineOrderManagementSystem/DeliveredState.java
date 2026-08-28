package Q3.OnlineOrderManagementSystem;

public class DeliveredState implements OrderState{
    private final Order order;

    public DeliveredState(Order order) {
        this.order = order;
    }

    @Override
    public void pay() {
        System.out.println("Order Already Paid(Current State: Delivered)");
    }

    @Override
    public void ship() {
        System.out.println("Order Already Shipped(Current State: Delivered)");
    }

    @Override
    public void deliver() {
        System.out.println("Order Already Delivered(Current State: Delivered)");
    }

    @Override
    public void cancel() {
        System.out.println("Cannot Cancel Delivered Order!");
    }
}
