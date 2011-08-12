package com.umitunal.creationalpatterns.prototype;

public class DenemePrototype implements Cloneable {
	private String name;
	
	public DenemePrototype(String name) {
		this.name = name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
