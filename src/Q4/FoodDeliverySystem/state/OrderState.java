package Q4.FoodDeliverySystem.state;

public interface OrderState {
    void confirm();
    void prepare();
    void ready();
    void deliver();
    void cancel();
}
