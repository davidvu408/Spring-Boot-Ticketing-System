<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<title>Login</title>
</head>
<body>
	<div class="container">
		<%@ include file="Header.jsp"%>
			<form method="post" action="/login" style="margin-top: 5%">
				<div class="form-group text-center">
					<label>User Name</label> <input type="text" name="username"
						placeholder="John Doe" />
				</div>
				<div class="form-group text-center">
					<label>Password</label> <input type="password" name="password"
						placeholder="ZZZZ" />
				</div>
				<div class="text-center">
					<button type="submit" class="btn btn-primary">Sign In</button>
				</div>
			</form>
	</div>

</body>
</html>