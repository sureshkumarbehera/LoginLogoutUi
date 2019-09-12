<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Sakha SignUp Page</title>

</head>
<body style="background-image:url(https://www.pixelstalk.net/wp-content/uploads/2016/03/Amazing-Macro-Nature-Hd-Wallpaper.jpg)">
<div class="signup">
<form  action="SignController" method="post">
<legend align="center"><font size=10 color=#fff style="text-shadow: 2px 2px 5px red">Welcome To Sakha Tech Registration Page</font></legend>

UserName<input type="text" name="username"><br>
Password<input type="text" name="password"><br>
Email   <input type="email" name="email"><br>
PhoneNo <input type="text" name="phone"><br>
<input type="submit" name="Sign-Up">
<input type="reset" name="Reset">
</form>
<a href="Login.jsp"></a>
</div>
</body>
</html>