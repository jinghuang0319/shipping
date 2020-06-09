package com.item.dao.impl;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.item.bean.Country;

public class CountryDaoImplTest {

	@Test
	public void testGetCountrys() {
		CountryDaoImpl c =new CountryDaoImpl();
		List<Country> list=c.getCountrys();
		assertNotNull(list);
	}

	@Test
	public void testGetPrice() {
		assertEquals(4.0,new CountryDaoImpl().getPrice(2),0.0001);
	}

}
