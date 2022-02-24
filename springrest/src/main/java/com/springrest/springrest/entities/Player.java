package com.springrest.springrest.entities;

public class Player {
	private long id;
	private String name;
	private int age;
	public Player(long id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public Player()
	{
		super();
		// TODO Auto-generated constructor stub
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Player [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
//	public Object getLocation() {
//	
//		return "Player [id=" + id + ", name=" + name + ", age=" + age + "]";
//	}
//	

	
	
	
}

