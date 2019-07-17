public class TurnTVOff implements Command {

    ElectronicDevice electronicDevice;

    public TurnTVOff(ElectronicDevice electronicDevice) {
        this.electronicDevice = electronicDevice;
    }

    @Override
    public void execute() {
        electronicDevice.off();
    }

    @Override
    public void undo() {
        electronicDevice.off();

    }
}
