package com.umitunal.creationalpatterns.factorymethod;

public class XMLLoggerCreator extends AbstractLoggerCreator {

	@Override
	public Logger createLogger() {
		XMLLogger xmlLogger = new XMLLogger();
		return xmlLogger;
	}

}
