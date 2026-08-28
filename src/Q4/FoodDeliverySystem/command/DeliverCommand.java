package Q4.FoodDeliverySystem.command;

import Q4.FoodDeliverySystem.entity.Order;

public class DeliverCommand implements OrderCommand {
    private final Order order;

    public DeliverCommand(Order order) {
        this.order = order;
    }

    @Override
    public void execute() {
        order.deliverOrder();
    }
}
