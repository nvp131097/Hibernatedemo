package com.hibernate1;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Worker {
	
	@Override
	public String toString() {
		return "Worker [wid=" + wid + ", name=" + name + ", number=" + number + "]";
	}
	@Id
	private int wid;
	private String name;
	private int number;
	
	
	public int getWid() {
		return wid;
	}
	public void setWid(int wid) {
		this.wid = wid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
	

}
