package com.umitunal.behavioralpatterns.decorator;

//concrete decorator
public class SecureEmailDecorator extends EmailDecorator {
	
	private String content;

	public SecureEmailDecorator(IEmail email) {
		originalEmail = email;
	}

	@Override
	public String getContents() {
		content = encrypt(originalEmail.getContents());
		return content;
	}

	private String encrypt(String message) {
		String encryptedMessage = "";
		return encryptedMessage ;
	}

}
