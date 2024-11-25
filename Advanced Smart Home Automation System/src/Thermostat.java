public class Thermostat implements  Device,Adjustable,Schedule{

    public String deviceName;
    public String status;
    public float temperatureSetting;
    public String onSchedule;
    public String offSchedule;

    public Thermostat(String deviceName, String status, float temperatureSetting, String onSchedule, String offSchedule) {
        this.deviceName = deviceName;
        this.status = status;
        this.temperatureSetting = temperatureSetting;
        this.onSchedule = onSchedule;
        this.offSchedule = offSchedule;
    }

    @Override
    public void increaseSetting() {
        System.out.println("Temperature " + temperatureSetting + "increasing (+)");
    }

    @Override
    public void decreaseSetting() {
        System.out.println("Temperature " + temperatureSetting + " decreasing (-) ");
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
        System.out.println("Schedule  set: " + time );
    }

    @Override
    public void scheduleOFF(String time) {
        System.out.println(offSchedule);
        System.out.println("Schedule  set: " + time + " turned off..");


    }
}

