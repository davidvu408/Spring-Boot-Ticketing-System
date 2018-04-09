<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<%@ include file = "Header.jsp" %>
<title>API Display</title>
</head>
<body>
<%@ include file = "NavBar.jsp" %>
<div class="container">
<code>
${apiList}
</code>
<p>Note: Will change this to JSON format soon.</p>
</div>
</body>

</html>