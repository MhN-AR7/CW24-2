package Q3.OnlineOrderManagementSystem;

public class Order {
    private OrderState state;

    public Order() {
        this.state = new NewState(this);
    }

    public void changeState(OrderState state) {
        this.state = state;
    }

    public void payOrder() {
        state.pay();
    }

    public void shipOrder() {
        state.ship();
    }

    public void deliverOrder() {
        state.deliver();
    }

    public void cancelOrder() {
        state.cancel();
    }
}
