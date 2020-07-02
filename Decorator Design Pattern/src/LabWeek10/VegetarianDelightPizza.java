package LabWeek10;


public class VegetarianDelightPizza extends MealDeals{

	private Pizza pizza;
	VegetarianDelightPizza(){
		makePizza();
	}
	private void makePizza()
	{
		pizza= new SimplyVegPizza();
		
		pizza = new Spinach(pizza);
		pizza = new RedOnions(pizza);
		pizza = new GreenOlives(pizza);
		pizza = new Broccoli(pizza);
	}
	public Pizza getPizza() {
		return pizza;
	}


}
