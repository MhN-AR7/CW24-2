package Q3.OnlineOrderManagementSystem;

public class Client {
    static void main() {
        Order order = new Order();

        order.payOrder();
        order.shipOrder();
        order.deliverOrder();
    }
}
