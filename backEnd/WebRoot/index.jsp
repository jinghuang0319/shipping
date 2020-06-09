<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
    <form action="InsertOrderServlet.do" method="post">
    	Name</br>
    	<input name="boxname" size="10"></br>
    	Weight</br>
    	<input name="boxWeight" size="10"></br>
    	Country</br>
    	<select name="countryid">
    		<option value='0'>ALL</option>
    		<c:forEach items="${listC }" var="lc">
    			<option value="${lc.countryid }">${lc.countryname }</option>
    			
    		</c:forEach>
    		</select><br>
    		Box colour<br>
    		<input type="color" name="boxcolour">
    		<br>
    		 <input type="submit" value="Save">
    		 
    	
    </form>
   
  </body>
</html>
