import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		new HomeSecurity();
		
/*
		AlarmSystem homeAlarm = new AlarmSystem();
		
		Door door = new Door(Door.typeOfDoor.INNER_DOOR, Door.typeOfMaterial.WOOD, HouseObject.typeOfLock.KEY);
		Door door2 = new Door(Door.typeOfDoor.CELLAR_DOOR, Door.typeOfMaterial.WOOD, HouseObject.typeOfLock.KEY);
		Door door3 = new Door(Door.typeOfDoor.GARAGE_PORT, Door.typeOfMaterial.WOOD, HouseObject.typeOfLock.KEY);

		Window window = new Window(Window.typeOfGlass.SINGLE_GLAZED, HouseObject.typeOfLock.LATCH, 1, true, false);
		
		System.out.println(door);
		System.out.println(door2);
		System.out.println(door3);
		System.out.println(window);
		
		homeAlarm.addSensor(door);
		homeAlarm.addSensor(door2);
		homeAlarm.addSensor(door3);
		
		door.trigger();
		door2.trigger();
		door3.trigger();
		
		List<Sensor> triggeredSensors = homeAlarm.checkSensors();
		for(Sensor sensor: triggeredSensors) {
			if (sensor.isTriggered())
				System.out.println("Alarm is triggered: " + sensor);
		}
		*/
		

	}
}
