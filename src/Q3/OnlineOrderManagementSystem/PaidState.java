package Q3.OnlineOrderManagementSystem;

public class PaidState implements OrderState{
    private final Order order;

    public PaidState(Order order) {
        this.order = order;
    }

    @Override
    public void pay() {
        System.out.println("Order Already Paid(Current State: Paid)");
    }

    @Override
    public void ship() {
        order.changeState(new ShippedState(order));
        System.out.println("Order Shipped Successfully!");
    }

    @Override
    public void deliver() {
        System.out.println("Cannot Deliver Order(Current State: Paid)");
    }

    @Override
    public void cancel() {
        order.changeState(new CancelledState(order));
        System.out.println("Order Cancelled Successfully!");
    }
}
