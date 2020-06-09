package com.item.dao;

import java.util.List;

import com.item.bean.OrderBox;
import com.item.service.CountryServcie;

public interface OrderBoxDao {

	boolean insertOrder(OrderBox ob);

	List<OrderBox> getOerders();

}
