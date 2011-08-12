package com.umitunal.behavioralpatterns.decorator;

//concrete component
public class Email implements IEmail {

	private String to;
	private String from;
	private String content;

	public Email(String content) {
		this.content = content;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getTo() {
		return to;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getFrom() {
		return from;
	}
	
	@Override
	public String getContents() {
		return content;
	}

}