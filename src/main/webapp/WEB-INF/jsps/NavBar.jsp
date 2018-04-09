<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>

<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
	<a class="navbar-brand" href="/">Ticketing System</a>

  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="navbarNavDropdown">
    <ul class="navbar-nav mr-auto">
			<li class="nav-item"><a class="nav-link" href="/form">Form</a></li>
			<li class="nav-item"><a class="nav-link" href="/view-tickets">View
					Tickets</a></li>
			<li class="nav-item"><a class="nav-link" href="/api">API</a></li>
			<sec:authorize access="isAuthenticated()">
				<li class="nav-item"><a class="nav-link"
					href="javascript: document.getElementById('logoutForm').submit();">Logout</a></li>
			</sec:authorize>
		</ul>
	</div>
</nav>

<c:url var="logoutLink" value="/logout" />
<form id="logoutForm" method="post" action="${logoutLink}">
	<input type="hidden" name="${_csrf.parameterName}"
		value="${_csrf.token}" />
</form>


