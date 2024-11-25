public class Lightbulb implements Device,Switchable,Adjustable,Schedule{
    public String deviceName;
    public String status;
    public String onSchedule;
    public String offSchedule;

    public Lightbulb(String deviceName, String status, String onSchedule, String offSchedule) {
        this.deviceName = deviceName;
        this.status = status;
        this.onSchedule = onSchedule;
        this.offSchedule = offSchedule;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setOnSchedule(String onSchedule) {
        this.onSchedule = onSchedule;
    }

    public void setOffSchedule(String offSchedule) {
        this.offSchedule = offSchedule;
    }

    @Override
    public void increaseSetting() {
        System.out.println("Increasing light (+)");

    }

    @Override
    public void decreaseSetting() {
        System.out.println("Decreasing light (-)");

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
    public void scheduleON(String time) {
        System.out.println(onSchedule);
        System.out.println("Schedule  set: " + time);

    }

    @Override
    public void scheduleOFF(String time) {
        System.out.println(offSchedule);
        System.out.println("Schedule  set: " + time + " turned off..");

    }

    @Override
    public void turnOn() {
        System.out.println("Lightbulb ON");

    }

    @Override
    public void turnOff() {
        System.out.println("Lightbulb OFF");

    }
}
