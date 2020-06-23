<!-- 한글을 제대로 표시하기 위해 contentType을 UTF-8로 설정한다. --> 
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ taglib prefix="spirng" uri="http://www.springframework.org/tags" %> 
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>

	<!-- 메시지 프로퍼티 파일로부터 메시지 내용을 읽어온다. -->
	<spring:message code="common.homeWelcome" />
	
</h1>

<P>${serverTime}. </P>
</body>
</html>
