package com.umitunal.creationalpatterns.factorymethod;

//the abstract Creator
public abstract class AbstractLoggerCreator {

	public abstract Logger createLogger();

	public Logger getLogger() {
		Logger logger = createLogger();
		return logger;
	}

}