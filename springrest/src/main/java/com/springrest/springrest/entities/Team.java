package com.springrest.springrest.entities;

public class Team {
	private long id;
	private String name;
	private String location;
	public Team(long id, String name, String location)
	{
		super();
		this.id = id;
		this.name = name;
		this.location = location;
	}
	public Team() {
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
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "Team [id=" + id + ", name=" + name + ", location=" + location + "]";
	}
	



}
