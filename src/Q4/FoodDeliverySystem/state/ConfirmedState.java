package Q4.FoodDeliverySystem.state;

import Q4.FoodDeliverySystem.entity.Order;

public class ConfirmedState implements OrderState{
    private final Order order;

    public ConfirmedState(Order order) {
        this.order = order;
    }

    @Override
    public void confirm() {
        System.out.println("Order is Already Confirmed!");
    }

    @Override
    public void prepare() {
        order.changeState(new PreparingState(order));
        System.out.println("Order Preparing...");
    }

    @Override
    public void ready() {
        System.out.println("Cannot Ready Confirmed Order!");
    }

    @Override
    public void deliver() {
        System.out.println("Cannot Deliver Confirmed Order!");
    }

    @Override
    public void cancel() {
        order.changeState(new CancelledState(order));
        System.out.println("Order Cancelled!");
    }
}
