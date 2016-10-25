<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "spring" uri = "http://www.springframework.org/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link type="text/css" rel="stylesheet" href="<c:url value="/resources/css/materialize.min.css"/>"  media="screen,projection"/>
<link type="text/css" rel="stylesheet" href="<c:url value="/resources/css/style.css"/>"/>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<c:set var="titleKey"><tiles:getAsString name="titleKey"/></c:set>
<title><spring:message code = "${titleKey}"/></title>
</head>
<body>
	<div><tiles:insertAttribute name="header"/></div>  
	<div><tiles:insertAttribute name="menu"/></div>  
	<div><tiles:insertAttribute name="body"/></div>  
	<div><tiles:insertAttribute name="footer"/></div>
	
	<script type="text/javascript" src="<c:url value="/resources/js/jquery-3.1.1.min.js"/>"></script>
	<script type="text/javascript" src="<c:url value="/resources/js/materialize.min.js"/>"></script>
</body>
</html>