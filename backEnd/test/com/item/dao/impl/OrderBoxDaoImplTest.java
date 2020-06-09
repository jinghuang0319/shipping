package com.item.dao.impl;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;


import com.item.bean.OrderBox;
import com.item.dao.OrderBoxDao;



public class OrderBoxDaoImplTest {

	@Test
	public void testInsertOrder() {
	
		OrderBox ob=new OrderBox();
		  ob.setOrderBoxid(2);
		  ob.setBoxColour("#ff0000");
		  ob.setBoxName("food");
		  ob.setBoxWeight(500);
		  ob.setSumcost(500);
		  OrderBoxDao obd = new OrderBoxDaoImpl();
		  Assert.assertTrue(obd.insertOrder(ob));
	}

	

	@Test
	public void testGetOerders() {
	
		OrderBoxDaoImpl o =new OrderBoxDaoImpl();
		List<OrderBox> list=o.getOerders();
		assertNotNull(list);	
	}

}
