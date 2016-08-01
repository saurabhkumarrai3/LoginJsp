<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<jsp:useBean id="oc" class="com.bitwise.servlet_assignment1.Occupation" scope="session"></jsp:useBean>  
<jsp:setProperty property="*" name="oc"/>

<jsp:useBean id="pr" class="com.bitwise.servlet_assignment1.User" scope="session"></jsp:useBean>  
<jsp:setProperty property="*" name="pr"/>

<jsp:useBean id="re" class="com.bitwise.servlet_assignment1.Residential" scope="session"></jsp:useBean>  
<jsp:setProperty property="*" name="re"/>  

<b>Qualification Detail:</b><br><br>  
Name: <jsp:getProperty property="name" name="pr"/><br>  
Qualification: <jsp:getProperty property="qualification" name="pr"/><br>  
Email: <jsp:getProperty property="email" name="pr" /><br>  


 
<br><br><br><b>Residential Detail:</b><br><br>  
Name: <jsp:getProperty property="name" name="re"/><br>  
Address: <jsp:getProperty property="address" name="re"/><br>  
PinCode: <jsp:getProperty property="pincode" name="re" /><br> 

<br><br><br><b>Occupational Detail:</b><br><br>  
Name: <jsp:getProperty property="name" name="oc"/><br>  
Qualification: <jsp:getProperty property="occupation" name="oc"/><br>  
Email: <jsp:getProperty property="contact" name="oc" /><br> 


 
</body>
</html>
