public class SmartSpeaker implements  Device,Switchable,Adjustable,Schedule{
    public String deviceName;
    public String status;
    public int volumeLVL;
    public String onSchedule;
    public String offSchedule;

    public SmartSpeaker(String deviceName, String status, int volumeLVL, String onSchedule, String offSchedule) {
        this.deviceName = deviceName;
        this.status = status;
        this.volumeLVL = volumeLVL;
        this.onSchedule = onSchedule;
        this.offSchedule = offSchedule;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setVolumeLVL(int volumeLVL) {
        this.volumeLVL = volumeLVL;
    }

    public void setOnSchedule(String onSchedule) {
        this.onSchedule = onSchedule;
    }

    public void setOffSchedule(String offSchedule) {
        this.offSchedule = offSchedule;
    }

    @Override
    public void increaseSetting() {
        System.out.println("Increasing  volume:   " + " >>" + volumeLVL +" <<");
    }

    @Override
    public void decreaseSetting() {
        System.out.println("Decreasing  volume:   " + " >>" + volumeLVL +" <<");

    }

    @Override
    public String getDeviceName() {
        return "";
    }

    @Override
    public String getStatus() {
        return deviceName;
    }

    @Override
    public void scheduleON(String time) {
        System.out.println(onSchedule);
        System.out.println("Schedule  set: " + time );

    }

    @Override
    public void scheduleOFF(String time) {
        System.out.println(offSchedule);
        System.out.println("Schedule set: " + time + " turned off..");
    }

    @Override
    public void turnOn() {
        System.out.println("Speaker ON");
    }

    @Override
    public void turnOff() {
        System.out.println("Speaker OFF");

    }
}

