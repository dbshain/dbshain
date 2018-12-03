<%@page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
	<meta charset="UTF-8">

	<title>ログイン画面</title>

	<link rel="stylesheet" type="text/css" href="design.css">
	</head>
	<body>

	<a href="menu.jsp">
	<img src="../black/dentsu.png" width="250" height="60" alt="dentsu">
	</a>

	<form action="Login.action" method="post">

	<p>login ID<input type="text" name="login"></p>
	<p>password<input type="password" name="password"></p>
	<input type="submit" class="button" value="ログイン">
	<input type="button" class="button" value="戻る" onclick="document.location='menu.jsp';">

	</form>


	</body>
</html>
