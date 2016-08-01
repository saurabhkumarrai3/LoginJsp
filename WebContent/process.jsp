<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<h3> Qualification Detail</h3>
<form action="residential.jsp" method="post">  
Name:<br><input type="text" name="name"><br>  
Degree Info:<br><input type="text" name="qualification"><br>  
Email:<br><input type="text" name="email"><br><br>
<input type="submit" value="Update">  
</form>
<body>
<jsp:useBean id="pr" class="com.bitwise.servlet_assignment1.User" scope="session"></jsp:useBean>  
<jsp:setProperty property="*" name="pr"/>  
</body>
</html>


  
