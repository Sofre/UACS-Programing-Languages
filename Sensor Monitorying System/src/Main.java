public class Main {
    public static void main(String[] args) {
        SensorMonitor monitor = new SensorMonitor();

        monitor.addSensor(new TemeratureSensor());
        monitor.addSensor(new HumiditySensor());

        monitor.monitorSensors();
    }

}
