package com.umitunal.creationalpatterns.builder;

public class SpicyPizzaBuilder extends PizzaBuilder {

	@Override
	public void buildDough() {
		pizza.setDough(" dough ");
	}

	@Override
	public void buildSauce() {
		pizza.setSauce(" sauce ");
	}

	@Override
	public void buildTopping() {
		pizza.setTopping(" topping ");
	}

}
