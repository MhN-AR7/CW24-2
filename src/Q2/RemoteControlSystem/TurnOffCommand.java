package Q2.RemoteControlSystem;

public class TurnOffCommand implements Command{
    private final ElectricDevice device;

    public TurnOffCommand(ElectricDevice device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.turnOff();
    }
}
