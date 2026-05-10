package Question06;

public class SmartSpeaker extends SmartDevice implements WiConnectable, VoiceControllable {
    
    public SmartSpeaker(String name) {
        super(name);
    }

    @Override
    public void connectToWifi() {
        System.out.println(deviceName + " successfully connected to Home-WiFi.");
    }

    @Override
    public void processCommand(String command) {
        System.out.println(deviceName + " is executing command: " + command);
    }

    @Override
    void getStatus() {
        System.out.println("Device: " + deviceName + " | Status: Active");
    }
}