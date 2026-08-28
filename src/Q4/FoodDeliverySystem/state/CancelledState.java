package Q4.FoodDeliverySystem.state;

import Q4.FoodDeliverySystem.entity.Order;

public class CancelledState implements OrderState{
    private final Order order;

    public CancelledState(Order order) {
        this.order = order;
    }

    @Override
    public void confirm() {
        System.out.println("Cannot Confirm Cancelled Order!");
    }

    @Override
    public void prepare() {
        System.out.println("Cannot Prepare Cancelled Order!");
    }

    @Override
    public void ready() {
        System.out.println("Cannot Ready Cancelled Order!");
    }

    @Override
    public void deliver() {
        System.out.println("Cannot Deliver Cancelled Order!");
    }

    @Override
    public void cancel() {
        System.out.println("Order is Already Cancelled!");
    }
}
