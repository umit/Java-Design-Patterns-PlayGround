package com.umitunal.behavioralpatterns.decorator;

public class EmailSender {

	public void sendEmail(IEmail email) {
		ExternalEmailDecorator external = new ExternalEmailDecorator(email);
		external.getContents();
	}

	public void sendEmailSecure(IEmail email) {
		SecureEmailDecorator secureEmailDecorator = new SecureEmailDecorator(email);
		secureEmailDecorator.getContents();
	}
}
