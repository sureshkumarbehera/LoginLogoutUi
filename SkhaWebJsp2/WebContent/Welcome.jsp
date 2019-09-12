<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
if(session.getAttribute("username")==null){
	response.sendRedirect("Login.jsp");
}
%>


<h3>Hello</h3><h2><%=session.getAttribute("username") %></h2>

<!--  <pre>

HOMEENGLISH GRAMMAR RULES & USAGEWRITINGHOW TO WRITE AN ESSAY
How to Write an Essay
7th grade8th grade9th grade10th grade11th grade12th gradeMiddle SchoolHigh SchoolCollege

</pre> -->
<hr size="3">

Click to<a href="logout">Logout</a>

</body>
</html>