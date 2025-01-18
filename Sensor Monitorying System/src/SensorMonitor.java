import java.util.ArrayList;
import java.util.List;

public class SensorMonitor {
    private List<Sensor> sensors;

    public SensorMonitor(){
        sensors = new ArrayList<>();

    }
    public void addSensor(Sensor sensor){
        sensors.add(sensor);
    }
    public void monitorSensors(){
        for (Sensor sensor : sensors){
            System.out.println((sensor.readData()));
        }
    }
}
