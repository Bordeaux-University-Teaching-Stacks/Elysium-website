<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div class="row menu-wrapper">
	<div class="col s2 l2 m2"></div>
	<div class="col s8 l8 m8">
		<c:forEach items="${resources}" var="resource">
     		<div id="menu_${ resource.id }">
     			<a href="<c:url value="${ resource.uri }"/>">${ resource.name }</a>
     		</div>
	 	</c:forEach>
	</div>
	<div class="col s2 l2 m2"></div>
</div>