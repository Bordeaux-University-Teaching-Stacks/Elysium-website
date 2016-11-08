<%@ taglib prefix = "spring" uri = "http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<nav class="header-wrapper">
	<div class="nav-wrapper grey lighten-4">
		<div class="row">
			<div class="col s2 l2 m2">
				<a href="#" data-activates="mobile-nav" class="button-collapse grey-text text-darken-1"><i class="material-icons">menu</i></a>
			</div>
			<div class="col s8 l8 m8">
				<a href="#" class="brand-logo black-text">
					<img src="<c:url value="/resources/img/elysium-logo.png"/>" width="175" height="40"/>
				</a>
				<ul class="right hide-on-med-and-down">
					<li><a href="#" class="grey-text text-darken-3"><spring:message code = "header.link.login"/></a></li>
					<li><a href="#" class="grey-text text-darken-3"><spring:message code = "header.link.subscribe"/></a></li>
				</ul>
				<ul class="side-nav" id="mobile-nav">
					<li><a href="#" class="grey-text text-darken-3"><spring:message code = "header.link.login"/></a></li>
					<li><a href="#" class="grey-text text-darken-3"><spring:message code = "header.link.subscribe"/></a></li>
				</ul>
			</div>
			<div class="col s2 l2 m2"></div>
		</div>
		
	</div>
</nav>