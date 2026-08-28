package Q2.RemoteControlSystem;

public class TurnOnCommand implements Command{
    private final ElectricDevice device;

    public TurnOnCommand(ElectricDevice device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.turnOn();
    }
}
