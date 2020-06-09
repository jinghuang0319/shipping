package com.item.bean;

public class OrderBox {
	
	private int OrderBoxid;
	private String boxName;
	private double boxWeight;
	private String boxColour;
	private double sumcost;
	
	public int getOrderBoxid() {
		return OrderBoxid;
	}

	public void setOrderBoxid(int orderBoxid) {
		OrderBoxid = orderBoxid;
	}

	public String getBoxName() {
		return boxName;
	}

	public void setBoxName(String boxName) {
		this.boxName = boxName;
	}

	public double getBoxWeight() {
		return boxWeight;
	}

	public void setBoxWeight(double boxWeight) {
		this.boxWeight = boxWeight;
	}

	public String getBoxColour() {
		return boxColour;
	}

	public void setBoxColour(String boxColour) {
		this.boxColour = boxColour;
	}

	public double getSumcost() {
		return sumcost;
	}

	public void setSumcost(double sumcost) {
		this.sumcost = sumcost;
	}

	public OrderBox() {
		// TODO Auto-generated constructor stub
	}
	
	

}
