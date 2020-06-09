package com.item.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;
import com.item.bean.Country;
import com.item.bean.OrderBox;
import com.item.service.OrderBoxService;
import com.item.service.impl.OrderBoxServiceImpl;

public class ShowOrderServlet extends HttpServlet {
	
	private OrderBoxService obs = new OrderBoxServiceImpl();
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//��ѯ�����ķ���
		List<OrderBox> listO=obs.getOerders();
		Map<String,List> map=new HashMap(); 
		map.put("data", listO); 
		System.out.println(JSON.toJSONString(map));
		response.setHeader("Access-Control-Allow-Origin","*");
		response.getWriter().println(JSON.toJSONString(map));
		
			

	
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
