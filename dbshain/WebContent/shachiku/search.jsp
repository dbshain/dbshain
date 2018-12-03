<%@page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
	<meta charset="UTF-8">
	<title>dentsu Japan</title>
	<link rel="stylesheet" type="text/css" href="design.css">
	</head>
	<body align="center">

	<a href="menu.jsp">
	<img src="../black/dentsu.png" width="250" height="60" alt="dentsu">
	</a>

	<form action = "List.action" method="post">
	<input type="submit" class="button" value="全件検索">
	</form>

	<h2>社員検索</h2>

	<p>検索する名前を入力してください<p>
	<form action = "NameSearch.action" method="post">
	<input type="text" name="name">
	<input type="submit" class="button" value="検索">
	</form>
	<p>

	検索する住所を入力してください<br>

	<form action = "AddressSearch.action" method="post">
	<input type="text" name="address">
	<input type="submit" class="button" value="検索">
	</form>

	<br>

	<p>
	<form action = "Dep_NoSearch.action" method="post">
	部署検索<select name="dep_no">
	<p><option value=""></option></p>
	<option value="1">総務部</option>
	<option value="2">企画部</option>
	<option value="3">人事部</option>
	<option value="4">営業部</option>
	<option value="5">製造部</option>
	<option value="6">技術部</option>
	</select>
	<input type="submit" class="button" value="検索">
	</form>
	<p>

	<br><br>

	<p>
	<form action = "Pos_NoSearch.action" method="post">
	<p>役職検索</p>
	<p><input type="radio" name="pos_no" value="1">一般社員</p>
	<p><input type="radio" name="pos_no" value="2">主任</p>
	<p><input type="radio" name="pos_no" value="3">課長</p>
	<p><input type="radio" name="pos_no" value="4">部長</p>
	<p><input type="radio" name="pos_no" value="5">専務</p>
	<p><input type="radio" name="pos_no" value="6">社長</p>
	<input type="submit" class="button" value="検索">
	</form>
	<p>

	</body>
</html>