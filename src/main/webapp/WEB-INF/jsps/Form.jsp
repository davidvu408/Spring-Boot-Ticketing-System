<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<%@ include file = "Header.jsp" %>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<title>Form</title>
</head>

<!--  
commandName="value": Indicates the name within model that it can find the model-backing object
path="value": Value indicates path to property for data binding
-->
<body>
	<div class="container">
	<%@ include file = "NavBar.jsp" %>
		<form:form modelAttribute="formResponse">
			<div class="form-group">
				<label for="requestorName">Requestor's Name</label> 
				<form:input path="requestorName" class="form-control" id="requestorName" />
			</div>
			<div class="form-group">
				<label for="requestorEmail">Email</label> 
				<form:input path= "requestorEmail" class="form-control" id="requestorEmail" />
			</div>
			<div class="form-group">
				<label for="marketingArea">Marketing Area</label> 
				<form:select path="marketingArea" class="form-control" id="marketingArea">
					<form:options items = "${marketingAreas}" />
				</form:select>
			</div>
			<div class="form-group">
				<label for="ticketDescription">Ticket Description</label>
				<form:textarea path="ticketDescription" class="form-control" id="ticketDescription" rows="3" />
			</div>
			<div class="text-center"><button type="submit" class="btn btn-primary">Submit</button></div>
		</form:form>
	</div>
</body>
</html>