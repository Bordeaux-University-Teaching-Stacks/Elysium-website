<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div class="row menu-wrapper">
	<div class="col s1 l1 m1"></div>
	<div class="col s10 l10 m10 white">
		<c:forEach items="${resources}" var="resource">
     		<div class="menu-cell">
     			<a href="<c:url value="${ resource.uri }"/>">${ resource.name }</a>
   			</div>
	 	</c:forEach>
	</div>
	<div class="col s1 l1 m1"></div>
</div>