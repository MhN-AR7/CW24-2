package Q2.RemoteControlSystem;

public class Light implements ElectricDevice{
    @Override
    public void turnOn() {
        System.out.println("Light is ON");
    }

    @Override
    public void turnOff() {
        System.out.println("Light is OFF");
    }
}
