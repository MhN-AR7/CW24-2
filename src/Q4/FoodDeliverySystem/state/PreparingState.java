package Q4.FoodDeliverySystem.state;

import Q4.FoodDeliverySystem.entity.Order;

public class PreparingState implements OrderState{
    private final Order order;

    public PreparingState(Order order) {
        this.order = order;
    }

    @Override
    public void confirm() {
        System.out.println("Order is Already Confirmed(Preparing...)");
    }

    @Override
    public void prepare() {
        System.out.println("Order is Already Preparing...");
    }

    @Override
    public void ready() {
        order.changeState(new ReadyState(order));
        System.out.println("Order is Ready!");
    }

    @Override
    public void deliver() {
        System.out.println("Cannot Deliver Preparing Order!");
    }

    @Override
    public void cancel() {
        System.out.println("Cannot Cancel Preparing Order!");
    }
}
