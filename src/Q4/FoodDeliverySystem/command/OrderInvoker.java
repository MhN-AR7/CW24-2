package Q4.FoodDeliverySystem.command;

// Like Remote Control
public class OrderInvoker {
    private OrderCommand command;

    public OrderInvoker() {
    }

    public void setCommand(OrderCommand command) {
        this.command = command;
    }

    public void executeCommand() {
        command.execute();
    }
}
