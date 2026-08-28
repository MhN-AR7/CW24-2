package Q4.FoodDeliverySystem.state;

import Q4.FoodDeliverySystem.entity.Order;

public class NewState implements OrderState{
    private final Order order;

    public NewState(Order order) {
        this.order = order;
    }

    @Override
    public void confirm() {
        order.changeState(new ConfirmedState(order));
        System.out.println("Order Confirmed!");
    }

    @Override
    public void prepare() {
        System.out.println("Cannot Prepare New Order!");
    }

    @Override
    public void ready() {
        System.out.println("Cannot Ready New Order!");
    }

    @Override
    public void deliver() {
        System.out.println("Cannot Deliver New Order!");
    }

    @Override
    public void cancel() {
        order.changeState(new CancelledState(order));
        System.out.println("Order Cancelled!");
    }
}
