
public class MenuItem extends MenuObject {
	
	public MenuItem() {
		super();
	}
	
	public MenuItem( String menuDescription )
	{
		super(menuDescription, false);
	}
	
	public MenuItem( int menuChoice, String menuDescription, boolean isChoosable ) {
		super(menuChoice, menuDescription, isChoosable);
	}
	
	public String toString() {
		String result = (isChoosable) ? "" + menuChoice + " - ": "";
		result += menuDescription;
		return result;
	}
}
