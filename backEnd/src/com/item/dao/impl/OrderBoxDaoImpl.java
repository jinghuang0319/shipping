package com.item.dao.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.item.bean.Country;
import com.item.bean.OrderBox;
import com.item.dao.BaseDao;
import com.item.dao.OrderBoxDao;
import com.item.service.CountryServcie;

public class OrderBoxDaoImpl extends BaseDao implements OrderBoxDao {
	
	//���ò��붩���ķ���
	public boolean insertOrder(OrderBox ob) {
		try {
			//�������ݿ�
			getConnection();
			//��дSQL���
			String sql="insert into boxs values(null,?,?,?,?)";
			//Ԥ����
			ps=conn.prepareStatement(sql);
			//ִ��sql
			
			ps.setString(1, ob.getBoxName());
			ps.setDouble(2, ob.getBoxWeight());
			ps.setString(3, ob.getBoxColour());
			ps.setDouble(4, ob.getSumcost());
			
			int num=ps.executeUpdate();
			
			if(num>0){
				return true;
			}else {
				return false;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			//�ر���
			close();
		}
		
		return false;
	}
	
	//��ѯ�����ķ���
	public List<OrderBox> getOerders() {
		// TODO Auto-generated method stub
		try {
			//�������ݿ�
			getConnection();
			//��дSQL���
			String sql="select * from boxs";
			//Ԥ����
			ps=conn.prepareStatement(sql);
			//ִ��sql
			res=ps.executeQuery();
			//��������
			List<OrderBox> list=new ArrayList<OrderBox>();
			//���������
			while(res.next()){
				//��������
				OrderBox ob= new OrderBox();
				ob.setOrderBoxid(res.getInt(1));
				ob.setBoxName(res.getString(2));
				ob.setBoxWeight(res.getDouble(3));
				ob.setBoxColour(res.getString(4));
				ob.setSumcost(res.getDouble(5));
				//��������ӽ�����
				list.add(ob);
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
}
