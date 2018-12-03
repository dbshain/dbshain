<%@page contentType="text/html; charset=UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
	<head>

	<meta charset="UTF-8">
	<link rel="stylesheet" type="text/css" href="moji.css">
	<title>電通社員データベースアクセス</title>

	<link rel="stylesheet" type="text/css" href="design.css">
	</head>
	<body align="center">

	<a href="menu.jsp">
	<img src="../black/dentsu.png" width="250" height="60" alt="dentsu">
	</a>

	<p id=h1>検索結果</p>

		${errorMessage}

<c:if test="${not empty list}">
		<blockquote>
		<table  align="center">
		<th>社員番号</th><th>名前</th><th>住所</th><th>部署No</th><th>役職No</th>
		<c:forEach var="s" items="${list }">
			<tr><td align="right">
			${s.no}</td><td>${s.name }</td><td>${s.address }</td><td>${s.dep_no}</td><td>${s.pos_no }</td>


</c:forEach>
			</tr>

		</table><p>
</blockquote>
</c:if>
				<p>




	<p><p>

	<button type="button" class="button" onclick="history.back()">戻る</button>


	</body>
</html>




