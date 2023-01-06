
public class Intruder {

	public enum typeOfIntruder { HUMAN, BIRD, THINO, KID, CAT }
	
	public enum tool { AXE, BLOWTORCH, CUTTING_TORCH, CROWBAR }
	
	private int temperature;
	private typeOfIntruder intruder;
	private tool breakInTool;
	
	public Intruder() {
	}
	
	public Intruder(int temperature, Intruder.typeOfIntruder intruder, Intruder.tool breakInTool) {
		this.temperature = temperature;
		this.setIntruderType(intruder);
		this.setBreakInTool(breakInTool);
	}

	public int getTemperature() {
		return temperature;
	}

	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}

	public typeOfIntruder getIntruderType() {
		return intruder;
	}

	public void setIntruderType(typeOfIntruder intruder) {
		this.intruder = intruder;
	}

	public tool getBreakInTool() {
		return breakInTool;
	}

	public void setBreakInTool(tool breakInTool) {
		this.breakInTool = breakInTool;
	}
}
