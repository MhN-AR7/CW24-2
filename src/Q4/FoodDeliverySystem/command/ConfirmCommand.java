package Q4.FoodDeliverySystem.command;

import Q4.FoodDeliverySystem.entity.Order;

public class ConfirmCommand implements OrderCommand {
    private final Order order;

    public ConfirmCommand(Order order) {
        this.order = order;
    }

    @Override
    public void execute() {
        order.confirmOrder();
    }
}
