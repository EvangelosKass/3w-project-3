package com.askisi.web;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="products")
public class Product {
	@Id
	private String barcode;
	
	private String name;
	private String color;
	private String desc;
	
	
	
	public Product() {
		super();
	}
	public Product(String barcode,String name,String color,String description) {
		this.barcode=barcode;
		this.name=name;
		this.color=color;
		this.desc=description;
	}

	
	
	public String getBarcode() {
		return barcode;
	}
	public String getName() {
		return name;
	}
	public String getColor() {
		return color;
	}
	public String getDescription() {
		return desc;
	}
	
	

}
