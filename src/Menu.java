import java.util.ArrayList;
import java.util.List;

public class Menu extends MenuObject {

	private List<MenuItem> menuList = new ArrayList<MenuItem>();
	
	private String menuName;
	
	public Menu( String menuName ) {
		this.menuName = menuName;
	}

	public List<MenuItem> getMenuList() {
		return menuList;
	}
	
	public void addMenuOption ( MenuItem menuOption ) {
		menuList.add(menuOption);
	}
	
	public String toString() {
		String result = "\n" + menuName + "\n----------------------\n";
		for (MenuItem menu: menuList) {
			result += menu + "\n";
		}
		return result;
	}
	
}
