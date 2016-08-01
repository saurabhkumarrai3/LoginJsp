<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<h3> Occupational Detail</h3>
<body>
<jsp:useBean id="re" class="com.bitwise.servlet_assignment1.Residential" scope="session"></jsp:useBean>  
<jsp:setProperty property="*" name="re"/>   
</body>
<form action="DisplayAllDetails.jsp" method="post">  
Name:<br><input type="text" name="name"><br>  
Occupation Info:<br><input type="text" name="occupation"><br>  
Contact Number:<br><input type="number" name="contact"><br><br>
<input type="submit" value="Update">  
</form>
</html>

<jsp:useBean id="oc" class="com.bitwise.servlet_assignment1.Occupation" scope="session"></jsp:useBean>  
<jsp:setProperty property="*" name="oc"/>  
  
