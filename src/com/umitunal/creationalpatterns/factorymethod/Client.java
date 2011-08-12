package com.umitunal.creationalpatterns.factorymethod;

public class Client {
	
	public static void main(String[] args) {
		AbstractLoggerCreator creator = new XMLLoggerCreator();
		Client client = new Client();
		client.someMethodThatLogs(creator);
	}

	private void someMethodThatLogs(AbstractLoggerCreator logCreator) {
		Logger logger = logCreator.createLogger();
		logger.log("message");
	}
}
