package Question06;

abstract class SmartDevice {
    String deviceName;

    public SmartDevice(String name) {
        this.deviceName = name;
    }

    abstract void getStatus();
}