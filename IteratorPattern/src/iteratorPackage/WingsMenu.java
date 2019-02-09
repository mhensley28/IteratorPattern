package iteratorPackage;

import java.util.Iterator;

public class WingsMenu implements Menu{
	static final int MAX_ITEMS = 4;
	int numberOfItems = 0;
	MenuItem[] menuItems;
  
	public WingsMenu() {
		menuItems = new MenuItem[MAX_ITEMS];
 
		addItem("Buffalo Wings Hot",
			"Hot Buffalo Sauce", true, 3.99);
		addItem("Cajun Style Wings",
			"Alligator Meat", true, 3.99);
		addItem("Plain Bone Out Wings",
			"Basically Nuggets", false, 2.99);
		addItem("Only Dropped Once Wings",
			"Garanteed to have touched the floor no more than once, Flavor of the day",
			false, 5.99);

	}
  
	public void addItem(String name, String description, 
	                     boolean spicyHot, double price) 
	{
		MenuItem menuItem = new MenuItem(name, description, spicyHot, price);
		if (numberOfItems >= MAX_ITEMS) {
			System.err.println("Sorry, menu is full!  Can't add item to menu");
		} else {
			menuItems[numberOfItems] = menuItem;
			numberOfItems = numberOfItems + 1;
		}
	}
 
	public MenuItem[] getMenuItems() {
		return menuItems;
	}
  
	public Iterator<MenuItem> createIterator() {
		return new WingsMenuIterator(menuItems);
	}
}
