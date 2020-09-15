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
<!-- Note there is no responsive meta tag here -->

<link rel="icon" href="image/favicon.ico">

<title>Otracking</title>

<!-- Bootstrap core CSS -->
<link href="css/bootstrap.min.css" rel="stylesheet">
<!-- Loading Flat UI Pro -->
<link href="css/bootstrap-datetimepicker.min.css" rel="stylesheet"
	media="screen">

<link rel="stylesheet" href="css/bootstrap-table.css">
<link href="css/bootstrap-editable.css" rel="stylesheet">

<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
<link href="css/ie10-viewport-bug-workaround.css" rel="stylesheet">

<!-- Custom styles for this template -->
<link href="css/non-responsive.css" rel="stylesheet">
<link href="css/custom.css" rel="stylesheet">
<link href="css/home.css" rel="stylesheet">
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
	<div class="">
		<div class="container-fluid mycontainer">
			<div class="row">
			<h3>
				<span class="label label-success">修改密码</span>
			</h3>
				<div class="col-xs-1"></div>
				<div class="col-xs-5 hr">
				<br><br>
					<form id="defaultForm" action="ReSetPasswordAction" method="post" class="form-horizontal">
						<div class="form-group">
							<div class="col-sm-offset-3 col-sm-9">
								<h4 class="text-danger">${reset_password_error}</h4>
							</div>
							<label for="inputSESAID"
								class="col-sm-3 control-label">旧密码:</label>
							<div class="col-sm-6">
								<input name="old_password" type="password"
									class="form-control" id="inputPassword3" placeholder="Old Password">
								<span class="help-block" id="password" />
							</div>
							
						</div>
						<div class="form-group">
							<label for="inputPassword3"
								class="col-sm-3 control-label">新密码:</label>
							<div class="col-sm-6">
								<input name="new_password" type="password"
									class="form-control" id="inputPassword3" placeholder="New Password">
								<span class="help-block" id="password" />
							</div>
						</div>
						<div class="form-group">
							<label for="inputPassword3"
								class="col-sm-3 control-label">确认密码:</label>
							<div class="col-sm-6">
								<input name="confirm_password" type="password"
									class="form-control" id="inputPassword3" placeholder="Confirm Password">
								<span class="help-block" id="password" />
							</div>
						</div>
						<div class="form-group">
							<div class="col-sm-offset-6 col-sm-2">
								<button type="submit" class="btn btn-default">Save</button>
							</div>
						</div>
						
					</form>
					<br><br><br><br>
				</div>
				<div class="col-xs-5">
				<p><br><br><br>
				1.请勿使用默认密码登录系统;<br>2.请勿使用他人账户登录系统;<br>3.系统使用MD5+非完整秘钥存储的方式保护用户账户安全，使其不可逆运算,即使使用个人常用密码也不会被逆运算成明文密码;<br><code>例如：123456会转化为：e10adc3949ba59abbe56e057f20f883e</code><br>
				4.重置密码请使用本人邮箱发SESA号到<a href="mailto:jinyan.song@se.com&subject=Otracking Reset Password&body=Hi frank: ${staff.sesaid } : ${staff.name } Reset password to 123">jinyan.song@se.com</a>;<br/>
				</p>
				</div>
				<div class="col-xs-1"></div>
				<br><br><br>
			</div>
		</div>
		
	</div>
	<%@include file="bottom.jsp"%>
	<!-- Bootstrap core JavaScript
    ================================================== -->
	<!-- Placed at the end of the document so the pages load faster -->
	<script>
		window.jQuery
				|| document.write('<script src="js/jquery-1.10.2.min.js"><\/script>')
	</script>
	<script type="text/javascript" src="js/jquery-1.10.2.min.js"></script>
    <script type="text/javascript" src="js/bootstrap.min.js"></script>
    <script type="text/javascript" src="js/bootstrapValidator.js"></script>
	<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
	<script src="js/ie10-viewport-bug-workaround.js"></script>
 <script type="text/javascript">
	$(document).ready(function() {
	    $('#defaultForm').bootstrapValidator({
	        message: 'This value is not valid',
	        feedbackIcons: {
	            valid: 'glyphicon glyphicon-ok',
	            invalid: 'glyphicon glyphicon-remove',
	            validating: 'glyphicon glyphicon-refresh'
	        },
	        fields: {
	        	'staff.sesaid': {
	                container: '#sesaid',
	                validators: {
	                    notEmpty: {
	                        message: 'The SESAID is required and cannot be empty'
	                    }
	                }
	            },
	            'staff.password': {
	                container: '#password',
	                validators: {
	                    notEmpty: {
	                        message: 'The Password is required and cannot be empty'
	                    }
	                }
	            }
	        }
	    });
	});
</script>
</body>
</html>