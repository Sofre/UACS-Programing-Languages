public class Fan implements Device,Switchable,Adjustable{
    public String deviceName;
    public String status;
    public int speedLVL;

    public Fan(String deviceName, String status, int speedLVL) {
        this.deviceName = deviceName;
        this.status = status;
        this.speedLVL = speedLVL;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setSpeedLVL(int speedLVL) {
        this.speedLVL = speedLVL;
    }

    @Override
    public void increaseSetting() {
        System.out.println("Increasing fan speed: " + speedLVL);
    }

    @Override
    public void decreaseSetting() {
        System.out.println("Decreasing fan speed: " + speedLVL);

    }

    @Override
    public String getDeviceName() {
        return deviceName;
    }

    @Override
    public String getStatus() {
        return status;
    }

    @Override
    public void turnOn() {
        System.out.println("Fan ON");
    }

    @Override
    public void turnOff() {
        System.out.println("Fan OFF");

    }
}
