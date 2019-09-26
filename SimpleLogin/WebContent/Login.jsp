<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="#0EC8D8">
	<h1 style="background-color: #7FFFD4">Login Page</h1>

	<form method="post" action="LoginCheck">
        <h3 Style="color:red;">${message} </h3>
        <h3 Style="color:green;">${successmessage} </h3>


		User Name <input type="text" name="uname"
			placeholder="Enter User name"> <br> <br> 
			Password <input
			style="margin-left: 10px" type="password" name="password"
			placeholder="**********">
			 <br> <br> <input
			style="margin-left: 150px" type="submit" name="submit" value="login"> <input
			style="margin-left: 10px" style="color:red;" type="reset"
			value="Clear"> <br> <br> <a
			style="margin-left: 148px; color: red;" href="">Forget Password
		</a>
	</form>
</body>
</html>