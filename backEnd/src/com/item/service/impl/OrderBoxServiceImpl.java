package com.item.service.impl;

import java.util.List;

import com.item.bean.OrderBox;
import com.item.dao.OrderBoxDao;
import com.item.dao.impl.OrderBoxDaoImpl;
import com.item.service.CountryServcie;
import com.item.service.OrderBoxService;

public class OrderBoxServiceImpl implements OrderBoxService {
	private OrderBoxDao obd=new OrderBoxDaoImpl();
	
	//插入订单的方法
	public boolean insertOrder(OrderBox ob) {
		// TODO Auto-generated method stub
		return obd.insertOrder(ob);
	}
	
	public List<OrderBox> getOerders() {
		// TODO Auto-generated method stub
		return obd.getOerders();
	}

}
