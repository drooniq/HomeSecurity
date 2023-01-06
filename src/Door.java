public class Door extends HouseObject implements Sensor {
	
	public enum typeOfDoor { FRONT_DOOR, INNER_DOOR, SLIDING_DOOR, CELLAR_DOOR, GARAGE_DOOR, GARAGE_PORT }
	public enum typeOfMaterial { WOOD, STEEL, FIBERGLASS }
	
	private typeOfDoor doorType;
	private typeOfMaterial material;
	
	public Door() {
		super();
	}
	
	public Door( typeOfDoor doorType, typeOfMaterial material, typeOfLock lockType ) {
		super();
		this.doorType = doorType;
		this.material = material;
	}

	public Door( typeOfDoor doorType, typeOfMaterial material, int squareMeter, boolean isOpen, boolean isLocked ) {
		this(doorType, material, typeOfLock.KEY);
	}
	
	@Override
	public String toString() {
		String result;
		
		result = material + " " + doorType + " : " + squareMeter + "sqm " + ((isOpen) ? " is Opened" : " is Closed") + ((isLocked) ? " and is Locked" : " and is Unlocked");
		
		return result;
	}

	@Override
	public void trigger() {
		isTriggered = true;
	}
	
	public void unTrigger() {
		isTriggered = false;
	}

	@Override
	public boolean isTriggered() {
		return isTriggered;
	}
}
