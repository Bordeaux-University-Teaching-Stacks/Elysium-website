<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div class="theme-default">
	<div class="slider nivoSlider">
		<c:forEach items="${news}" var="news">
	    	<a href="<c:url value="/news/${news.id}"/>"><img src="<c:url value="${news.coverageImage}" />" title="${news.title}" border="0"/></a>
	    </c:forEach>
	</div> 
</div>