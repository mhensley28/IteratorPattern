package iteratorPackage;
import java.util.ArrayList;

public class PizzaMenu_Main {

	public static void main(String[] args) {
		LuxuryPizzaEstateMenu luxuryPizzaEstateMenu = new LuxuryPizzaEstateMenu();
		WingsMenu wingsMenu = new WingsMenu();
		ArrayList<Menu> menus = new ArrayList<Menu>();
		menus.add(luxuryPizzaEstateMenu);
		menus.add(wingsMenu);
		DeliveryDriver deliveryDriver = new DeliveryDriver(menus);
		deliveryDriver.printMenu();
		//adding and removing menus
		System.out.println("\n");
		menus.remove(wingsMenu);
		deliveryDriver.printMenu();
		System.out.println("\n");
		menus.add(wingsMenu);
		menus.remove(luxuryPizzaEstateMenu);
		deliveryDriver.printMenu();
		menus.add(luxuryPizzaEstateMenu);
		deliveryDriver.printMenu();
		menus.remove(luxuryPizzaEstateMenu);
		menus.remove(wingsMenu);
		menus.add(luxuryPizzaEstateMenu);
		menus.add(wingsMenu);
		deliveryDriver.printMenu();
	}

}
