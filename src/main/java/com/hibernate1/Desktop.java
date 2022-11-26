package com.hibernate1;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Desktop {
	
	@Id
	private int did;
	private String brand;
	private int price;
	
	
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	@Override
	public String toString() {
		return "Desktop [did=" + did + ", brand=" + brand + ", price=" + price + "]";
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	

}
