package Q2.RemoteControlSystem;

public class TV implements ElectricDevice{
    @Override
    public void turnOn() {
        System.out.println("TV is ON");
    }

    @Override
    public void turnOff() {
        System.out.println("TV is OFF");
    }
}
