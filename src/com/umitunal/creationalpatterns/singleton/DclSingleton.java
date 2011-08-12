package com.umitunal.creationalpatterns.singleton;

public class DclSingleton {
	private static DclSingleton instance = null;
	
	private DclSingleton() {	
	}
	
	public static DclSingleton getInstance() {
		if ( instance == null ) {
			synchronized (DclSingleton.class) {
				if ( instance == null ) {
					instance = new DclSingleton();
				}
			}
		}
		return instance;
	}
	
	public static void main(String[] args) {
		DclSingleton singleton = null;
		for (int i = 0; i < 10; i++) {
			singleton = DclSingleton.getInstance();
			System.out.println(singleton);
		}
	}
	
}
