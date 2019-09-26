<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="#05A1F5">
<form method="post" action="LoginCheck">
<h1 style="background-color:#7FFFD4"> Registration Form </h1>
	
	
User name      :<input style="margin-left: 3%" pattern="[A-za-z]+" type="text" name="userid" /><br/><br/>
password       :<input style="margin-left: 4%"  type="password" name="pwd" /><br/><br/>
Confirm password:<input style="margin-left: 0%" type="password" name="cpwd" /><br/><br/>
First name     :<input style="margin-left: 3%" pattern="[A-za-z]+" type="text" name="fname" /><br/><br/>
Last name      :<input style="margin-left: 3%" pattern="[A-za-z]+" type="text" name="lname" /><br/><br/>
Email          :<input style="margin-left: 5%" pattern="[a-zA-Z0-9][a-zA-Z0-9_.]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+" type="text" name="email" /><br/><br/>
PhoneNumber    :<input style="margin-left: 1%" type="text" pattern="(0|91)[7-9][0-9]{9}" name="pnumber" /><br/><br/>
<br/><br/>

<input style="margin-left: 200px" type="submit" name="submit" value="register"/>
	

</form>
</body>
</html>