package Q4.FoodDeliverySystem.state;

import Q4.FoodDeliverySystem.entity.Order;

public class ReadyState implements OrderState{
    private final Order order;

    public ReadyState(Order order) {
        this.order = order;
    }

    @Override
    public void confirm() {
        System.out.println("Order is Already Confirmed(Ready)");
    }

    @Override
    public void prepare() {
        System.out.println("Order is Already Prepared(Ready)");
    }

    @Override
    public void ready() {
        System.out.println("Order is Already Ready!");
    }

    @Override
    public void deliver() {
        order.changeState(new DeliveredState(order));
        System.out.println("Order Delivered!");
        System.out.println("Delivery Cost: " + order.getContext().calculateDeliveryCost() + "$");
    }

    @Override
    public void cancel() {
        System.out.println("Cannot Cancel Ready Order!");
    }
}
