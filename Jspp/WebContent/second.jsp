<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page errorPage="error.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<br>
<%





String name=request.getParameter("name"); 


String  id= request.getParameter("id"); 

if ((name=="")||(id=="")){
	
	
	RequestDispatcher rd=request.getRequestDispatcher("error.jsp");
	rd.forward(request, response);
}
	

else{
	out.println("Name that you entered is :"+name);
	out.println();
	out.println();
	out.println("Age that you entered is :"+id);
}

%>
</body>
</html>




