<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<!-- The above 2 meta tags *must* come first in the head; any other head content must come *after* these tags -->
<meta name="description" content="">
<meta name="author" content="stonejinyan">
<meta http-equiv="rrefresh" content="60">
<!-- Note there is no responsive meta tag here -->

<link rel="icon" href="image/favicon.ico">

<title>Otracking</title>

<!-- Bootstrap core CSS -->
<link href="css/bootstrap.min.css" rel="stylesheet">
<!-- Loading Flat UI Pro -->
<link href="css/flat-ui.css" rel="stylesheet">
<link href="css/home.css" rel="stylesheet">
<link rel="stylesheet" href="css/bootstrap-table.css">
<link href="css/bootstrap-editable.css" rel="stylesheet">
<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
<link href="css/ie10-viewport-bug-workaround.css" rel="stylesheet">

<!-- Custom styles for this template -->
<link href="css/non-responsive.css" rel="stylesheet">

<!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
<!--[if lt IE 9]><script src="../../assets/js/ie8-responsive-file-warning.js"></script><![endif]-->
<script src="js/ie-emulation-modes-warning.js"></script>

<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!--[if lt IE 9]>
      <script src="js/html5shiv.min.js"></script>
      <script src="js/respond.min.js"></script>
    <![endif]-->
</head>

<body>
	<%@include file="head.jsp"%>
	<div class="container-fluid mycontainer">
		<h3>
			<span class="label label-success">当日生产计划维护</span>
		</h3>
		<div class="row">
			<div class="col-xs-3">
				<br>
				<button onclick="refreshSchedule()" class="btn btn-success"
					type="button">刷新当日生产计划</button>
			</div>
		</div><br>
		<s:if test="%{#session.staff.role_id==2}">
		<div class="row">
			<div class="col-xs-9">
				<div class="form-inline" herf="">
					<div class="form-group">
						<label class="sr-only" for="exampleInputAmount">123</label>
						<div class="input-group">
							<div class="input-group-addon">Target:</div>
							<input type="text" class="form-control" id="InputTarget"
								placeholder="Amount">
							<div class="input-group-addon">台</div>
						</div>
					</div>
					<button onclick="saveTarget()" class="btn btn-primary">Save</button>
				</div>
			</div>
		</div>
		</s:if>
		<br>
	</div>
	<%@include file="bottom.jsp"%>
	<!-- Bootstrap core JavaScript
    ================================================== -->
	<!-- Placed at the end of the document so the pages load faster -->
	<script type="text/javascript" src="js/jquery-1.10.2.min.js"></script>
	<script>
		window.jQuery
				|| document.write('<script src="js/jquery.min.js"><\/script>')
	</script>
	<script src="js/bootstrap.min.js"></script>
	<script src="js/bootstrap-editable.js"></script>
	<script src="js/bootstrap-table.js"></script>
	<script src="js/bootstrap-table-locale-all.min.js"></script>
	<script src="js/bootstrap-table-editable.js"></script>
	<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
	<script type="text/javascript">
		var lang = navigator.language || navigator.userLanguage;
		function refreshSchedule() {
			$.ajax({
				url : '/Otracking/RefreshSchedule',
				type : 'GET',
				success : function(data) {
					alert(data);
				}
			});
		}
		function saveTarget(){
			$.ajax({
				url : '/Otracking/SaveMonthTarget?target='+$("#InputTarget").val(),
				type : 'GET',
				success : function(data) {
					alert(data);
				}
			});
		}
	</script>
</body>
</html>