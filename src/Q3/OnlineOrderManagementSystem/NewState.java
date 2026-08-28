package Q3.OnlineOrderManagementSystem;

public class NewState implements OrderState{
    private final Order order;

    public NewState(Order order) {
        this.order = order;
    }

    @Override
    public void pay() {
        order.changeState(new PaidState(order));
        System.out.println("Order Paid Successfully!");
    }

    @Override
    public void ship() {
        System.out.println("Cannot Ship Order(Current State: New)");
    }

    @Override
    public void deliver() {
        System.out.println("Cannot Deliver Order(Current State: New)");
    }

    @Override
    public void cancel() {
        order.changeState(new CancelledState(order));
        System.out.println("Order Cancelled Successfully!");
    }
}
