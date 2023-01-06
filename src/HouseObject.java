public abstract class HouseObject implements Sensor {
	
	public enum typeOfLock { NO_LOCK, DIGITAL, KEY, LATCH }	

	protected typeOfLock lockType;
	
	protected int squareMeter;
	protected boolean isOpen;
	protected boolean isLocked;
	
	protected boolean isTriggered = false;

	public HouseObject() {
		squareMeter = 1;
		isOpen = false;
		isLocked = false;
		lockType = typeOfLock.NO_LOCK;
	}
	
	public HouseObject( typeOfLock lockType, int squareMeter, boolean isOpen, boolean isLocked ) {
		this();
		this.lockType = lockType;
		this.squareMeter = squareMeter;
		this.isOpen = isOpen;
		this.isLocked = isLocked;
	}
	
	public abstract String toString();
}
