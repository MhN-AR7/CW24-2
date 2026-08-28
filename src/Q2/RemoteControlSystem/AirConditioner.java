package Q2.RemoteControlSystem;

public class AirConditioner implements ElectricDevice{
    @Override
    public void turnOn() {
        System.out.println("Air Conditioner is ON");
    }

    @Override
    public void turnOff() {
        System.out.println("Air Conditioner is OFF");
    }
}
