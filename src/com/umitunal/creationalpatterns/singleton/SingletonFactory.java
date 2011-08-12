package com.umitunal.creationalpatterns.singleton;

public class SingletonFactory {
	
	/*
	 * Class holder lazy initialization
	 * */
	
	private static class SingletonHolder {
		public static Singleton instance = new Singleton();
	}

	public static Singleton getInstance() {
		return SingletonHolder.instance;
	}
}
