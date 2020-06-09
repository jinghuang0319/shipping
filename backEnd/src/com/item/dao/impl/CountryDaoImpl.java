package com.item.dao.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.item.bean.Country;
import com.item.dao.BaseDao;
import com.item.dao.CountryDao;


public class CountryDaoImpl extends BaseDao implements CountryDao {
	
	//��������
	public List<Country> getCountrys(){
		try {
			//�������ݿ�
			getConnection();
			//��дSQL���
			String sql="select * from countrys";
			//Ԥ����
			ps=conn.prepareStatement(sql);
			//ִ��sql
			res=ps.executeQuery();
			//��������
			List<Country> list=new ArrayList<Country>();
			//���������
			while(res.next()){
				//��������
				Country c= new Country();
				c.setCountryid(res.getInt(1));
				c.setCountryname(res.getString(2));
				c.setPrice(res.getDouble(3));
				//��������ӽ�����
				list.add(c);
			}
			//���ؽ����
			return list;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			//�ر���
			close();
		}
		
		
		return null;
	}
	
	//���ݹ���id���Ҷ�Ӧ�ĵ���
	public double getPrice(int cid) {
		// TODO Auto-generated method stub
		try {
			//�������ݿ�
			getConnection();
			//��дSQL���
			String sql="select price from countrys where countryid=?";
			ps=conn.prepareStatement(sql);
			ps.setInt(1, cid);
			//ִ��sql
			res=ps.executeQuery();
			while(res.next()){
				return res.getDouble(1);
			}
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			//�ر���
			close();
		}
		
		
		return -1;
	}
}
