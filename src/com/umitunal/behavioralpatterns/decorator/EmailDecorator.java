package com.umitunal.behavioralpatterns.decorator;

public abstract class EmailDecorator implements IEmail {
	//wrapped component
	IEmail originalEmail;
	
}
