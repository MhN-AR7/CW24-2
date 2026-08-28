package Q4.FoodDeliverySystem.state;

import Q4.FoodDeliverySystem.entity.Order;

public class DeliveredState implements OrderState{
    private final Order order;

    public DeliveredState(Order order) {
        this.order = order;
    }

    @Override
    public void confirm() {
        System.out.println("Order is Already Confirmed(Delivered)");
    }

    @Override
    public void prepare() {
        System.out.println("Order is Already Prepared(Delivered)");
    }

    @Override
    public void ready() {
        System.out.println("Order is Already Ready(Delivered)");
    }

    @Override
    public void deliver() {
        System.out.println("Order is Already Delivered!");
    }

    @Override
    public void cancel() {
        System.out.println("Cannot Cancel Delivered Order!");
    }
}
