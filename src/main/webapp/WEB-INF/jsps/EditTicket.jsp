<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<%@ include file = "Header.jsp" %>
<title>Edit Ticket</title>
</head>

<body>
	<div class="container">
		<form:form modelAttribute="editable_formResponse">
			<div class="form-group">
				<label for="requestorName">Requestor's Name</label>
				<form:input path="requestorName" class="form-control"
					id="requestorName"/>
			</div>
			<div class="form-group">
				<label for="requestorEmail">Email</label>
				<form:input path="requestorEmail" class="form-control"
					id="requestorEmail" />
			</div>
			<div class="form-group">
				<label for="marketingArea">Marketing Area</label>
				<form:select path="marketingArea" class="form-control"
					id="marketingArea">
					<form:options items="${marketingAreas}" />
				</form:select>
			</div>
			<div class="form-group">
				<label for="ticketDescription">Ticket Description</label>
				<form:textarea path="ticketDescription" class="form-control"
					id="ticketDescription" rows="3" />
			</div>
			<div class="text-center">
				<a class="btn btn-danger" href="/view-tickets">Cancel</a>
				<button type="submit" class="btn btn-primary">Submit</button>
			</div>
		</form:form>
	</div>
</body>
</html>