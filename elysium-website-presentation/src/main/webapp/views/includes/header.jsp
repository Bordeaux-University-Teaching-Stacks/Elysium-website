<%@ taglib prefix = "spring" uri = "http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<nav>
	<div class="nav-wrapper grey lighten-4">
		<div class="row">
			<div class="col s2 l2 m2"></div>
			<div class="col s8 l8 m8">
				<a href="#" class="brand-logo black-text">
					<img src="<c:url value="/resources/img/elysium-logo.png"/>" width="175" height="40"/>
				</a>
				<ul id="nav-mobile" class="right hide-on-med-and-down">
					<li><a href="#" class="grey-text text-darken-3"><spring:message code = "header.link.login"/></a></li>
					<li><a href="#" class="grey-text text-darken-3"><spring:message code = "header.link.subscribe"/></a></li>
				</ul>
			</div>
			<div class="col s2 l2 m2"></div>
		</div>
		
	</div>
</nav>