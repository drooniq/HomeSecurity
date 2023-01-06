import java.util.ArrayList;
import java.util.List;
	
public class Room extends HouseObject implements Sensor {

	List<HouseObject> objectList = new ArrayList<HouseObject>();
	
	public enum typeOfRoom  { BEDROOM, MASTER_BEDROOM, KITCHEN, GARAGE, BASEMENT, DININGAREA, LIVINGROOM, TOILET, COMMUNITYAREA, BATHROOM }
	public enum typeOfLock { DIGITAL, KEY, LATCH }
	
	private typeOfRoom roomType;
	
	private int squareMeter;
	private Phone phone;
	private int floor;
	private String id;

	public Room() {
	}
	
	public Room(String id, typeOfRoom roomType, int squareMeter, int floor)
	{
		this.id = id;
		this.roomType = roomType;
		this.squareMeter = squareMeter;
		this.floor = floor;
	}
	
	public int getSquareMeter() {
		return squareMeter;
	}

	public void setSquareMeter(int squareMeter) {
		this.squareMeter = squareMeter;
	}

	public Phone getPhone() {
		return phone;
	}

	public void setPhone(Phone phone) {
		this.phone = phone;
	}

	public int getFloor() {
		return floor;
	}

	public void setFloor(int floor) {
		this.floor = floor;
	}

	public void addObject(HouseObject houseObject) {
		objectList.add(houseObject);
	}

	public typeOfRoom getRoomType() {
		return roomType;
	}

	public void setRoomType(typeOfRoom roomType) {
		this.roomType = roomType;
	}

	@Override
	public String toString() {
		String result;
		
		result = roomType + ": " + squareMeter + "sqm, floor: " + floor + " id=" + id;
		
		for (HouseObject houseObj: objectList)
		{
			result += "\n" + houseObj;
		}
		
		
		return result;
	}

	public void triggerAlarm()
	{
		System.out.println("The larm has been triggered! " + id);
	}

	@Override
	public boolean isTriggered() {
		return isTriggered;
	}

	@Override
	public void trigger() {
		isTriggered = true;
	}

	@Override
	public void unTrigger() {
		isTriggered = false;
	}
}
