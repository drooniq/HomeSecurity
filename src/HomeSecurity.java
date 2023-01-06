import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class HomeSecurity {

	public enum menuChoices { TOGGLE_ALL_LARMS, SIMULATE_BREAKIN, RESET_LARM,
		EXIT_PROGRAM, PANICK_LARM, LIST_OBJECTS, CHECK_SENSORS  };

	private String[] menuOptions = {"Exit program\n", "Activate/Unactivate all larms","Simulate breakin","Reset larm\n", 
									"Activate Panik Larm(master bedroom)", "List all objects in house\n", "Check sensors"};
	
	private List<HouseObject> listOfObjects = new ArrayList<HouseObject>();
	
	private AlarmSystem homeAlarm = new AlarmSystem();
	
	private Menu menu;
	
	public HomeSecurity() 
	{
		setupHouse();
		handleMenu();
	}
	
	private void setupHouse() {
		// 	public Room(String id, typeOfRoom roomType, int squareMeter, int floor)
		//	public Door( typeOfDoor doorType, typeOfMaterial material,
		//		int squareMeter, boolean isOpen, boolean isLocked ) {

		Room kitchen = new Room("Kitchen", Room.typeOfRoom.KITCHEN, 10, 1);
		add(kitchen);
		
		Door door = new Door(Door.typeOfDoor.FRONT_DOOR, Door.typeOfMaterial.STEEL,10,false,false);
		add(door);
		
	}
	
	// add a new houseobject to list of objects (ie, door, window, room, phone, etc)
	private void add(HouseObject houseObject) {
		listOfObjects.add(houseObject);
		homeAlarm.addSensor(houseObject);
	}
	
	private void handleMenu()
	{
		boolean isDone = false;
		boolean isAllTriggered = false;
		
		while (!isDone) {
			
			switch (getMenuChoice()) {
			// enable/disable a larm
			case TOGGLE_ALL_LARMS:
				System.out.println("\nTRIGGERING/UNTRIGGERING ALL LARMS: ");
				isAllTriggered = !isAllTriggered;
				triggerAll(isAllTriggered);
				break;
			// create intruder
			// activate larm if intruder was successful
			case SIMULATE_BREAKIN:
				System.out.println("\nSIMULATE BREAKIN: ");
				break;
			// untrigger an alarm.
			case RESET_LARM:
				System.out.println("\nRESET LARM: ");
				break;
			case PANICK_LARM:
				System.out.println("\nPANICK LARM: ");
				break;
			case EXIT_PROGRAM:
				System.out.println("\n\nEnding program....");
				isDone  = true;
				break;
			case LIST_OBJECTS:
				System.out.println("\nLISTING OBJECTS: ");
				listAllObjects();
				break;
			case CHECK_SENSORS:
				System.out.println("\nLISTING TRIGGERED ALARMS: ");
				listAllTriggeredObjects();
				break;
			}
		}
	}
	
	private void listAllObjects() {
		for(HouseObject houseObj: listOfObjects)
			System.out.println(houseObj);
	}
	
	private void listAllTriggeredObjects() {
		for(Sensor sensor: homeAlarm.checkSensors())
			if(sensor.isTriggered())
				System.out.println(sensor);
	}

	private void triggerAll(boolean doAll) {
		for (HouseObject houseObj : listOfObjects) {
			if (doAll)
				((Sensor) houseObj).trigger();
			else
				((Sensor) houseObj).unTrigger();
		}		
	}	
	
	private menuChoices getMenuChoice() {
        int menuOption = Integer.MAX_VALUE;
		Scanner scanner = new Scanner(System.in);
		
		menu = new Menu("Main Menu");
		
    	for(int i = 0; i < menuOptions.length; i++)
    		menu.addMenuOption(new MenuItem(i, menuOptions[i], true));
		
        while (true)
        {       	
        	
        	System.out.println(menu);
        	
        	System.out.print("Enter choice: ");
            
            try {
            	menuOption = scanner.nextInt();
            } catch (IllegalStateException | IllegalArgumentException | NoSuchElementException e) {
            	scanner.nextLine();
            }
            
            switch( menuOption )
            {
            case 0:
            	scanner.close();
            	return menuChoices.EXIT_PROGRAM;
            case 1:
            	return menuChoices.TOGGLE_ALL_LARMS;
            case 2:
            	return menuChoices.SIMULATE_BREAKIN;
            case 3:
            	return menuChoices.RESET_LARM;
            case 4:
            	return menuChoices.PANICK_LARM;
            case 5:
            	return menuChoices.LIST_OBJECTS;
            case 6:
            	return menuChoices.CHECK_SENSORS;
            default:
            	System.out.println("\n*** You entered an invalid choice (integer expected and within choices possible). ***\n\n");
            }
        }		
	}
	
}
