package com.test;

class Item1 {
	
	private int id;

	private String name;

	public Item1() {

	}

	public Item1(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Item1 [id=" + id + ", name=" + name + "]";
	}
}
