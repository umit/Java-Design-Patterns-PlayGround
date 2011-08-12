package com.umitunal.creationalpatterns.abstractfactory;

public class MsWindowsWidgetFactory implements AbstractWidgetFactory {

	@Override
	public Window createWindow() {
		MSWindow window = new MSWindow();
		return window;
	}

}