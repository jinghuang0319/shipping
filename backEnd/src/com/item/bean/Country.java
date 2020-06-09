package com.item.bean;

public class Country {
	

	private Integer countryid;
	private String countryname;
	private String colour;
	private double price;
	private double sumprice;
	
	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public double getSumprice() {
		return sumprice;
	}

	public void setSumprice(double sumprice) {
		this.sumprice = sumprice;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Country() {
		// TODO Auto-generated constructor stub
	}
	
	public Country(Integer countryid,String countryname,Double price) {
		super();
		this.countryid = countryid;
		this.countryname = countryname;
		this.price = price;
	}
	
	
	
	public void setCountryid(Integer countryid) {
		this.countryid = countryid;
	}
	public Integer getCountryid() {
		return countryid;
	}
	
	public void setCountryname(String i) {
		this.countryname = i;
	}
	
	public String getCountryname() {
		return countryname;
	}
	
	public void setPrice(Double price) {
		this.price = price;
	}
	public Double getPrice() {
		return price;
	}

		

}
