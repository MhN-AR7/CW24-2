package Q3.OnlineOrderManagementSystem;

public interface OrderState {
    void pay();
    void ship();
    void deliver();
    void cancel();
}
