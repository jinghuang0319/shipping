package com.item.servlet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.item.bean.Country;
import com.item.service.CountryServcie;
import com.item.service.impl.CountryServcieImpl;
import com.alibaba.dubbo.common.json.JSONObject;
import com.alibaba.dubbo.common.utils.IOUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;

public class ShowServlet extends HttpServlet {
	private CountryServcie cs = new CountryServcieImpl();
	
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		/*
		 * response.setContentType("application/json");
		 * response.setStatus(HttpServletResponse.SC_OK); BufferedReader reader = new
		 * BufferedReader(new InputStreamReader(request.getInputStream(), "utf-8"));
		 * String body = IOUtils.read(reader); Country country = JSON.parseObject(body,
		 * new TypeReference<Country>() {}); //System.out.println(country.toString());
		 * List<Country> listC=cs.getCountrys();
		 */
		 List<Country> listC=cs.getCountrys();
		 Map<String,List> map=new HashMap(); 
		 map.put("data", listC); 
		 System.out.println(JSON.toJSONString(map));
		 response.setHeader("Access-Control-Allow-Origin","*");
		 response.getWriter().println(JSON.toJSONString(map));
		 
		
		/*
		 * List<Country> listC=cs.getCountrys(); String json = JSON.toJSONString(listC);
		 * System.out.println(json);
		 * response.setHeader("Access-Control-Allow-Origin","*");
		 * response.getWriter().println(json);
		 */
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
