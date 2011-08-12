package com.umitunal.creationalpatterns.prototype;

public class Deneme {
	public static void main(String[] args) throws CloneNotSupportedException {
		DenemePrototype denemePrototype = new DenemePrototype("umit");
		DenemePrototype cloneDenemePrototype = (DenemePrototype) denemePrototype.clone();
		
		System.out.println( cloneDenemePrototype.getName() );
		
	}
}
