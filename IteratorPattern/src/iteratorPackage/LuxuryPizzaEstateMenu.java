package iteratorPackage;

import java.util.ArrayList;
import java.util.Iterator;

public class LuxuryPizzaEstateMenu implements Menu{
	ArrayList<MenuItem> menuItems;
	 
	public LuxuryPizzaEstateMenu() {
		menuItems = new ArrayList<MenuItem>();
    
		addItem("Kilauean Charred Pizza", 
			"Melted Cheese, Pineapple, copious carcinogens", 
			true,
			9.99);
 
		addItem("Everest Cold Pizza", 
			"Frozen Cheese, Lentils, himalayan salt", 
			false,
			9.99);
 
		addItem("Pepperoni Pizza",
			"Regular Cheese, Pepperoni, pinch of boring",
			false,
			8.99);
 
		addItem("Meat Lovers' Pizza",
			"Meat, More Meat, heart disease",
			true,
			10.99);
	}

	public void addItem(String name, String description,
	                    boolean vegetarian, double price)
	{
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		menuItems.add(menuItem);
	}
 
	public ArrayList<MenuItem> getMenuItems() {
		return menuItems;
	}
  
	public Iterator<MenuItem> createIterator() {
		return menuItems.iterator();
	}
}
