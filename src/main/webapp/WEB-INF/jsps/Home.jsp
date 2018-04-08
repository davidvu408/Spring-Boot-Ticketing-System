<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<title>About</title>
</head>
<body>
	<div class="container">
		<h1 class="text-center">A Java-Based Ticketing System</h1>
		<h2>About This Project</h2>
		<p>This is a Ticketing System built with Spring Boot and various
			other supporting technologies. This application supports the four
			basic functions of persistent storage in the following ways:</p>
		<ul>
			<li><b>CREATE</b> - Users can submit form responses which
				effectively will instantiate a Domain Object backing the form. This
				object is then stored in a MySql database using Hibernate
				(Object-Relational Mapping tool).</li>
			<li><b>READ</b> - In a separate view located at /view-tickets,
				users can view a list of tickets that have been submitted in the
				current session (or multiple sessions depending on the application
				configuration in application.properties). Behind the scenes, these
				tickets are being rendered live from the MySql database.</li>
			<li><b>UPDATE</b> - Users have the ability to edit the data of
				past form responses, updating the view and the MySql database.</li>
			<li><b>DELETE</b> - Users have the ability to delete the data of
				past form responses, updating the view and the MySql database.</li>
		</ul>
		<h2>Notes</h2>
		<ul>
			<li>Feel free to add, edit and delete form responses as you wish
				to observe how the system works altogether. If you wish to view
				tickets you will be redirected to a login screen before you can
				actually view them. The login credentials is the following:</li>
			<ul>
				<li>User name: Test</li>
				<li>Password: Password123</li>
			</ul>
			<li>In the future, I would like to add some Data Analytic service
				that provides statistics with previous and current ticket data. In
				this project, I have started an API which the Data Analytic service
				could use.</li>
		</ul>
		<h2>Technologies Used</h2>
		<ul>
			<li>Spring Boot</li>
			<ul>
				<li>Spring MVC</li>
				<li>Spring Data JPA with Hibernate</li>
				<li>Spring Security</li>
				<li>Spring Data JDBC</li>
				<li>Apache Tomcat</li>
			</ul>
			<li>Java Server Pages (JSPs)</li>
			<li>JSP Standard Tag Library (JSTL)</li>
			<li>HTML</li>
			<li>Bootstrap (CSS Framework)</li>
			<li>Java SE & EE</li>
			<li>MySql (Community Edition)</li>
			<li>Maven</li>
		</ul>
		<div class="text-center">
			<a class="btn btn-primary" href="/form">GO TO THE TICKETING
				SYSTEM</a>
		</div>
	</div>
</body>
</html>