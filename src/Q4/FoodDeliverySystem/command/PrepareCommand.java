package Q4.FoodDeliverySystem.command;

import Q4.FoodDeliverySystem.entity.Order;

public class PrepareCommand implements OrderCommand {
    private final Order order;

    public PrepareCommand(Order order) {
        this.order = order;
    }

    @Override
    public void execute() {
        order.startPreparing();
    }
}
