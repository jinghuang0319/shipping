package com.item.service.impl;

import java.util.List;

import javax.swing.text.StyledEditorKit.ForegroundAction;


import com.item.bean.Country;
import com.item.dao.CountryDao;
import com.item.dao.impl.CountryDaoImpl;
import com.item.service.CountryServcie;

public class CountryServcieImpl implements CountryServcie{
	
	private CountryDao cd = new CountryDaoImpl();
	
	public List<Country> getCountrys() {
		// TODO Auto-generated method stub
		
				return cd.getCountrys();
	}
	//����id�ҹ���ʵ�ֲ��ҵ��۵ķ���
	public double getPrice(int cid) {
		// TODO Auto-generated method stub
		return cd.getPrice(cid);
	}

}
