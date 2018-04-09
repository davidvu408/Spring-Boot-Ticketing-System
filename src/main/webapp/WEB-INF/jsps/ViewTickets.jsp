<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<%@ include file = "Header.jsp" %>
<title>View Tickets</title>
</head>
<body>
	<div class="container">
	<%@ include file = "NavBar.jsp" %>
		<table class="table">
			<tr>
				<th>ID</th>
				<th>Requestor's Name</th>
				<th>Requestor's Email</th>
				<th>Marketing Area</th>
				<th>Ticket Description</th>
				<th>Admin Options</th>
			</tr>
			<c:forEach var="ticket" items="${ticket_list}">
				<tr>
					<%--Note: Getter method is actually being called, this isn't calling Object properties directly --%>
					<td><c:out value="${ticket.id}" /></td>
					<td><c:out value="${ticket.requestorName}" /></td>
					<td><c:out value="${ticket.requestorEmail}" /></td>
					<td><c:out value="${ticket.marketingArea}" /></td>
					<td><c:out value="${ticket.ticketDescription}" /></td>
					<%--Creating variables that hold URLs to ticket's edit/delete page --%>
					<c:url var="editLink" value="/edit-ticket?id=${ticket.id}" />
					<c:url var="deleteLink" value="/delete-ticket?id=${ticket.id}" />
					<td>
						<span><a href="${editLink}">edit</a></span> | 
						<span><a onclick="return confirm('Delete ticket ' + ${ticket.id} + '?')" href="${deleteLink}">delete</a></span>
					</td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>