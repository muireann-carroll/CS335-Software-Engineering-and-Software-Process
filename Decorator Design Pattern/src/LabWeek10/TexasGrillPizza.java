package LabWeek10;


public class TexasGrillPizza extends MealDeals{

	private Pizza pizza;
	TexasGrillPizza(){
		makePizza();
	}
	private void makePizza()
	{
		pizza= new SimplyVegPizza();
		
		pizza = new Chicken(pizza);
		pizza = new Peppers(pizza);
		pizza = new RedOnions(pizza);
	}
	public Pizza getPizza() {
		return pizza;
	}


}
