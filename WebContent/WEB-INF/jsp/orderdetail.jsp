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
<style type="text/css">
</style>

</head>

<body onload="editable()">
	<%@include file="head.jsp"%>
	<div class="container-fluid mycontainer">
		<div class="row">
			<h3>
				<span class="label label-success">项目信息</span>
			</h3>
			<div id="toolbar"></div>
		</div>
		<div class="col-xs-12">
			<table id="table">
			</table>
			<br>
		</div>

	</div>
	<div class="container-fluid">
		<hr>
	</div>
	<div class="container-fluid mycontainer">
		<div class="row">
			<h3>
				<span class="label label-success">项目经理技术交底</span>
			</h3>
			<div id="PMtoolbar">
				<button id="btn_add" type="button"
					class="btn btn-default pull-right" data-toggle="modal"
					data-target="#PMModal" data-whatever="@mdo">
					<span class="glyphicon glyphicon-plus" aria-hidden="true"></span>新增
				</button>
				<div class="modal fade" id="PMModal" tabindex="-1" role="dialog"
					aria-labelledby="exampleModalLabel">
					<div class="modal-dialog" role="document">
						<div class="modal-content">
							<div class="modal-header">
								<button type="button" class="close" data-dismiss="modal"
									aria-label="Close">
									<span aria-hidden="true">&times;</span>
								</button>
								<h4 class="modal-title" id="exampleModalLabel">项目经理技术交底信息新增</h4>
							</div>
							<form action="SaveOrderTechnicalInfo" method="post">
								<div class="modal-body">
									<div class="form-group">
										<label for="recipient-name" class="control-label">部门</label> <select
											class="form-control" disabled="true" name="role_id">
											<option value="5">PM</option>
										</select>
									</div>
									<div class="form-group">
										<label for="recipient-name" class="control-label">描述</label>
										<textarea class="form-control" rows="3" name="description"></textarea>
									</div>
									<input type="hidden" name="order_id" value="${Order.id}" /> <input
										type="hidden" name="role_id" value="5" />
								</div>
								<div class="modal-footer">
									<button type="button" class="btn btn-default"
										data-dismiss="modal">Close</button>
									<button type="submit" class="btn btn-primary" on>保存</button>
								</div>
							</form>
						</div>
					</div>
				</div>
			</div>
			<div class="col-xs-12">
				<table id="PMtable">
				</table>
				<br>
			</div>
			<h3>
				<span class="label label-success">电气设计技术交底</span>
			</h3>
			<div id="EDtoolbar">
				<button id="btn_add" type="button"
					class="btn btn-default pull-right" data-toggle="modal"
					data-target="#EDModal" data-whatever="@mdo">
					<span class="glyphicon glyphicon-plus" aria-hidden="true"></span>新增
				</button>
				<div class="modal fade" id="EDModal" tabindex="-1" role="dialog"
					aria-labelledby="exampleModalLabel">
					<div class="modal-dialog" role="document">
						<div class="modal-content">
							<div class="modal-header">
								<button type="button" class="close" data-dismiss="modal"
									aria-label="Close">
									<span aria-hidden="true">&times;</span>
								</button>
								<h4 class="modal-title" id="exampleModalLabel">电气设计技术交底信息新增</h4>
							</div>
							<form action="SaveOrderTechnicalInfo" method="post">
								<div class="modal-body">
									<div class="form-group">
										<label for="recipient-name" class="control-label">部门</label> <select
											class="form-control" disabled="true" name="role_id">
											<option value="6">ED</option>
										</select>
									</div>
									<div class="form-group">
										<label for="recipient-name" class="control-label">描述</label>
										<textarea class="form-control" rows="3" name="description"></textarea>
									</div>
									<input type="hidden" name="order_id" value="${Order.id}" /> <input
										type="hidden" name="role_id" value="6" />
								</div>
								<div class="modal-footer">
									<button type="button" class="btn btn-default"
										data-dismiss="modal">Close</button>
									<button type="submit" class="btn btn-primary" on>保存</button>
								</div>
							</form>
						</div>
					</div>
				</div>
			</div>
			<div class="col-xs-12">
				<table id="EDtable">
				</table>
				<br>
			</div>
			<h3>
				<span class="label label-success">机械设计技术交底</span>
			</h3>
			<div id="MDtoolbar">
				<button id="btn_add" type="button"
					class="btn btn-default pull-right" data-toggle="modal"
					data-target="#MDModal" data-whatever="@mdo">
					<span class="glyphicon glyphicon-plus" aria-hidden="true"></span>新增
				</button>
				<div class="modal fade" id="MDModal" tabindex="-1" role="dialog"
					aria-labelledby="exampleModalLabel">
					<div class="modal-dialog" role="document">
						<div class="modal-content">
							<div class="modal-header">
								<button type="button" class="close" data-dismiss="modal"
									aria-label="Close">
									<span aria-hidden="true">&times;</span>
								</button>
								<h4 class="modal-title" id="exampleModalLabel">机械设计技术交底信息新增</h4>
							</div>
							<form action="SaveOrderTechnicalInfo" method="post">
								<div class="modal-body">
									<div class="form-group">
										<label for="recipient-name" class="control-label">部门</label> <select
											class="form-control" disabled="true" name="role_id">
											<option value="7">MD</option>
										</select>
									</div>
									<div class="form-group">
										<label for="recipient-name" class="control-label">描述</label>
										<textarea class="form-control" rows="3" name="description"></textarea>
									</div>
									<input type="hidden" name="order_id" value="${Order.id}" /> <input
										type="hidden" name="role_id" value="7" />
								</div>
								<div class="modal-footer">
									<button type="button" class="btn btn-default"
										data-dismiss="modal">Close</button>
									<button type="submit" class="btn btn-primary" on>保存</button>
								</div>
							</form>
						</div>
					</div>
				</div>
			</div>
			<div class="col-xs-12">
				<table id="MDtable">
				</table>
				<br>
			</div>
			<h3>
				<span class="label label-success">PIE技术交底</span>
			</h3>
			<div id="PIEtoolbar">
				<button id="btn_add" type="button"
					class="btn btn-default pull-right" data-toggle="modal"
					data-target="#PIEModal" data-whatever="@mdo">
					<span class="glyphicon glyphicon-plus" aria-hidden="true"></span>新增
				</button>
				<div class="modal fade" id="PIEModal" tabindex="-1" role="dialog"
					aria-labelledby="exampleModalLabel">
					<div class="modal-dialog" role="document">
						<div class="modal-content">
							<div class="modal-header">
								<button type="button" class="close" data-dismiss="modal"
									aria-label="Close">
									<span aria-hidden="true">&times;</span>
								</button>
								<h4 class="modal-title" id="exampleModalLabel">PIE技术交底信息新增</h4>
							</div>
							<form action="SaveOrderTechnicalInfo" method="post">
								<div class="modal-body">
									<div class="form-group">
										<label for="recipient-name" class="control-label">部门</label> <select
											class="form-control" disabled="true" name="role_id">
											<option value="8">PIE</option>
										</select>
									</div>
									<div class="form-group">
										<label for="recipient-name" class="control-label">描述</label>
										<textarea class="form-control" rows="3" name="description"></textarea>
									</div>
									<input type="hidden" name="order_id" value="${Order.id}" /> <input
										type="hidden" name="role_id" value="8" />
								</div>
								<div class="modal-footer">
									<button type="button" class="btn btn-default"
										data-dismiss="modal">Close</button>
									<button type="submit" class="btn btn-primary" on>保存</button>
								</div>
							</form>
						</div>
					</div>
				</div>
			</div>
			<div class="col-xs-12">
				<table id="PIEtable">
				</table>
				<br>
			</div>
			<h3>
				<span class="label label-success">端子排图号说明</span>
			</h3>
			<div id="DZPtoolbar">
				<button id="btn_add" type="button"
					class="btn btn-default pull-right" data-toggle="modal"
					data-target="#DZPModal" data-whatever="@mdo">
					<span class="glyphicon glyphicon-plus" aria-hidden="true"></span>新增
				</button>
				<div class="modal fade" id="DZPModal" tabindex="-1" role="dialog"
					aria-labelledby="exampleModalLabel">
					<div class="modal-dialog" role="document">
						<div class="modal-content">
							<div class="modal-header">
								<button type="button" class="close" data-dismiss="modal"
									aria-label="Close">
									<span aria-hidden="true">&times;</span>
								</button>
								<h4 class="modal-title" id="exampleModalLabel">端子排图号说明新增</h4>
							</div>
							<form action="SaveDZPInfoByExcel" method="post" enctype="multipart/form-data">
								<div class="modal-body">
									<div class="form-group">
									<label for="exampleInputFile">Excel文件上传</label> <input
										type="file" id="exampleInputFile" name="dzpexcel">
									<p class="help-block">请使用标准模板，并核对表格中的数据后上传.</p>
								</div>
									<input type="hidden" name="order_id" value="${Order.id}" />
								</div>
								<div class="modal-footer">
									<button type="button" class="btn btn-default"
										data-dismiss="modal">Close</button>
									<button type="submit" class="btn btn-primary" on>保存</button>
								</div>
							</form>
						</div>
					</div>
				</div>
			</div>
			<div class="col-xs-12">
				<table id="DZPtable">
				</table>
				<br>
			</div>
		</div>
	</div>
	<%@include file="bottom.jsp"%>
	<!-- Bootstrap core JavaScript
    ================================================== -->
	<!-- Placed at the end of the document so the pages load faster -->
	<script type="text/javascript" src="js/jquery-1.10.2.min.js"></script>
	<script type="text/javascript" src="js/jquery.qrcode.min.js"></script>
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
		var $table = $('#table'), $button = $('#btn_edit');
		$(function() {
			//1.初始化Table
			var oTable = new TableInit();
			oTable.Init();
			//2.初始化Button的点击事件
			var oButtonInit = new ButtonInit();
			oButtonInit.Init();
		});

		var oTableInit;

		$('#DZPtable').bootstrapTable({
			url : '/Otracking/GetDZPInfoByOrder_id?order_id=${Order.id}', //请求后台的URL（*）
			method : 'get', //请求方式（*）
			contentType : "application/x-www-form-urlencoded",//必须要有！！！！
			toolbar : '#DZPtoolbar', //工具按钮用哪个容器
			striped : true, //是否显示行间隔色
			cache : false, //是否使用缓存，默认为true，所以一般情况下需要设置一下这个属性（*）
			pagination : true, //是否显示分页（*）
			sortable : false, //是否启用排序
			sortOrder : "desc", //排序方式
			//editable : true,
			//queryParams: oTableInit.queryParams,//传递参数（*）
			sidePagination : "client", //分页方式：client客户端分页，server服务端分页（*）
			pageNumber : 1, //初始化加载第一页，默认第一页
			pageSize : 5, //每页的记录行数（*）
			pageList : [ 10, 20, 30, 40, 50 ], //可供选择的每页的行数（*）
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
				field : 'sequence',
				title : '序号',
			}, {
				field : 'dms_id',
				title : 'AOP号',
			}, {
				field : 'headingline',
				title : '回路',
			}, {
				field : 'description',
				title : '图号',
			}]
		});

		var tableConfig = {
			url : '/Otracking/GetOrderByIDAction?id=${Order.id}', //请求后台的URL（*）
			method : 'get', //请求方式（*）
			contentType : "application/x-www-form-urlencoded",//必须要有！！！！
			toolbar : '#toolbar', //工具按钮用哪个容器
			striped : true, //是否显示行间隔色
			cache : false, //是否使用缓存，默认为true，所以一般情况下需要设置一下这个属性（*）
			pagination : false, //是否显示分页（*）
			sortable : false, //是否启用排序
			sortOrder : "desc", //排序方式
			//editable : true,
			//queryParams: oTableInit.queryParams,//传递参数（*）
			sidePagination : "client", //分页方式：client客户端分页，server服务端分页（*）
			pageNumber : 1, //初始化加载第一页，默认第一页
			pageSize : 5, //每页的记录行数（*）
			pageList : [ 10, 20, 30, 40, 50 ], //可供选择的每页的行数（*）
			search : false, //是否显示表格搜索，此搜索是客户端搜索，不会进服务端，所以，个人感觉意义不大
			//strictSearch: true,
			//showColumns: true,                  //是否显示所有的列
			showRefresh : false, //是否显示刷新按钮
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
			}, {
				field : 'name',
				title : '名称',
			}, {
				field : 'SO',
				title : 'SO',
			}, {
				field : 'schedule_starttime',
				title : '项目开始时间',
			}, {
				field : 'actual_starttime',
				title : '生产开始时间',
			}, {
				field : 'p_staff',
				title : '项目经理',
			}, {
				field : 'E_staff',
				title : '电气设计',
			}, {
				field : 'M_staff',
				title : '机械设计',
			} ]
		};

		var TableInit = function() {
			var oTableInit = new Object();
			//初始化Table
			oTableInit.Init = function() {
				$('#table').bootstrapTable(tableConfig);

			};

			return oTableInit;
		};

		var ButtonInit = function() {
			var oInit = new Object();
			var postdata = {};
			oInit.Init = function() {
				//初始化页面上面的按钮事件
			};
			return oInit;
		};

		$(function() {
			$button.click(function() {
				editable();
			});
		});
		function editable() {
			$('#table .editable').editable('toggleDisabled');
		}
		//初始化Table
		$('#PMtable')
				.bootstrapTable(
						{
							url : '/Otracking/GetOrderTechnicalInfoByRoleAndOrder?role_id=5&order_id=${Order.id}', //请求后台的URL（*）
							method : 'get', //请求方式（*）
							contentType : "application/x-www-form-urlencoded",//必须要有！！！！
							toolbar : '#PMtoolbar', //工具按钮用哪个容器
							striped : true, //是否显示行间隔色
							cache : false, //是否使用缓存，默认为true，所以一般情况下需要设置一下这个属性（*）
							pagination : true, //是否显示分页（*）
							sortable : false, //是否启用排序
							sortOrder : "desc", //排序方式
							//editable : true,
							//queryParams: oTableInit.queryParams,//传递参数（*）
							sidePagination : "client", //分页方式：client客户端分页，server服务端分页（*）
							pageNumber : 1, //初始化加载第一页，默认第一页
							pageSize : 5, //每页的记录行数（*）
							pageList : [ 10, 20, 30, 40, 50 ], //可供选择的每页的行数（*）
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
							rowStyle : function(row, index) {
								//这里有5个取值代表5中颜色['active', 'success', 'info', 'warning', 'danger'];
								var strclass = "";
								if (row.ORDER_STATUS == "待排产") {
									strclass = 'success';//还有一个active
								} else if (row.ORDER_STATUS == "已删除") {
									strclass = 'danger';
								} else {
									return {};
								}
								return {
									classes : strclass
								}
							},
							columns : [
									{
										field : 'id',
										align : 'center',
										valign : 'middle',
										title : '编号'
									},
									{
										field : 'description',
										align : 'center',
										valign : 'middle',
										title : '描述',
										width : '800px',
									},
									{
										field : 'staff_id',
										align : 'center',
										valign : 'middle',
										title : '负责人',
										formatter : function(value, row, index) {
											//处理格式化数据
											var staff = '';
											$
													.ajax({
														url : '/Otracking/GetStaffByIDAction?id='
																+ value,
														async : false,
														type : "get",
														data : {},
														success : function(
																data, status) {
															//alert(data.name);
															staff = data.name;
														}
													});
											return staff;
										},
									}, {
										field : 'timestamp',
										align : 'center',
										valign : 'middle',
										title : '时间戳',

									} ]
						});
		//初始化Table
		$('#EDtable')
				.bootstrapTable(
						{
							url : '/Otracking/GetOrderTechnicalInfoByRoleAndOrder?role_id=6&order_id=${Order.id}', //请求后台的URL（*）
							method : 'get', //请求方式（*）
							contentType : "application/x-www-form-urlencoded",//必须要有！！！！
							toolbar : '#EDtoolbar', //工具按钮用哪个容器
							striped : true, //是否显示行间隔色
							cache : false, //是否使用缓存，默认为true，所以一般情况下需要设置一下这个属性（*）
							pagination : true, //是否显示分页（*）
							sortable : false, //是否启用排序
							sortOrder : "desc", //排序方式
							//editable : true,
							//queryParams: oTableInit.queryParams,//传递参数（*）
							sidePagination : "client", //分页方式：client客户端分页，server服务端分页（*）
							pageNumber : 1, //初始化加载第一页，默认第一页
							pageSize : 5, //每页的记录行数（*）
							pageList : [ 10, 20, 30, 40, 50 ], //可供选择的每页的行数（*）
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
							rowStyle : function(row, index) {
								//这里有5个取值代表5中颜色['active', 'success', 'info', 'warning', 'danger'];
								var strclass = "";
								if (row.ORDER_STATUS == "待排产") {
									strclass = 'success';//还有一个active
								} else if (row.ORDER_STATUS == "已删除") {
									strclass = 'danger';
								} else {
									return {};
								}
								return {
									classes : strclass
								}
							},
							columns : [
									{
										field : 'id',
										align : 'center',
										valign : 'middle',
										title : '编号'
									},
									{
										field : 'description',
										align : 'center',
										valign : 'middle',
										title : '描述',
										width : '800px',
									},
									{
										field : 'staff_id',
										align : 'center',
										valign : 'middle',
										title : '负责人',
										formatter : function(value, row, index) {
											//处理格式化数据
											var staff = '';
											$
													.ajax({
														url : '/Otracking/GetStaffByIDAction?id='
																+ value,
														async : false,
														type : "get",
														data : {},
														success : function(
																data, status) {
															//alert(data.name);
															staff = data.name;
														}
													});
											return staff;
										},
									}, {
										field : 'timestamp',
										align : 'center',
										valign : 'middle',
										title : '时间戳',
									} ]
						});
		//初始化Table
		$('#MDtable')
				.bootstrapTable(
						{
							url : '/Otracking/GetOrderTechnicalInfoByRoleAndOrder?role_id=7&order_id=${Order.id}', //请求后台的URL（*）
							method : 'get', //请求方式（*）
							contentType : "application/x-www-form-urlencoded",//必须要有！！！！
							toolbar : '#MDtoolbar', //工具按钮用哪个容器
							striped : true, //是否显示行间隔色
							cache : false, //是否使用缓存，默认为true，所以一般情况下需要设置一下这个属性（*）
							pagination : true, //是否显示分页（*）
							sortable : false, //是否启用排序
							sortOrder : "desc", //排序方式
							//editable : true,
							//queryParams: oTableInit.queryParams,//传递参数（*）
							sidePagination : "client", //分页方式：client客户端分页，server服务端分页（*）
							pageNumber : 1, //初始化加载第一页，默认第一页
							pageSize : 5, //每页的记录行数（*）
							pageList : [ 10, 20, 30, 40, 50 ], //可供选择的每页的行数（*）
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
							rowStyle : function(row, index) {
								//这里有5个取值代表5中颜色['active', 'success', 'info', 'warning', 'danger'];
								var strclass = "";
								if (row.ORDER_STATUS == "待排产") {
									strclass = 'success';//还有一个active
								} else if (row.ORDER_STATUS == "已删除") {
									strclass = 'danger';
								} else {
									return {};
								}
								return {
									classes : strclass
								}
							},
							columns : [
									{
										field : 'id',
										align : 'center',
										valign : 'middle',
										title : '编号'
									},
									{
										field : 'description',
										align : 'center',
										valign : 'middle',
										title : '描述',
										width : '800px',
									},
									{
										field : 'staff_id',
										align : 'center',
										valign : 'middle',
										title : '负责人',
										formatter : function(value, row, index) {
											//处理格式化数据
											var staff = '';
											$
													.ajax({
														url : '/Otracking/GetStaffByIDAction?id='
																+ value,
														async : false,
														type : "get",
														data : {},
														success : function(
																data, status) {
															//alert(data.name);
															staff = data.name;
														}
													});
											return staff;
										},
									}, {
										field : 'timestamp',
										align : 'center',
										valign : 'middle',
										title : '时间戳',
									} ]
						});
		//初始化Table
		$('#PIEtable')
				.bootstrapTable(
						{
							url : '/Otracking/GetOrderTechnicalInfoByRoleAndOrder?role_id=8&order_id=${Order.id}', //请求后台的URL（*）
							method : 'get', //请求方式（*）
							contentType : "application/x-www-form-urlencoded",//必须要有！！！！
							toolbar : '#PIEtoolbar', //工具按钮用哪个容器
							striped : true, //是否显示行间隔色
							cache : false, //是否使用缓存，默认为true，所以一般情况下需要设置一下这个属性（*）
							pagination : true, //是否显示分页（*）
							sortable : false, //是否启用排序
							sortOrder : "desc", //排序方式
							//editable : true,
							//queryParams: oTableInit.queryParams,//传递参数（*）
							sidePagination : "client", //分页方式：client客户端分页，server服务端分页（*）
							pageNumber : 1, //初始化加载第一页，默认第一页
							pageSize : 5, //每页的记录行数（*）
							pageList : [ 10, 20, 30, 40, 50 ], //可供选择的每页的行数（*）
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
							rowStyle : function(row, index) {
								//这里有5个取值代表5中颜色['active', 'success', 'info', 'warning', 'danger'];
								var strclass = "";
								if (row.ORDER_STATUS == "待排产") {
									strclass = 'success';//还有一个active
								} else if (row.ORDER_STATUS == "已删除") {
									strclass = 'danger';
								} else {
									return {};
								}
								return {
									classes : strclass
								}
							},
							columns : [
									{
										field : 'id',
										align : 'center',
										valign : 'middle',
										title : '编号'
									},
									{
										field : 'description',
										align : 'center',
										valign : 'middle',
										title : '描述',
										width : '800px',
									},
									{
										field : 'staff_id',
										align : 'center',
										valign : 'middle',
										title : '负责人',
										formatter : function(value, row, index) {
											//处理格式化数据
											var staff = '';
											$
													.ajax({
														url : '/Otracking/GetStaffByIDAction?id='
																+ value,
														async : false,
														type : "get",
														data : {},
														success : function(
																data, status) {
															//alert(data.name);
															staff = data.name;
														}
													});
											return staff;
										},
									}, {
										field : 'timestamp',
										align : 'center',
										valign : 'middle',
										title : '时间戳',
									} ]
						});
	</script>
</body>
</html>