package Q4.FoodDeliverySystem.command;

import Q4.FoodDeliverySystem.entity.Order;

public class ReadyCommand implements OrderCommand {
    private final Order order;

    public ReadyCommand(Order order) {
        this.order = order;
    }

    @Override
    public void execute() {
        order.markAsReady();
    }
}
