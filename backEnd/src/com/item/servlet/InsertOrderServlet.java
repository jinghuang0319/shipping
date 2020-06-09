package com.item.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;
import com.item.bean.Country;
import com.item.bean.OrderBox;
import com.item.service.CountryServcie;
import com.item.service.OrderBoxService;
import com.item.service.impl.CountryServcieImpl;
import com.item.service.impl.OrderBoxServiceImpl;

public class InsertOrderServlet extends HttpServlet {
	
	private CountryServcie cs = new CountryServcieImpl();
	private OrderBoxService os = new OrderBoxServiceImpl();
	
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			//����id�ҹ���
		    System.out.println("countryid-------"+request.getParameter("countryid"));
		    System.out.println("boxWeight------"+request.getParameter("boxWeight"));
		    System.out.println("boxcolour------"+request.getParameter("boxcolour"));
		    System.out.println("boxname--------"+request.getParameter("boxname"));
			int cid=Integer.parseInt(request.getParameter("countryid"));
			response.setHeader("Access-Control-Allow-Origin","*");
		
			double price=cs.getPrice(cid);
			
			OrderBox ob = new OrderBox();
			ob.setBoxName(request.getParameter("boxname"));
			
			ob.setBoxWeight(Double.parseDouble(request.getParameter("boxWeight")));
			
			ob.setBoxColour(request.getParameter("boxcolour"));
			
			ob.setSumcost(price*ob.getBoxWeight());

			boolean falg=os.insertOrder(ob);
			if(falg=true) {
			response.getWriter().println("save success");
			}else {
				response.getWriter().println("save failed");
			}
		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
