package com.jpa.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Product {
	
	@Id
	@GeneratedValue
	private Integer pId;
	
	
	private String pName;
	private double pCost;
	private String color;
	
	public Product() {
		super();
	}
	
	@Override
	public String toString() {
		return "Product [pId=" + pId + ", pName=" + pName + ", pCost=" + pCost + ", color=" + color + "]";
	}

	public Product(String pName, double pCost, String color) {
		super();
		
		this.pName = pName;
		this.pCost = pCost;
		this.color = color;
	}

	public Product(Integer pId) {
		super();
		this.pId = pId;
	}

	public Integer getpId() {
		return pId;
	}
	public void setpId(Integer pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public double getpCost() {
		return pCost;
	}
	public void setpCost(double pCost) {
		this.pCost = pCost;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
}
