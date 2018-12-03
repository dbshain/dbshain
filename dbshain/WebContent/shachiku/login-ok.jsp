<%@page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
	<meta charset="UTF-8">
	<link rel="stylesheet" type="text/css" href="design.css">
	<title>ログイン成功画面</title>

	<script>

	function clickBtn(){
	  //テキストボックスオブジェクトを取得する
		 const str1 = document.getElementById("pos_name").value;
		 const str2 = document.getElementById("dep_name").value;
	  //valueに値をセットする
		document.getElementById("span1").textContent = str1;
		document.getElementById("span2").textContent = str2;
	}
	</script>

	</head>
	<body>
	<script>
    window.onpageshow = function(){
    document.getElementById("f1").reset();
    };
    </script>


	<a href="menu.jsp">
	<img src="../black/dentsu.png" width="250" height="60" alt="dentsu">
	</a>
	<br>
	こんにちは、${user.user_id}さん。

	<p>追加する社員の情報を入力してください<p>
	<form action = "Insert.action" method="post">
	社員番号　<input type="text" name="no" disabled="disabled"><br>
	名前　　　<input type="text" name="name"><br>
	住所　　　<textarea name="address" cols="22" rows="5" ></textarea><br>

<p>部署
	<select id="dep_name" name="dep_name">
	    <option  value="総務部" >1</option>
	    <option value="企画部">2</option>
	    <option value="人事部">3</option>
	    <option value="営業部">4</option>
	    <option value="製造部">5</option>
	    <option value="技術部">6</option>
	</select>

<span id="span1"></span></p>








<p>	役職
<select id="pos_name" name="pos_name">
	    <option  value="一般社員" >1</option>
	    <option value="主任">2</option>
	    <option value="課長">3</option>
	    <option value="部長">4</option>
	    <option value="専務">5</option>
	    <option value="社長">6</option>
	</select>

<span id="span2"></span></p>


<input type="button" class="button" value="確認" onclick="clickBtn()"/>
<input type="submit" class="button" value="登録">
	</form>

	<input type="button" value="ログアウト" onClick="document.location='logout.jsp';">







	</body>
</html>