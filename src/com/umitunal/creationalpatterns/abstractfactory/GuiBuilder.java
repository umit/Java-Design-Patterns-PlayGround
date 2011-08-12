package com.umitunal.creationalpatterns.abstractfactory;


public class GuiBuilder {
	public void buildWindow(AbstractWidgetFactory widgetFactory) {
		Window window = widgetFactory.createWindow();
		window.setTitle("New Window");
	}
}