<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "spring" uri = "http://www.springframework.org/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="shortcut icon" type="image/x-icon" href="<c:url value="/resources/img/favicon.png"/>">
<link type="text/css" rel="stylesheet" href="<c:url value="/resources/css/materialize.min.css"/>"  media="screen,projection"/>
<link type="text/css" rel="stylesheet" href="<c:url value="/resources/css/style.css"/>"/>
<link type="text/css" rel="stylesheet" href="<c:url value="/resources/css/slider.css"/>"/>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<c:set var="titleKey"><tiles:getAsString name="titleKey"/></c:set>
<title><spring:message code = "${titleKey}"/></title>
</head>
<body class="grey lighten-5">
	<div><tiles:insertAttribute name="header"/></div>  
	<div><tiles:insertAttribute name="menu"/></div>  
	<div class="row">
		<div class="col s2 m2 l2"></div>
		<div class="col s8 m8 l8">
			<tiles:insertAttribute name="slider"/>
			<tiles:insertAttribute name="videos"/>
		</div>
		<div class="col s2 m2 l2"></div>
	</div>  
	<div><tiles:insertAttribute name="footer"/></div>
	
	<script type="text/javascript" src="<c:url value="/resources/js/jquery-3.1.1.min.js"/>"></script>
	<script type="text/javascript" src="<c:url value="/resources/js/materialize.min.js"/>"></script>
	<script type="text/javascript" src="<c:url value="/resources/js/slider.plugin.js" />"></script>
	<script type="text/javascript" src="<c:url value="/resources/js/slider.js" />"></script>
</body>
</html>