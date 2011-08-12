package com.umitunal.creationalpatterns.builder;

public class BuilderExample {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Waiter waiter = new Waiter();
		
		PizzaBuilder hawaiPizza = new HawaiianPizzaBuilder();
		
		waiter.setPizzaBuilder(hawaiPizza);
		waiter.constructPizza();
		
		Pizza pizza = waiter.getPizza();
	}
}
