import java.util.ArrayList;
import java.util.List;

public class AlarmSystem {
	
	private List<Sensor> listOfSensors = new ArrayList<Sensor>();
	
	public AlarmSystem() {
	}
	
	public void addSensor( Sensor newSensor ) {
		listOfSensors.add(newSensor);
	}
	
	public void removeSensor( Sensor delSensor) {
		listOfSensors.remove( delSensor );
	}
	
	// return a list of triggered sensors
	public List<Sensor> checkSensors() {
		List<Sensor> triggeredSensors = new ArrayList<Sensor>();
		for(Sensor sensor: listOfSensors)
		{
			if (sensor.isTriggered())
				triggeredSensors.add(sensor);
		}
		return triggeredSensors;
	}
}
