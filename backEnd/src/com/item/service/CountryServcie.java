package com.item.service;

import java.util.List;

import com.item.bean.Country;

public interface CountryServcie {
	
	public List<Country> getCountrys();

	public double getPrice(int cid);

}
