<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<h3> Residential Detail</h3>
<body>
<jsp:useBean id="pr" class="com.bitwise.servlet_assignment1.User" scope="session"></jsp:useBean>  
<jsp:setProperty property="*" name="pr"/>  
</body>
<form action="occupation.jsp" method="post">  
Name:<br><input type="text" name="name"><br>  
Address Info:<br><input type="text" name="address"><br>  
PinCode:<br><input type="number" name="pincode"><br><br> 
<input type="submit" value="Update">  
</form>
</html>

<jsp:useBean id="re" class="com.bitwise.servlet_assignment1.Residential" scope="session"></jsp:useBean>  
<jsp:setProperty property="*" name="re"/>  
  
<!-- Record:<br>   -->
<%-- <jsp:getProperty property="name" name="u"/><br>   --%>
<%-- <jsp:getProperty property="qualification" name="u"/><br>   --%>
<%-- <jsp:getProperty property="email" name="u" /><br>   --%>