package com.item.service;

import java.util.List;

import com.item.bean.OrderBox;

public interface OrderBoxService {

	public boolean insertOrder(OrderBox ob);
	//��ѯ�����ķ���
	public List<OrderBox> getOerders();

}
