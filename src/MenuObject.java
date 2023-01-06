
public class MenuObject {

	protected int menuChoice;
	protected boolean isChoosable;
	protected String menuDescription;
	
	public MenuObject() {
		isChoosable = true;
		menuChoice = Integer.MAX_VALUE;
		menuDescription = "";
	}
	
	public MenuObject( boolean isChoosable ) {
		this();
		this.isChoosable = isChoosable;
		menuDescription = "";
	}
	
	public MenuObject( String description, boolean isChoosable ) {
		this(isChoosable);
		this.menuDescription = description;
	}
	
	public MenuObject( int menuChoice, String description, boolean isChoosable ) {
		this(description, isChoosable);
		this.menuChoice = menuChoice;
	}
}
