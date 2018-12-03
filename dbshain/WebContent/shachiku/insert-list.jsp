<%@page contentType="text/html; charset=UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
	<head>
	<meta charset="UTF-8">

	<title></title>
	</head>
	<body align="center">
	<p id=h1>実行結果</p>


		${errorMessage}




<c:if test="${not empty list}">
<blockquote>
		<table  align="center">
		<th>番号</th><th>名前</th><th>住所</th><th>部署</th><th>役職</th>
		<c:forEach var="s" items="${list}">
			<tr><td align="right">
			${s.no}</td><td>${s.name }</td><td>${s.address }</td><td>${param.dep_name }</td><td>${param.pos_name }</td>
		</c:forEach>
		</tr>
		</table>
</blockquote>
</c:if>
	<p>

	<button class="button" onclick="history.back()">追加に戻る</button>
	<input type="button" class="button" value="トップに戻る" onclick="document.location='menu.jsp';">
	</body>
</html>
