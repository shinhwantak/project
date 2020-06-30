<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<h2>
	<spring:message code="codedetail.header.list" />
</h2>
<a href="register"><spring:message code="action.new" /></a>
<table border="1">
	<tr>
		<th align="center" width="160"><spring:message
				code="codedetail.classCode" /></th>
		<th align="center" width="160"><spring:message
				code="codedetail.codeValue" /></th>
		<th align="center" width="160"><spring:message
				code="codedetail.codeName" /></th>
		<th align="center" width="160"><spring:message
				code="codedetail.sortSeq" />
		<th align="center" width="180"><spring:message
				code="codedetail.regdate" /></th>
	</tr>
</table>

<c:choose>
	<c:when test="${empty list}">
		 <tr>
		 	<td colspan="5">
		 		<spring:message code="common.listEmpty" />
		 	</td>
		 </tr>
	</c:when>
	<c:otherwise>

	</c:otherwise>
</c:choose>