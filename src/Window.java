public class Window extends HouseObject implements Sensor {
	
	public enum typeOfGlass { SINGLE_GLAZED, DOUBLE_GLAZED, TRIPLE_GLAZED, TEMPERED_LAMINATED };
	
	private typeOfGlass glassType;
	
	public Window() {
		super();
	}
	
	public Window( typeOfGlass glassType, typeOfLock lockType, int squareMeter, boolean isOpen, boolean isLocked ) {
		super(lockType, squareMeter, isOpen, isLocked);
		this.glassType = glassType;
	}

	@Override
	public String toString() {
		String result;
		result = glassType + " Window: " + squareMeter + "sqm " + ((isOpen) ? " is Opened" : " is Closed") + ((isLocked) ? " and is Locked" : " and is Unlocked");
		return result;
	}

	@Override
	public void trigger() {
		isTriggered = true;
	}

	@Override
	public void unTrigger() {
		isTriggered = false;
	}

	@Override
	public boolean isTriggered() {
		return isTriggered;
	}	
	
}
