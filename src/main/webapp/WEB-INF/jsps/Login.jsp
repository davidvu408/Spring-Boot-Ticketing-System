<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<%@ include file = "Header.jsp" %>
<title>Login</title>
</head>
<body>
	<div class="container">
		<%@ include file="NavBar.jsp"%>
		<div class="row">
			<div class="col-sm-4 offset-4">
				<div class="card bg-light mb-3" style="margin-top: 15%">
					<div class="card-header">Log In</div>
					<div class="card-body">
						<form method="post" action="/login" class="text-center">
						<%-- Spring Security will redirect to '/error' if wrong user name/password --%>
						<c:if test="${param.error != null }">
							<div class="bg-danger text-white">Incorrect user name or password.</div>
						</c:if>
							<div class="form-group">
								<input type="hidden" name="${_csrf.parameterName}"
									value="${_csrf.token}" />
							</div>
							<div class="form-group">
								<input class="form-control" type="text" name="username" placeholder="User Name" />
							</div>
							<div class="form-group">
								<input class="form-control" type="password" name="password" placeholder="Password" />
							</div>
							<div>
								<button type="submit" class="btn btn-primary">Sign In</button>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>

</body>
</html>