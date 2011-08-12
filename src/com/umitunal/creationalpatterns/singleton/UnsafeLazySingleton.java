package com.umitunal.creationalpatterns.singleton;

public class UnsafeLazySingleton {
	private static UnsafeLazySingleton instance = null;

	private UnsafeLazySingleton() {
	
	}

	public static synchronized UnsafeLazySingleton getInstance() {
		if (instance == null) {
			instance = new UnsafeLazySingleton();
		}
		return instance;
	}
	
	public static void main(String[] args) {
		UnsafeLazySingleton singleton = null;
		for (int i = 0; i < 100; i++) {
			singleton = UnsafeLazySingleton.getInstance();
			System.out.println(singleton);
		}
	}
	
}
