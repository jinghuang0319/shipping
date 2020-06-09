package com.item.dao;

import java.util.List;

import com.item.bean.Country;

public interface CountryDao {

	List<Country> getCountrys();

	double getPrice(int cid);

}
