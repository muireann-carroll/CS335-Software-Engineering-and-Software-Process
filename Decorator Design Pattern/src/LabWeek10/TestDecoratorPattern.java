package LabWeek10;
import java.text.DecimalFormat;

public class TestDecoratorPattern {
	
	public static void main(String[] args) {
		
		DecimalFormat dformat = new DecimalFormat("#.##");
		Pizza pizza = new SimplyVegPizza();
		
		pizza = new RomaTomatoes(pizza);
		pizza = new GreenOlives(pizza);
		pizza = new Spinach(pizza);
		
		System.out.println("Desc: "+pizza.getDesc());
		System.out.println("Price: "+dformat.format(pizza.getPrice()));
		
		pizza = new SimplyNonVegPizza();
		
		pizza = new Meat(pizza);
		pizza = new Cheese(pizza);
		pizza = new Cheese(pizza);
		pizza = new Ham(pizza);
		
		MealDeals mealDealT= new TexasGrillPizza();
		System.out.println("Desc: "+mealDealT.getPizza().getDesc());
		System.out.println("Price: "+dformat.format(mealDealT.getPizza().getPrice()));
		
		MealDeals mealDealS = new VegetarianDelightPizza();
		System.out.println("Desc: "+mealDealS.getPizza().getDesc());
		System.out.println("Price: "+dformat.format(mealDealS.getPizza().getPrice() * .8));
		
		MealDeals mealDealr = new NapoliPizza();
		System.out.println("Desc: "+mealDealr.getPizza().getDesc());
		System.out.println("Price: "+dformat.format(mealDealr.getPizza().getPrice() * .8));
		
		System.out.println("Desc: "+pizza.getDesc());
		System.out.println("Price: "+dformat.format(pizza.getPrice()));
	}

}
