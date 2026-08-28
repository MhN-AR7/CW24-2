package Q4.FoodDeliverySystem.entity;

import Q4.FoodDeliverySystem.state.NewState;
import Q4.FoodDeliverySystem.state.OrderState;
import Q4.FoodDeliverySystem.strategy.DeliveryContext;

public class Order {
    private OrderState state;
    private final DeliveryContext context;

    public Order(DeliveryContext context) {
        this.state = new NewState(this);
        this.context = context;
    }

    public void changeState(OrderState state) {
        this.state = state;
    }

    public DeliveryContext getContext() {
        return context;
    }

    public void confirmOrder() {
        state.confirm();
    }

    public void startPreparing() {
        state.prepare();
    }

    public void markAsReady() {
        state.ready();
    }

    public void deliverOrder() {
        state.deliver();
    }

    public void cancelOrder() {
        state.cancel();
    }
}
