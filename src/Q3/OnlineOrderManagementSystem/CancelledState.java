package Q3.OnlineOrderManagementSystem;

public class CancelledState implements OrderState{
    private Order order;

    public CancelledState(Order order) {
        this.order = order;
    }

    @Override
    public void pay() {
        System.out.println("Cannot Pay Cancelled Order!");
    }

    @Override
    public void ship() {
        System.out.println("Cannot Ship Cancelled Order!");
    }

    @Override
    public void deliver() {
        System.out.println("Cannot Deliver Cancelled Order!");
    }

    @Override
    public void cancel() {
        System.out.println("Order Already Cancelled!");
    }
}
