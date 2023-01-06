import java.util.NoSuchElementException;
import java.util.Scanner;

public class MenuHandler extends MenuObject {
	
	private Menu menu;
	
	public MenuHandler() {}
	
	public MenuHandler( Menu menu ) {
		this.menu = menu;
	}
	
	public int getMenuChoice() {
        int menuChoice = Integer.MAX_VALUE;
		Scanner scanner = new Scanner(System.in);
        
        while (true)
        {
        	System.out.println(menu);
        	
        	System.out.print("\nEnter choice: ");
            
            try {
            	menuChoice = scanner.nextInt();
            } catch (IllegalStateException | IllegalArgumentException | NoSuchElementException e) {
            	scanner.nextLine();
            }
            
            for(MenuItem menuOptions: menu.getMenuList())
            {
            	if (menuOptions.isChoosable)
            	{
            		if (menuOptions.menuChoice == menuChoice)
            			return menuChoice;
            	}
            }
            
            System.out.println("ERROR: Must enter a valid menuchoice and must be integer value.\n");
        }		
	}

}
