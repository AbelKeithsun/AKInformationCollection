<%@ page 
 contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<html>
<head>
	<title>项目第一页</title>
	<link rel="stylesheet" type="text/css" href="../css/index.css">
	<link rel="stylesheet" type="text/css" href="../css/common.css">
</head>
<body>
<header>
<h1 class="first_moto">欢迎使用上线提测系统进行上线资料填写</h1>
<h4 class="second_moto">程序让工作更美好。。。</h4>
</header>
<form id="sqlData">
<div class="dateModel">
	<h3><span style="color:red;">上线日期:</span> <input id="onlineDate" type="date" name="onlineDate"/></h3>
</div>
<div id="testCode" style="float:left;">
<h2>测试环境</h2>
<div><div><span>create 语句</span></div> <textarea id="testCreateSql" name="testCreateSql"></textarea></div>
<div><div><span>create-rollback 语句</span></div> <textarea id="testCreateRollbackSql" name="testCreateRollbackSql"></textarea></div>
<div><div><span>alter 语句</span></div> <textarea id="testAlterSql" name="testAlterSql"></textarea></div>
<div><div><span>alter-rollback 语句</span></div> <textarea id="testAlterRollbackSql" name="testAlterRollbackSql"></textarea></div>
<div><div><span>update 语句</span></div> <textarea id="testUpdateSql" name="testUpdateSql"></textarea></div>
<div><div><span>update-rollback 语句</span></div> <textarea id="testUpdateRollbackSql" name="testUpdateRollbackSql"></textarea></div>
<div><div><span>insert 语句</span></div> <textarea id="testInsertSql" name="testInsertSql"></textarea></div>
<div><div><span>insert-rollback 语句</span></div> <textarea id="testInsertRollbackSql" name="testInsertRollbackSql"></textarea></div>
<div><div><span>delete 语句</span></div> <textarea id="testDeleteSql" name="testDeleteSql"></textarea></div>
<div><div><span>delete-rollback 语句</span></div> <textarea id="testDeleteRollbackSql" name="testDeleteRollbackSql"></textarea></div>
</div>
<div id="pdCode" style="float:right;">
<h2>生产环境</h2>
<div><div><span>create 语句</span></div> <textarea id="pdCreateSql" name="pdCreateSql"></textarea></div>
<div><div><span>create-rollback 语句</span></div> <textarea id="pdCreateRollbackSql" name="pdCreateRollbackSql"></textarea></div>
<div><div><span>alter 语句</span></div> <textarea id="pdAlterSql" name="pdAlterSql"></textarea></div>
<div><div><span>alter-rollback 语句</span></div> <textarea id="pdAlterRollbackSql" name="pdAlterRollbackSql"></textarea></div>
<div><div><span>update 语句</span></div> <textarea id="pdUpdateSql" name="pdUpdateSql"></textarea></div>
<div><div><span>update-rollback 语句</span></div> <textarea id="pdUpdateRollbackSql" name="pdUpdateRollbackSql"></textarea></div>
<div><div><span>insert 语句</span></div> <textarea id="pdInsertSql" name="pdInsertSql"></textarea></div>
<div><div><span>insert-rollback 语句</span></div> <textarea id="pdInsertRollbackSql" name="pdInsertRollbackSql"></textarea></div>
<div><div><span>delete 语句</span></div> <textarea id="pdDeleteSql" name="pdDeleteSql"></textarea></div>
<div><div><span>delete-rollback 语句</span></div> <textarea id="pdDeleteRollbackSql" name="pdDeleteRollbackSql"></textarea></div>
</div>
<input id="sqlBackFlag" name="sqlBackFlag" style="display:none"/>
</form>
<input name="submit" value="submit" type="button" id="submit"/>
</body>
<script src="../jquery/jquery-3.1.1.min.js"></script>
<script src="../jquery/jquery.cookie.js"></script>
<script type="text/javascript">
$('#submit').click(function(){
	var data = $('#sqlData').serialize();
	$.ajax({
		"url":"../main/handle_sqlData.do",
		"data":data,
		"type":"POST",
		"dataType":"json",
		"success":function(obj){
			if (obj.state == 1) {
				// 跳转到主页
				// /user/login.do
				// /main/index.do
				alert(obj.message);
				location.href = "../main/index.do";
			} else {
				alert(obj.message);
				//$("#showResult").html(obj.message);
			}
		},
		"error":function(obj){
			alert("系统发生错误,请联系管理员");
		}
	});
});

//根据上线日期进行数据回显
$("#onlineDate").on("change",function(){
	var date = "date="+ $("#onlineDate").val();
	clearAll();
	$.ajax({
		"url":"../main/dataBack.do",
		"data":date,
		"type":"POST",
		"dataType":"json",
		"success":function(obj){
			if (obj.state == 1) {
				var buck = obj.datas[0].result;
				$("#testCreateSql").val(buck.testCreateSql);
				$("#testCreateRollbackSql").val(buck.testCreateRollbackSql);
				$("#testAlterSql").val(buck.testAlterSql);
				$("#testAlterRollbackSql").val(buck.testAlterRollbackSql);
				$("#testUpdateSql").val(buck.testUpdateSql);
				$("#testUpdateRollbackSql").val(buck.testUpdateRollbackSql);
				$("#testInsertSql").val(buck.testInsertSql);
				$("#testInsertRollbackSql").val(buck.testInsertRollbackSql);
				$("#testDeleteSql").val(buck.testDeleteSql);
				$("#testDeleteRollbackSql").val(buck.testDeleteRollbackSql);
				$("#pdCreateSql").val(buck.pdCreateSql);
				$("#pdCreateRollbackSql").val(buck.pdCreateRollbackSql);
				$("#pdAlterSql").val(buck.pdAlterSql);
				$("#pdAlterRollbackSql").val(buck.pdAlterRollbackSql);
				$("#pdUpdateSql").val(buck.pdUpdateSql);
				$("#pdUpdateRollbackSql").val(buck.pdUpdateRollbackSql);
				$("#pdInsertSql").val(buck.pdInsertSql);
				$("#pdInsertRollbackSql").val(buck.pdInsertRollbackSql);
				$("#pdDeleteSql").val(buck.pdDeleteSql);
				$("#pdDeleteRollbackSql").val(buck.pdDeleteRollbackSql);
				$("#sqlBackFlag").val("1");//说明数据库有数据，进行标记，再次提交看到这个数字就进行数据更新而不是插入
			} else if(obj.state == 2){//没有数据回显将标记去除
				$("#sqlBackFlag").val("");
			}
		},
		"error":function(obj){
			alert("数据回显发生错误,请联系管理员");
		}
	});
});
	function clearAll(){
		$("#testCreateSql").val("");
		$("#testCreateRollbackSql").val("");
		$("#testAlterSql").val("");
		$("#testAlterRollbackSql").val("");
		$("#testUpdateSql").val("");
		$("#testUpdateRollbackSql").val("");
		$("#testInsertSql").val("");
		$("#testInsertRollbackSql").val("");
		$("#testDeleteSql").val("");
		$("#testDeleteRollbackSql").val("");
		$("#pdCreateSql").val("");
		$("#pdCreateRollbackSql").val("");
		$("#pdAlterSql").val("");
		$("#pdAlterRollbackSql").val("");
		$("#pdUpdateSql").val("");
		$("#pdUpdateRollbackSql").val("");
		$("#pdInsertSql").val("");
		$("#pdInsertRollbackSql").val("");
		$("#pdDeleteSql").val("");
		$("#pdDeleteRollbackSql").val("");
		$("#sqlBackFlag").val("");
	}
</script>
</html>