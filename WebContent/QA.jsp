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
<link href="css/home.css" rel="stylesheet">
<link href="css/docs.min.css" rel="stylesheet">
<link rel="stylesheet" href="css/bootstrap-table.css">
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
	<%@include file="WEB-INF/jsp/head.jsp"%>

	<div class="container-fluid mycontainer bs-docs-container">
		<div class="row">
			<div class="col-md-10" role="main">
				<div class="bs-docs-section">
					<h1 id="download" class="page-header">系统介绍</h1><br>
					<h3 id="mo">
						<span class="label label-success">系统架构</span>
					</h3>
					<img class="col-xs-12" src="image/architecture.png" alt="" class="img-thumbnail">
					<br>
					<h3 id="mo">
						<span class="label label-success">功能介绍</span>
					</h3><br>
					<h3 id="mo">
						<span class="label label-success">后续计划</span>
					</h3><br>
				</div>
				<div class="bs-docs-section">
					<h1 id="whats-included" class="page-header">常见问题</h1><br>
					<h3 id="wip">
							<span class="label label-success">用户注册</span>
					</h3>
					<h4>发送Email到 jinyan.song@schneider-electric.com 获取</h4>
					<h5>Email内容包含：</h5><p>SESA号：SESA******;<br>姓名：***;</p>
					<h3 id="mo">
						<span class="label label-success">系统配置</span>
					</h3><br>
					<h3 id="wip">
							<span class="label label-success">扫码枪配置</span>
					</h3><br>
					<img class="col-xs-12" src="image/ScanSet.png" alt="" class="img-thumbnail">
					<br>
					<h3 id="wip">
							<span class="label label-success">扫码枪乱码</span>
					</h3><br>
					<img class="col-xs-12" src="image/ScanCharset.png" alt="" class="img-thumbnail">
					<br>
					<h3 id="wip">
							<span class="label label-success">扫码枪使用</span>
					</h3><br>
					<img class="col-xs-12 hrbottom" src="image/ScanUse.png" alt="" class="img-thumbnail">
					<br><img class="col-xs-12" src="image/ScanTip.png" alt="" class="img-thumbnail">
					<br>
				</div>
			</div>
			<div class="col-xs-2" role="complementary">
				<nav class="bs-docs-sidebar hidden-print hidden-xs hidden-sm">
					<ul class="nav bs-docs-sidenav">
						<li><a href="#download">系统介绍</a>
						<ul class="nav">
							<li><a href="#mo">功能介绍</a></li>
							<li><a href="#wip">后续计划</a></li>
							</ul></li>
						<li><a href="#whats-included">常见问题</a>
							<ul class="nav">
							<li><a href="#wip">用户注册</a></li>
							<li><a href="#mo">系统配置</a></li>
							<li><a href="#wip">扫码枪配置</a></li>
							<li><a href="#wip">扫码枪乱码</a></li>
							</ul></li>
					</ul>
					<a class="back-to-top" href="#top"> 返回顶部 </a>
				</nav>
			</div>
		</div>
	</div>

	<%@include file="WEB-INF/jsp/bottom.jsp"%>
	<!-- Bootstrap core JavaScript
    ================================================== -->
	<!-- Placed at the end of the document so the pages load faster -->
	<script type="text/javascript" src="js/jquery-1.10.2.min.js"></script>
	<script>
		window.jQuery
				|| document.write('<script src="js/jquery.min.js"><\/script>')
	</script>
	<script src="js/bootstrap.min.js"></script>
	<script src="js/bootstrap3-typeahead.js"></script>
	<script src="js/bootstrap-table.js"></script>
	<script src="js/bootstrap-table-zh-CN.js"></script>
	<script type="text/javascript" src="js/Chartbundle.js"></script>
	<script type="text/javascript" src="js/utils.js"></script>
	<script type="text/javascript" src="js/docs.min.js"></script>
	<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
	<script src="js/ie10-viewport-bug-workaround.js"></script>
	<script type="text/javascript">
		
	</script>
</body>
</html>