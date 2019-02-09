package iteratorPackage;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class JUnitTest {

	@Test
	void testMenuItem() {
		System.out.println("\nTesting MenuItem...");
		
		MenuItem menuItem = new MenuItem("PizzaName","PizzaDescription",true,9.99);
		String pizzaName = menuItem.getName();
		String pizzaDescription = menuItem.getDescription();
		boolean pizzaSpicyHot = menuItem.isSpicyHot();
		double pizzaPrice = menuItem.getPrice();
		Assertions.assertEquals("PizzaName",pizzaName);
		Assertions.assertEquals("PizzaDescription",pizzaDescription);
		Assertions.assertEquals(true,pizzaSpicyHot);
		Assertions.assertEquals(9.99,pizzaPrice);
	}
}
























