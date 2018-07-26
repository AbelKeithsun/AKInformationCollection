<%@ page 
 contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>login on the world</title>
	<link rel="stylesheet" type="text/css" href="../css/login.css">
	<link rel="stylesheet" type="text/css" href="../css/common.css">
    <script type="text/javascript">
        function checkName() {
          var name = document.getElementById("userName");
          var p = document.getElementById("p");
          var exp = /^[a-z0-9A-Z]{4,10}$/;
          if(exp.test(name.value)){
            p.innerHTML="right format";
          }else if(name.value==""||name.value==undefine){
          	p.innerHTML="don't empty"
          }else{
        	p.innerHTML="The formatting error of this name";  
          }
        }
    </script>

</head>
<body>
	<header class="header">
		<div class="logo">
			<a href="#"><img src="../imgs/minelogo.png"></a>
			<span>Welcome use this web</span>
		</div>
	</header>
	<nav class="nav">
		<ul>
			<li><a href="#">home</a></li>
			<li><a href="#">info</a></li>
			<li><a href="#">work</a></li>
			<li><a href="#">game</a></li>
		</ul>
	</nav>
	<div class="container">
		<form id="loginInfo" method="post" name="loginInfo">
			<div class="blackblock">
				<h1>
					<span style="float: left; margin: 0px 0px 0px -5px;"
						font-size="13px"> Software development makes work better</span> <span>
						<a herf="#">creater</a>
					</span>
				</h1>
				<div class="culbname">
					<div>
						<input id="userName" onblur="checkName()" type="text"
							placeholder="please enter username"> <span></span>
					</div>
				</div>
				<p id="p">please enter password</p>
				<div class="culbpassword">
					<div>
						<input id="password" type="password" placeholder="enter password"> <span></span>
					</div>
				</div>
				<div class="check">
					<input class="fl" type="checkbox"> <span class="fl">remeber</span>
					<a class="fr" href="#">forget the password?</a>
				</div>
				<div class="denglu">
					<input id="bt_login" class="button_login" type="button" value="logOn">
				</div>
			</div>
		</form>
	</div>

	<footer>
		<div><p style = "">abelkeith public Welcome everyone</p></div>
	</footer>

</body>
<script src="../jquery/jquery-3.1.1.min.js"></script>
<script src="../jquery/jquery.cookie.js"></script>
<script>
$('#bt_login').click(function(){
	var data = "userName="+$("#userName").val()+"&password="+$("#password").val();
	$.ajax({
		"url":"../user/handle_login.do",
		"data":data,
		"type":"POST",
		"dataType":"json",
		"success":function(obj){
			if (obj.state == 1) {
				// 跳转到主页
				// /user/login.do
				// /main/index.do
				location.href = "../main/index.do";
			} else {
				alert(obj.message);
				//$("#showResult").html(obj.message);
			}
		},
		"error":function(obj){
			alert("登录发生错误,请联系管理员");
		}
	});
});
</script>
</html>