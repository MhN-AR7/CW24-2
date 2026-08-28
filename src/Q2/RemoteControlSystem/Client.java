package Q2.RemoteControlSystem;

public class Client {
    static void main() {
        ElectricDevice tv = new TV();
        ElectricDevice light = new Light();
        ElectricDevice airConditioner = new AirConditioner();

        RemoteControl remoteControl = new RemoteControl();

        remoteControl.setCommand(new TurnOnCommand(tv));
        remoteControl.pressButton();

        remoteControl.setCommand(new TurnOnCommand(light));
        remoteControl.pressButton();

        remoteControl.setCommand(new TurnOffCommand(tv));
        remoteControl.pressButton();

        remoteControl.setCommand(new TurnOnCommand(airConditioner));
        remoteControl.pressButton();

        remoteControl.setCommand(new TurnOffCommand(light));
        remoteControl.pressButton();

        remoteControl.setCommand(new TurnOffCommand(airConditioner));
        remoteControl.pressButton();
    }
}
