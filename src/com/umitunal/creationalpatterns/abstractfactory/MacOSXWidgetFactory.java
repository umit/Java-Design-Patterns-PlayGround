package com.umitunal.creationalpatterns.abstractfactory;


public class MacOSXWidgetFactory implements AbstractWidgetFactory {
	
	@Override
	public Window createWindow() {
		MacOSXWindow window = new MacOSXWindow();
		return window;
	}
	
}