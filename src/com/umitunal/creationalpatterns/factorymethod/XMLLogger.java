package com.umitunal.creationalpatterns.factorymethod;

public class XMLLogger implements Logger {

	@Override
	public void log(String message) {
		System.out.println(message);
	}

}
