package LabWeek10;


public class NapoliPizza extends MealDeals{

	private Pizza pizza;
	NapoliPizza(){
		makePizza();
	}

	private void makePizza()
	{
		pizza= new SimplyVegPizza();
		
		pizza = new FetaCheese(pizza);
		pizza = new Spinach(pizza);
		pizza = new RomaTomatoes(pizza);
		pizza = new GreenOlives(pizza);
	}
	
	public Pizza getPizza() {
		return pizza;
	}


}
