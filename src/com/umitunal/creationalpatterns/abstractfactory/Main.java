package com.umitunal.creationalpatterns.abstractfactory;

public class Main {
	
	public static void main(String[] args) {
		GuiBuilder builder = new GuiBuilder();
		AbstractWidgetFactory widgetFactory = null;
		// check what platform we're on
		if (Platform.currentPlatform() == "MACOSX") {
			widgetFactory = new MacOSXWidgetFactory();
		} else {
			widgetFactory = new MsWindowsWidgetFactory();
		}
		builder.buildWindow(widgetFactory);
	}
	
}
