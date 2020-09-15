<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
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

<title>TPM</title>

<!-- Bootstrap core CSS -->
<link href="css/bootstrap.min.css" rel="stylesheet">
<!-- Custom styles for this template -->
<link href="css/custom.css" rel="stylesheet">
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
	<!-- /container -->

	<!--  Logo 部位        -->
	<!-- Fixed navbar -->
	<nav class="navbar navbar-default">
		<div>
			<div class="row logobar">
				<div class="col-xs-2 text-right" style="vertical-align: middle;">
					<img class="logo img-responsive" alt="logo" src="image/logo.png">
				</div>
				<div class="col-xs-7">
					<h3 class="display-5  title hmargin">Order Tracking System</h3>
					<h3 class="display-5  title hmargin">
						<small class="display-5  title">订单追踪系统</small>
					</h3>
				</div>
				<s:if test="%{#session.staff != null}">
					<div class="col-xs-2">
						<div class="row text-right">
							<h4 class="display-5  title text-right">${staff.name}</h4>
							<h5 class="display-5 title text-right">
								欢迎你！<a href='ReSetPasswordViewAction'>修改密码</a>
							</h5>
						</div>
					</div>
					<div class="col-xs-1"
						style="display: table-cell; vertical-align: middle; text-align: center;">
						<img class="img-responsive" alt="" src="image/head.png"
							width="50px">
					</div>
				</s:if>
			</div>
		</div>
		<s:if test="%{#session.staff != null}">
			<div class="container">
				<div class="navbar-header">
					<!-- The mobile navbar-toggle button can be safely removed since you do not need it in a non-responsive implementation -->

				</div>
				<!-- Note that the .navbar-collapse and .collapse classes have been removed from the #navbar -->
				<div id="navbar">
					<ul class="nav navbar-nav">
						<li <s:if test="#active=='home'">class="active"</s:if>><a
							href="home">首页</a></li>
						<li
							class="dropdown <s:if test="%{#active == 'ProductionExecute'}">active</s:if>"><a
							href="#" class="dropdown-toggle" data-toggle="dropdown"
							role="button" aria-haspopup="true" aria-expanded="false">生产执行<span
								class="caret"></span></a>
							<ul id="productionexecute" class="dropdown-menu">
							</ul></li>
						<li
							class="dropdown <s:if test="%{#active == 'MaterialPull'}">active</s:if>"><a
							href="#" class="dropdown-toggle" data-toggle="dropdown"
							role="button" aria-haspopup="true" aria-expanded="false">采购物料拉动<span
								class="caret"></span></a>
							<ul class="dropdown-menu">
								<li><a href="FinalyAssemblyMaterialPull">后段物料拉动</a></li>
							</ul></li>
						<li
							class="dropdown <s:if test="%{#active == 'Order'}">active</s:if>"><a
							href="#" class="dropdown-toggle" data-toggle="dropdown"
							role="button" aria-haspopup="true" aria-expanded="false">订单信息维护<span
								class="caret"></span></a>
							<ul class="dropdown-menu">
								<li><a href="Order">项目信息维护</a></li>
								<li><a href="Batch">Batch维护</a></li>
								<li><a href="MO">MO维护</a></li>
								<!-- 								<li><a href="#">KS-MO维护</a></li> -->
								<li role="separator" class="divider"></li>
								<li><a href="ScheduleMaintenance">计划维护</a></li>
							</ul></li>
						<%-- <li
							class="dropdown <s:if test="%{#active == 'Design'}">active</s:if>"><a
							href="#" class="dropdown-toggle" data-toggle="dropdown"
							role="button" aria-haspopup="true" aria-expanded="false">Design/PIE信息维护<span
								class="caret"></span></a>
							<ul class="dropdown-menu">
								<li><a href="Order">项目交底信息</a></li>
							</ul></li> --%>
						<!--  <li
							class="dropdown <s:if test="%{#active == 'export'}">active</s:if>"><a
							href="#" class="dropdown-toggle" data-toggle="dropdown"
							role="button" aria-haspopup="true" aria-expanded="false">数据导出<span
								class="caret"></span></a>
							<ul class="dropdown-menu">
								<li><a href="MOStatus">MO状态</a></li>
								<li role="separator" class="divider"></li>
								
								<li role="separator" class="divider"></li>
								
							</ul></li>-->
						<li
							class="dropdown <s:if test="%{#active == 'Maintain'}">active</s:if>"><a
							href="#" class="dropdown-toggle" data-toggle="dropdown"
							role="button" aria-haspopup="true" aria-expanded="false">基础数据维护<span
								class="caret"></span></a>
							<ul class="dropdown-menu">
								<li><a href="ProcessLine">产线/区域维护</a></li>
								<li><a href="MethodProcess">工艺过程维护</a></li>
								<li><a href="WorkStation">工位信息维护</a></li>
								<li><a href="QRCode">工位二维码下载</a></li>
								<li role="separator" class="divider"></li>
								<li><a href="BigType">产品大类维护</a></li>
								<li><a href="SmallType">产品小类维护</a></li>
								<li><a href="Routing">工艺路径维护</a></li>
								<li><a href="BatchDTRatio">Batch-DT系数维护</a></li>
								<li role="separator" class="divider"></li>
								<li><a href="KeyComponents">关键物料维护</a></li>
								<li><a href="BulkAction">耗材信息</a></li>
								<li role="separator" class="divider"></li>
								<li><a href="#">员工信息维护</a></li>
							</ul></li>

						<li
							class="dropdown <s:if test="%{#active == 'dashboard'}">active</s:if>"><a
							href="#" class="dropdown-toggle" data-toggle="dropdown"
							role="button" aria-haspopup="true" aria-expanded="false">数据报表<span
								class="caret"></span></a>
							<ul class="dropdown-menu">
								<li><a href="Dashboard">Overview</a></li>
								<li><a href="Dashboard_Order">订单查询</a></li>
								<li><a href="Dashboard_Work_Order">工单查询</a></li>
								<li><a href="Dashboard_Output">计划与产出看板</a></li>
								<li><a href="Dashboard_Abnormal">异常看板</a></li>
								<li><a href="Dashboard_EKitting">EKitting</a></li>
								<!-- <li><a href="DashboardEasergyAction">温控数据下载</a></li>
								<li><a href="FG">产出/WIP统计</a></li>
								<li><a href="Abnormal">异常看板</a></li>
								<li><a href="PLT">PLT</a></li>
								<li role="separator" class="divider"></li> -->
								<!-- <li><a href="#">BOM导入</a></li>
								<li role="separator" class="divider"></li>
								<li><a href="ScheduleMaintenance">计划维护</a></li> -->
							</ul></li>
						<!-- 							
							<li <s:if test="#active=='dashboard'">class="active"</s:if>><a
							href="Dashboard">数据报表</a></li> -->
					</ul>
					<ul class="nav navbar-nav navbar-right">
						<li><a href="QA.jsp">常见问题</a></li>
					</ul>

				</div>
				<!--/.nav-collapse -->
			</div>
		</s:if>
	</nav>
	<!-- Bootstrap core JavaScript
    ================================================== -->
	<!-- Placed at the end of the document so the pages load faster -->
	<script src="js/jquery-1.10.2.min.js"></script>
	<script>
		window.jQuery
				|| document.write('<script src="js/jquery.min.js"><\/script>')
	</script>
	<script src="js/bootstrap.min.js"></script>
	<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
	<script src="js/ie10-viewport-bug-workaround.js"></script>
	<script type="text/javascript">
	$(function() {
	if('<%=session.getAttribute("staff")%>' != 'null') {
				var sltProcessLine = document
						.getElementById("productionexecute");
				$
						.ajax({
							url : '/Otracking/GetProcessLine',
							type : 'GET',
							success : function(data) {
								obj = data;
								var s = "";
								for (var i = 0; i < obj.length; i++) {
									s = s
											+ '<li><a href="ProductionExecute?process_line_id='
											+ obj[i].id + '">' + obj[i].name
											+ '</a></li>';
								}
								sltProcessLine.innerHTML = s;
							}
						});
			}
		});
	</script>

</body>
</html>