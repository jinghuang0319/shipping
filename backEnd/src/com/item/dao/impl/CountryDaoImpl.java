package com.item.dao.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.item.bean.Country;
import com.item.dao.BaseDao;
import com.item.dao.CountryDao;


public class CountryDaoImpl extends BaseDao implements CountryDao {
	
	//创建方法
	public List<Country> getCountrys(){
		try {
			//连接数据库
			getConnection();
			//书写SQL语句
			String sql="select * from countrys";
			//预编译
			ps=conn.prepareStatement(sql);
			//执行sql
			res=ps.executeQuery();
			//创建集合
			List<Country> list=new ArrayList<Country>();
			//遍历结果集
			while(res.next()){
				//创建对象
				Country c= new Country();
				c.setCountryid(res.getInt(1));
				c.setCountryname(res.getString(2));
				c.setPrice(res.getDouble(3));
				//将对象添加进集合
				list.add(c);
			}
			//返回结果集
			return list;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			//关闭流
			close();
		}
		
		
		return null;
	}
	
	//根据国家id查找对应的单价
	public double getPrice(int cid) {
		// TODO Auto-generated method stub
		try {
			//连接数据库
			getConnection();
			//书写SQL语句
			String sql="select price from countrys where countryid=?";
			ps=conn.prepareStatement(sql);
			ps.setInt(1, cid);
			//执行sql
			res=ps.executeQuery();
			while(res.next()){
				return res.getDouble(1);
			}
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			//关闭流
			close();
		}
		
		
		return -1;
	}
}
