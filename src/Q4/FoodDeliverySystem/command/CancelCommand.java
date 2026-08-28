package Q4.FoodDeliverySystem.command;

import Q4.FoodDeliverySystem.entity.Order;

public class CancelCommand implements OrderCommand {
    private final Order order;

    public CancelCommand(Order order) {
        this.order = order;
    }

    @Override
    public void execute() {
        order.cancelOrder();
    }
}
