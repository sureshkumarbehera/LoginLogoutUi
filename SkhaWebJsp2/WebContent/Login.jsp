<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>
		SakhaTech Login Form
	</title>
	
	<link rel="icon" type="image/jpg" href="sakhagloballogo.jpg">
	<link rel="stylesheet" type="text/css" href="bg1.css">
	<style>
	body{
	background-image: url(https://www.pixelstalk.net/wp-content/uploads/2016/11/Farming-free-hd-wallpapers.jpg);
 background-size:cover;
}
.Loginbox{
	width:auto;
	height: auto;
	background-color: lightblue;
	top: 40%;
	left: 40%;
	margin-bottom: 150px;
	position: absolute;
	transform: translate(-20%,-20%);
	box-sizing: border-box;
	padding: 60px 30px;
}
.sakhaglobal{
	width: 100px;
	height:100px;
	border-radius:50%;
	top: -50px;
	position: absolute;
	left: 125px;	
	right:100px;
}
input[type=text],input[type=password]{
	border-radius: 8px;
	border:none;
	border-bottom:1px solid #fff;
}
 input[type="submit"]
{
	cursor: pointer;
}
.ssa{
	font-size: 12px;
	line-height: =20px;
	color: red;
}
</style>
</head>
<body>
<a href="sakhaglobal.png" ><img src="sakhaglobal.png" width=100 height=100 style="border-radius: 10px"> </a>
	<div>
	<marquee><img src="sakhagloballogo.png" height=50 width=50 style="border-radius: 50%"> &nbsp;&nbsp;&nbsp;<u><font size=8 color=red>SAKHA GLOBAL Login Form</marquee></font></u><br>
	</div>
	
	<div class="Loginbox" style="border-radius: 12px;opacity:0.8;background-color: black">
	<img src="sakhaglobal.png" class="sakhaglobal" style="border-radius: 50%">
		<h1><legend align="center" style="color: white">Login here</legend></h1>
		<form style="color: white" action="LoginController" method="post">
			<p><b><i>UserName
			<input type="text" name="username" placeholder="Enter e-mail"></i></b></p>
			<p><b><i>Password
			<input type="password" name="password" placeholder="Enter password"></b></i></p>
			<center><input type="submit" name="" value="Login" style="background-color: grey">
		
             <a href="Signup.jsp">signup</a></center><br>
			<a href="#" style="color: white">Lost your password?</a><br>
			<a href="#" style="color: white">Don't have an account?</a>
		</form>
	</div>








<!--  
<%
if(session.getAttribute("username")!=null){
	response.sendRedirect("Welcome.jsp");
}
%>


<form action="LoginController" method="post">
<h2>Hello</h2>
User Name<input type="text" name="username"><br>
Password<input type="password" name="password"><br>
<input type="submit" value="Log-in">
<a href="Signup.jsp">signup</a>
</form>
-->
</body>
</html>