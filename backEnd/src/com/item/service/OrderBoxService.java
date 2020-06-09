package com.item.service;

import java.util.List;

import com.item.bean.OrderBox;

public interface OrderBoxService {

	public boolean insertOrder(OrderBox ob);
	//查询订单的方法
	public List<OrderBox> getOerders();

}
