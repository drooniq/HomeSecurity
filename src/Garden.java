
public class Garden extends HouseObject implements Sensor {

	private int squareMeter;
	private boolean isTriggered = false;
	
	public Garden() {}

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

	@Override
	public String toString() {
		return "Garden: " + squareMeter + "sqm. ";
	}
}
