<%@ page 
 contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<html>
<head>
	<title>项目第一页</title>
</head>
<body>
<header>
<h1>欢迎使用上线提测系统进行上线资料填写</h1>
<h4>程序让工作更美好。。。</h4>
</header>
<form id="sqlData">

<div>
<h2>测试环境</h2>
<h3><span>create 语句</span> <input name="testCreateSql"/></h3>

</div>
</form>
<input name="submit" value="submit" type="button" id="submit"/>
</body>
<script src="../jquery/jquery-3.1.1.min.js"></script>
<script src="../jquery/jquery.cookie.js"></script>
<script type="text/javascript">
$('#submit').click(function(){
	var data = $('#sqlData').serialize();
	$.ajax({
		"url":"../main/test.do",
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