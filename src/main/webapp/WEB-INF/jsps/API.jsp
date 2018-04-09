<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<%@ include file="Header.jsp"%>
<title>Ticketing System | API Methods</title>
</head>
<body>
	<div class="container">
		<%@ include file="NavBar.jsp"%>
		<h1 class="text-center">Ticketing System API Documentation</h1>
		<ul>
			<li>Endpoint: /api/</li>
			<li>Method: GET</li>
			<li>Optional parameters:</li>
			<ul>
				<li>(int) limit - Returns a maximum of <i>[limit]</i> tickets
				</li>
				<li>(string) cat - Returns tickets in specific marketing area.<br />Valid
					values are: "WEB", "GRAPHIC_DESIGN", "MEDIA", "EDITORIAL",
					"DIGITAL_MARKETING"
				</li>
			</ul>
			<li>Example: localhost:8080/api?limit=5 (Prefix URL from Apache
				Tomcat)</li>
			<li>Example: localhost:8080/api?cat=DIGITAL_MARKETING (Prefix URL from
				Apache Tomcat)</li>
		</ul>
		<h2>Why an API?</h2>
		<p>From my understanding, microservices should be loosely coupled
			services that enable communication among each other. By itself, this
			Ticketing System can create, read, update and delete form
			submissions. But moving forward, services can be built alongside this
			system such as some Data Analytics service that shows various
			statistics of form submissions. Following microservice architecture
			it is best to decouple these services, thus the need for an API. This
			API can be extended further as needed but these basic functions
			should be enough to build some basic services.</p>
	</div>


</body>
</html>