package Q4.FoodDeliverySystem;

import Q4.FoodDeliverySystem.command.*;
import Q4.FoodDeliverySystem.entity.Order;
import Q4.FoodDeliverySystem.strategy.BikeDelivery;
import Q4.FoodDeliverySystem.strategy.DeliveryContext;

public class Client {
    static void main() {
        DeliveryContext context = new DeliveryContext(new BikeDelivery());

        Order order = new Order(context);

        OrderInvoker invoker = new OrderInvoker();

        invoker.setCommand(new ConfirmCommand(order));
        invoker.executeCommand();

        invoker.setCommand(new PrepareCommand(order));
        invoker.executeCommand();

        invoker.setCommand(new ReadyCommand(order));
        invoker.executeCommand();


        invoker.setCommand(new DeliverCommand(order));
        invoker.executeCommand();
    }
}
