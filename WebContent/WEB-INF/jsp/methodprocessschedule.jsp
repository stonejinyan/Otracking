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
<link href="css/bootstrap-datetimepicker.min.css" rel="stylesheet"
	media="screen">

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
<style type="text/css">
</style>
</head>

<body>
	<%@include file="head.jsp"%>
	<div class="container-fluid mycontainer">
		<h3>
			<span class="label label-success"><a style="color: #f5f5f5"
				href="ProductionExecute?process_line_id=${ProcessLine.id}">${ProcessLine.name}</a>
				→ ${MethodProcess.name}生产计划</span>
		</h3>
		<br>
		<div>
			<!-- Nav tabs -->
			<ul class="nav nav-tabs" role="tablist">
				<li role="presentation" class="active"><a href="#home"
					aria-controls="home" role="tab" data-toggle="tab">可开工</a></li>
				<li role="presentation"><a href="#profile"
					aria-controls="profile" role="tab" data-toggle="tab">生产中</a></li>
				<li role="presentation"><a href="#messages"
					aria-controls="messages" role="tab" data-toggle="tab">中断</a></li>
				<li role="presentation"><a href="#settings1"
					aria-controls="settings1" role="tab" data-toggle="tab">未达开工条件</a></li>
				<li role="presentation"><a href="#settings"
					aria-controls="settings" role="tab" data-toggle="tab">生产结束</a></li>
				<li role="presentation"><a href="#EKitting"
					aria-controls="settings" role="tab" data-toggle="tab">E-Kitting</a></li>
			</ul>

			<!-- Tab panes -->
			<div class="tab-content">
				<!--可开工 -->
				<div role="tabpanel" class="tab-pane active" id="home">
					<div class="col-xs-12">
						<div class="panel-body"
							style="padding-bottom: 0px; padding-top: 0px;">
							<%-- <h3 id="FQC">
								<s:if test="%{#MethodProcess.name == 'FQC/FAT'}">
									<span class="label label-success">FQC</span>
								</s:if>
							</h3> --%>
							<table id="table1">
							</table>
						</div>
					</div>
					<s:if test="%{#MethodProcess.name == 'FQC/FAT'}">
						<div class="col-xs-12">
							<div class="panel-body" style="padding-bottom: 0px;">
								<h3 id="label">
									<span class="label label-success">挂合格证</span>
								</h3>
								<table id="table6">
								</table>
							</div>
						</div>
						<div class="col-xs-12">
							<div class="panel-body" style="padding-bottom: 0px;">
								<h3 id="FAT">
									<span class="label label-success">FAT</span>
								</h3>
								<table id="table11">
								</table>
							</div>
						</div>
					</s:if>
				</div>
				<!--可开工结束 -->
				<!--生产中-->
				<div role="tabpanel" class="tab-pane" id="profile">
					<div class="col-xs-12">
						<div class="panel-body"
							style="padding-bottom: 0px; padding-top: 0px;">
							<%-- 	<h3 id="FQC">
								<s:if test="%{#MethodProcess.name == 'FQC/FAT'}">
									<span class="label label-success">FQC</span>
								</s:if>
							</h3> --%>
							<table id="table2">
							</table>
						</div>
					</div>
					<s:if test="%{#MethodProcess.name == 'FQC/FAT'}">
						<div class="col-xs-12">
							<div class="panel-body" style="padding-bottom: 0px;">
								<h3 id="label">
									<span class="label label-success">挂合格证</span>
								</h3>
								<table id="table7">
								</table>
							</div>
						</div>
						<div class="col-xs-12">
							<div class="panel-body" style="padding-bottom: 0px;">
								<h3 id="FAT">
									<span class="label label-success">FAT</span>
								</h3>
								<table id="table12">
								</table>
							</div>
						</div>
					</s:if>
				</div>
				<!--生产中结束-->
				<!--中断-->
				<div role="tabpanel" class="tab-pane" id="messages">
					<div class="col-xs-12">
						<div class="panel-body"
							style="padding-bottom: 0px; padding-top: 0px;">
							<%-- <h3 id="FQC">
								<s:if test="%{#MethodProcess.name == 'FQC/FAT'}">
									<span class="label label-success">FQC</span>
								</s:if>
							</h3> --%>
							<table id="table3">
							</table>
						</div>
					</div>
					<s:if test="%{#MethodProcess.name == 'FQC/FAT'}">
						<div class="col-xs-12">
							<div class="panel-body" style="padding-bottom: 0px;">
								<h3 id="label">
									<span class="label label-success">挂合格证</span>
								</h3>
								<table id="table8">
								</table>
							</div>
						</div>
						<div class="col-xs-12">
							<div class="panel-body" style="padding-bottom: 0px;">
								<h3 id="FAT">
									<span class="label label-success">FAT</span>
								</h3>
								<table id="table13">
								</table>
							</div>
						</div>
					</s:if>
				</div>
				<!--中断结束-->
				<!--未达开工条件-->
				<div role="tabpanel" class="tab-pane" id="settings">
					<div class="col-xs-12">
						<div class="panel-body"
							style="padding-bottom: 0px; padding-top: 0px;">
							<%-- <h3 id="FQC">
								<s:if test="%{#MethodProcess.name == 'FQC/FAT'}">
									<span class="label label-success">FQC</span>
								</s:if>
							</h3> --%>
							<table id="table4">
							</table>
						</div>
					</div>
					<s:if test="%{#MethodProcess.name == 'FQC/FAT'}">
						<div class="col-xs-12">
							<div class="panel-body" style="padding-bottom: 0px;">
								<h3 id="label">
									<span class="label label-success">挂合格证</span>
								</h3>
								<table id="table9">
								</table>
							</div>
						</div>
						<div class="col-xs-12">
							<div class="panel-body" style="padding-bottom: 0px;">
								<h3 id="FAT">
									<span class="label label-success">FAT</span>
								</h3>
								<table id="table14">
								</table>
							</div>
						</div>
					</s:if>
				</div>
				<!--未达开工条件结束-->
				<!--生产结束-->
				<div role="tabpanel" class="tab-pane" id="settings1">
					<div class="col-xs-12">
						<div class="panel-body"
							style="padding-bottom: 0px; padding-top: 0px;">
							<%-- <h3 id="FQC">
								<s:if test="%{#MethodProcess.name == 'FQC/FAT'}">
									<span class="label label-success">FQC</span>
								</s:if>
							</h3> --%>
							<table id="table5">
							</table>
						</div>
					</div>
					<s:if test="%{#MethodProcess.name == 'FQC/FAT'}">
						<div class="col-xs-12">
							<div class="panel-body" style="padding-bottom: 0px;">
								<h3 id="label">
									<span class="label label-success">挂合格证</span>
								</h3>
								<table id="table10">
								</table>
							</div>
						</div>
						<div class="col-xs-12">
							<div class="panel-body" style="padding-bottom: 0px;">
								<h3 id="FAT">
									<span class="label label-success">FAT</span>
								</h3>
								<table id="table15">
								</table>
							</div>
						</div>
					</s:if>
				</div>
				<!--生产结束结束-->
				<!--EKitting-->
				<div role="tabpanel" class="tab-pane" id="EKitting">
					<div class="col-xs-12">
						<div class="panel-body"
							style="padding-bottom: 0px; padding-top: 0px;">
							<div id="toolbar16">
								<span class="label label-success" style="font-size: 18px">待拉动</span>
							</div>
							<table id="table16">
							</table>
							<div id="toolbar17">
								<span class="label label-success" style="font-size: 18px">已拉动</span>
							</div>
							<table id="table17">
							</table>
						</div>
					</div>
				</div>
				<!--EKitting结束-->
			</div>
		</div>

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
	<script type="text/javascript" src="js/bootstrap-datetimepicker.min.js"
		charset="UTF-8"></script>
	<script type="text/javascript"
		src="js/bootstrap-datetimepicker.zh-CN.js" charset="UTF-8"></script>
	<script src="js/bootstrap-editable.js"></script>
	<script src="js/bootstrap-table.js"></script>
	<script src="js/bootstrap-table-locale-all.min.js"></script>
	<script src="js/bootstrap-table-editable.js"></script>
	<script src="js/combodate.js"></script>
	<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
	<script type="text/javascript">
		var lang = navigator.language || navigator.userLanguage;
		//可开工计划表
		window.operateEvents = {
			'click .Start' : function(e, value, row, index) {
				//alert(row.id);
			}
		};
		function operateFormatter(value, row, index) {
			return [
					'<a href="MethodProductionExecute?id='
							+ row.id
							+ '" class="Start"><button class="btn btn-success" type="button">'
							+ value + '</button></a>', ].join('');
		}
		var tableConfig = {
			url : '/Otracking/GetMethodProcessScheduleAction?method_process_id=${MethodProcess.id}&production_status=1', //请求后台的URL（*）
			method : 'get', //请求方式（*）
			contentType : "application/x-www-form-urlencoded",//必须要有！！！！
			//toolbar : '#FQC', //工具按钮用哪个容器
			striped : true, //是否显示行间隔色
			cache : false, //是否使用缓存，默认为true，所以一般情况下需要设置一下这个属性（*）
			pagination : true, //是否显示分页（*）
			sortable : true, //是否启用排序
			sortOrder : "asc", //排序方式
			//editable : true,
			//queryParams: oTableInit.queryParams,//传递参数（*）
			sidePagination : "server", //分页方式：client客户端分页，server服务端分页（*）
			pageNumber : 1, //初始化加载第一页，默认第一页
			pageSize : 50, //每页的记录行数（*）
			pageList : [ 50, 100, 200 ], //可供选择的每页的行数（*）
			search : true, //是否显示表格搜索，此搜索是客户端搜索，不会进服务端，所以，个人感觉意义不大
			//strictSearch: true,
			//showColumns: true,                  //是否显示所有的列
			showRefresh : true, //是否显示刷新按钮
			//minimumCountColumns: 2,             //最少允许的列数
			//clickToSelect : true, //是否启用点击选中行
			//height: 500,                        //行高，如果没有设置height属性，表格自动根据记录条数觉得表格高度
			uniqueId : "ID", //每一行的唯一标识，一般为主键列
			//showToggle:true,                    //是否显示详细视图和列表视图的切换按钮
			//cardView: false,                    //是否显示详细视图
			//detailView: false,                   //是否显示父子表
			locale : lang,
			columns : [ {
				field : 'id',
				title : '编号',
				align : 'center',
				valign : 'middle',
				sortable : true,
			}, {
				field : 'main_line',
				title : '产线',
				align : 'center',
				valign : 'middle',
				sortable : true,
				width : '100px',
			}, {
				field : 'order_name',
				title : '订单名称',
				align : 'center',
				valign : 'middle',
				sortable : true,
			}, {
				field : 'batch_name',
				title : 'Batch名称',
				align : 'center',
				valign : 'middle',
				width : '120px',
			}, {
				field : 'mo_name',
				title : 'MO名称',
				align : 'center',
				valign : 'middle',
			}, {
				field : 'dms_id',
				title : 'AOP',
				align : 'center',
				valign : 'middle',
			}, {
				field : 'product_bigtype_name',
				title : '产品类型',
				align : 'center',
				valign : 'middle',
			}, {
				field : 'product_type_name',
				title : '产品型号',
				align : 'center',
				valign : 'middle',
			}, {
				field : 'mo_schedule_starttime',
				title : '计划上线时间',
				align : 'center',
				valign : 'middle',
			}, {
				field : 'no',
				title : 'NO',
				align : 'center',
				valign : 'middle',
			}, {
				field : 'actual_starttime',
				title : '开始生产时间',
				align : 'center',
				valign : 'middle',
			}, {
				field : 'actual_endtime',
				title : '结束生产时间',
				align : 'center',
				valign : 'middle',
			}, {
				field : 'flag',
				title : '状态',
				align : 'center',
				valign : 'middle',
				events : operateEvents,
				formatter : operateFormatter
			}, ]
		};
		var url = '/Otracking/GetMethodProcessScheduleAction?method_process_id=${MethodProcess.id}&production_status=';
		for (var i = 1; i < 6; i++) {
			tableConfig.url = url + i;
			$('#table' + i).bootstrapTable(tableConfig);
		}
		window.ekittingoperateEvents = {
			'click .Start' : function(e, value, row, index) {
				$.ajax({
					url : '/Otracking/PullMaterialAction?id='+row.id,
					type : 'GET',
					success : function(data) {
						obj = data;
						alert(obj);
						$('#table16').bootstrapTable('refresh');
						$('#table17').bootstrapTable('refresh');
					}
				});
				
			}
		};
		function ekittingoperateFormatter(value, row, index) {
			return [
					'<a href="#'
							+ row.id
							+ '" class="Start"><button class="btn btn-success" type="button">'
							+ '拉动' + '</button></a>', ].join('');
		}
		var tableConfig16 = {
			url : '/Otracking/GetEKittingListAction?method_process_id=${MethodProcess.id}&flag=0', //请求后台的URL（*）
			method : 'get', //请求方式（*）
			contentType : "application/x-www-form-urlencoded",//必须要有！！！！
			toolbar : '#toolbar16', //工具按钮用哪个容器
			striped : true, //是否显示行间隔色
			cache : false, //是否使用缓存，默认为true，所以一般情况下需要设置一下这个属性（*）
			pagination : true, //是否显示分页（*）
			sortable : true, //是否启用排序
			sortOrder : "asc", //排序方式
			//editable : true,
			//queryParams: oTableInit.queryParams,//传递参数（*）
			sidePagination : "server", //分页方式：client客户端分页，server服务端分页（*）
			pageNumber : 1, //初始化加载第一页，默认第一页
			pageSize : 50, //每页的记录行数（*）
			pageList : [ 50, 100, 200 ], //可供选择的每页的行数（*）
			search : true, //是否显示表格搜索，此搜索是客户端搜索，不会进服务端，所以，个人感觉意义不大
			//strictSearch: true,
			//showColumns: true,                  //是否显示所有的列
			showRefresh : true, //是否显示刷新按钮
			//minimumCountColumns: 2,             //最少允许的列数
			//clickToSelect : true, //是否启用点击选中行
			//height: 500,                        //行高，如果没有设置height属性，表格自动根据记录条数觉得表格高度
			uniqueId : "ID", //每一行的唯一标识，一般为主键列
			//showToggle:true,                    //是否显示详细视图和列表视图的切换按钮
			//cardView: false,                    //是否显示详细视图
			//detailView: false,                   //是否显示父子表
			locale : lang,
			columns : [ {
				field : 'id',
				title : '编号',
				align : 'center',
				valign : 'middle',
			}, {
				field : 'seeeorder',
				title : '订单名称',
				align : 'center',
				valign : 'middle',
				sortable : true,
			}, {
				field : 'batch',
				title : 'Batch名称',
				align : 'center',
				valign : 'middle',
				width : '100px',
			}, {
				field : 'mo_name',
				title : 'MO名称',
				align : 'center',
				valign : 'middle',
			}, {
				field : 'dms_id',
				title : 'AOP',
				align : 'center',
				valign : 'middle',
			}, {
				field : 'mo_classify',
				title : '产品类型',
				align : 'center',
				valign : 'middle',
			}, {
				field : 'mo_type',
				title : '产品型号',
				align : 'center',
				valign : 'middle',
			}, {
				field : 'sap_method_process',
				title : 'SAP段位',
				align : 'center',
				valign : 'middle',
			}, {
				field : 'schedule_starttime',
				title : '排产时间',
				align : 'center',
				valign : 'middle',
				width : '90px',
			}, {
				field : 'mo_schedule_starttime',
				title : '预组完成',
				align : 'center',
				valign : 'middle',
				width : '90px',
			}, {
				field : 'mo_schedule_starttime',
				title : '机械完成',
				align : 'center',
				valign : 'middle',
				width : '90px',
			}, {
				field : 'mo_schedule_starttime',
				title : '端子排完成',
				align : 'center',
				valign : 'middle',
				width : '90px',
			}, {
				field : 'mo_schedule_starttime',
				title : '配线完成',
				align : 'center',
				valign : 'middle',
				width : '90px',
			}, {
				field : 'flag',
				title : '操作 ',
				align : 'center',
				valign : 'middle',
				events : ekittingoperateEvents,
				formatter : ekittingoperateFormatter
			}, ]
		};
		$('#table16').bootstrapTable(tableConfig16);
		var tableConfig17 = {
			url : '/Otracking/GetEKittingListAction?method_process_id=${MethodProcess.id}&flag=1', //请求后台的URL（*）
			method : 'get', //请求方式（*）
			contentType : "application/x-www-form-urlencoded",//必须要有！！！！
			toolbar : '#toolbar17', //工具按钮用哪个容器
			striped : true, //是否显示行间隔色
			cache : false, //是否使用缓存，默认为true，所以一般情况下需要设置一下这个属性（*）
			pagination : true, //是否显示分页（*）
			sortable : true, //是否启用排序
			sortOrder : "asc", //排序方式
			//editable : true,
			//queryParams: oTableInit.queryParams,//传递参数（*）
			sidePagination : "server", //分页方式：client客户端分页，server服务端分页（*）
			pageNumber : 1, //初始化加载第一页，默认第一页
			pageSize : 50, //每页的记录行数（*）
			pageList : [ 50, 100, 200 ], //可供选择的每页的行数（*）
			search : true, //是否显示表格搜索，此搜索是客户端搜索，不会进服务端，所以，个人感觉意义不大
			//strictSearch: true,
			//showColumns: true,                  //是否显示所有的列
			showRefresh : true, //是否显示刷新按钮
			//minimumCountColumns: 2,             //最少允许的列数
			//clickToSelect : true, //是否启用点击选中行
			//height: 500,                        //行高，如果没有设置height属性，表格自动根据记录条数觉得表格高度
			uniqueId : "ID", //每一行的唯一标识，一般为主键列
			//showToggle:true,                    //是否显示详细视图和列表视图的切换按钮
			//cardView: false,                    //是否显示详细视图
			//detailView: false,                   //是否显示父子表
			locale : lang,
			columns : [ {
				field : 'id',
				title : '编号',
				align : 'center',
				valign : 'middle',
			}, {
				field : 'seeeorder',
				title : '订单名称',
				align : 'center',
				valign : 'middle',
				sortable : true,
			}, {
				field : 'batch',
				title : 'Batch名称',
				align : 'center',
				valign : 'middle',
				width : '80px',
			}, {
				field : 'mo_name',
				title : 'MO名称',
				align : 'center',
				valign : 'middle',
			}, {
				field : 'dms_id',
				title : 'AOP',
				align : 'center',
				valign : 'middle',
			}, {
				field : 'mo_classify',
				title : '产品类型',
				align : 'center',
				valign : 'middle',
			}, {
				field : 'mo_type',
				title : '型号',
				align : 'center',
				valign : 'middle',
				width : '55px',
			}, {
				field : 'sap_method_process',
				title : 'SAP段位',
				align : 'center',
				valign : 'middle',
			}, {
				field : 'schedule_starttime',
				title : '排产时间',
				align : 'center',
				valign : 'middle',
				width : '90px',
			}, {
				field : 'mo_schedule_starttime',
				title : '预组完成',
				align : 'center',
				valign : 'middle',
				width : '90px',
			}, {
				field : 'mo_schedule_starttime',
				title : '机械完成',
				align : 'center',
				valign : 'middle',
				width : '90px',
			}, {
				field : 'mo_schedule_starttime',
				title : '端子排完成',
				align : 'center',
				valign : 'middle',
				width : '90px',
			}, {
				field : 'mo_schedule_starttime',
				title : '配线完成',
				align : 'center',
				valign : 'middle',
				width : '90px',
			}, {
				field : 'pull_time',
				title : '拉动时间',
				align : 'center',
				valign : 'middle',
				width : '90px',
			}, {
				field : 'staff',
				title : '员工',
				align : 'center',
				valign : 'middle',
			} ]
		};
		$('#table17').bootstrapTable(tableConfig17);
		/* 		//可开工计划表结束
		 //挂合格证
		 var method_process_id = ${MethodProcess.id};
		 method_process_id = method_process_id+2;
		 var url = '/Otracking/GetMethodProcessScheduleAction?method_process_id='+method_process_id+'&production_status=';
		 for (var i=6;i<11;i++){
		 tableConfig.url = url+(i-5);
		 $('#table'+i).bootstrapTable(tableConfig);
		 }
		 //FAT
		 var method_process_id = ${MethodProcess.id};
		 method_process_id = method_process_id+3;
		 var url = '/Otracking/GetMethodProcessScheduleAction?method_process_id='+method_process_id+'&production_status=';
		 for (var i=11;i<16;i++){
		 tableConfig.url = url+(i-10);
		 $('#table'+i).bootstrapTable(tableConfig);
		 } */
	</script>
</body>
</html>