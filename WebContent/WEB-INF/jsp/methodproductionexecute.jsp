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
			<div class="col-xs-3">
				<h3>
					<span class="label label-success"><a style="color: #f5f5f5"
						href="ProductionExecute?process_line_id=${ProcessLine.id}">${ProcessLine.name}</a>
						→ <a style="color: #f5f5f5"
						href="MethodProcessSchedule?method_process_id=${MethodProcess.id}">${MethodProcess.name}</a>生产执行</span>
				</h3>
			</div>
			<div class="col-xs-2">
				<h3>
					<span class="label label-success">计划用时: <span class="badge">${Routing.dt }分钟</span></span>
				</h3>
			</div>
			<div class="col-xs-2">
				<h3>
					<span class="label label-success">已用时: <span id="OTR"
						class="badge">${OTR}分钟</span></span>
				</h3>
			</div>
			<div class="col-xs-5">
				<div class="center-block">
					<div class="col-xs-10">
						<button onclick="start()" class="btn btn-success" type="button"
							id="btn_start">开始</button>
						<button onclick="interruption_recover()" class="btn btn-success"
							type="button" id="btn_interruption_recover" data-toggle="modal"
							data-whatever="@mdo">中断</button>
						<button onclick="finish()" class="btn btn-success" type="button"
							id="btn_finish" data-toggle="modal" data-whatever="@mdo">结束</button>
						<s:if test="#Routing.sequence == 1">
							<button onclick="printLabel()" class="btn btn-success"
								type="button" id="btn_start">标签补打</button>
						</s:if>
						<s:if test="#MethodProcess.method_process_type_id == 2">
							<button onclick="printLabel0()" class="btn btn-success"
								type="button" id="btn_start">标签补打</button>
						</s:if>
						<button onclick="projectDocument()" class="btn btn-success" type="button">文件查阅</button>
					</div>
					<div id="code" class="col-xs-2"></div>
				</div>
			</div>
		</div>
		<div class="col-xs-12">
			<div class="panel-body" style="padding-bottom: 0px;">
				<table id="table">
				</table>
				<br>
				<div class="modal fade" id="exampleModa1" tabindex="-1"
					role="dialog" aria-labelledby="exampleModalLabel">
					<div class="modal-dialog" role="document">
						<div class="modal-content">
							<div class="modal-header">
								<button type="button" class="close" data-dismiss="modal"
									aria-label="Close">
									<span aria-hidden="true">&times;</span>
								</button>
								<h4 class="modal-title" id="exampleModalLabel">中断管理</h4>
							</div>
							<form action="#" method="post">
								<div class="modal-body">
									<div class="form-group">
										<label for="recipient-name" class="control-label">请选择中断类型</label>
										<select id="interruption_type" class="form-control">
											<option value="">请选择中断类型</option>
										</select>
									</div>
									<div class="form-group">
										<label for="recipient-name" class="control-label">请选择中断类型</label>
										<select id="interruption_department" class="form-control">
											<option value="">请选择责任部门</option>
										</select>
									</div>
									<div class="form-group">
										<label for="recipient-name" class="control-label">请输入责任人</label>
										<input type="text" class="form-control" id="owner"
											name="owner">
									</div>
									<div class="form-group">
										<label for="recipient-name" class="control-label">请输入生产中断原因</label>
										<input type="text" class="form-control"
											id="interruption_description" name="reason">
									</div>
								</div>
								<div class="modal-footer">
									<button type="button" class="btn btn-default"
										data-dismiss="modal">Close</button>
									<button type="button" class="btn btn-primary"
										data-dismiss="modal" onclick="interruption_recover_save()">保存</button>
								</div>
							</form>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<hr>
	<div class="container-fluid mycontainer">
		<div class="row">
			<div id=dzp_toolbar>
				<span class="label label-success"
					style="font-size: 17px; font-weight: bold;">端子排图号</span>
			</div>
			<div class="col-xs-12">
				<table id="dzp_table">
				</table>
			</div>
			<div id=toolbar2>
				<h3>
					<span class="label label-success">中断记录</span>
				</h3>
			</div>
			<div class="col-xs-12">
				<table id="interruption_recover_table">
				</table>
			</div>
			<div id="PMtoolbar">
				<span class="label label-success"
					style="font-size: 17px; font-weight: bold;">项目经理技术交底</span>
			</div>
			<div class="col-xs-12">
				<table id="PMtable">
				</table>
			</div>

			<div id="EDtoolbar">
				<span class="label label-success"
					style="font-size: 17px; font-weight: bold;">电气设计技术交底</span>
			</div>
			<div class="col-xs-12">
				<table id="EDtable">
				</table>
			</div>
			<div id="MDtoolbar">
				<span class="label label-success"
					style="font-size: 17px; font-weight: bold;">机械设计技术交底</span>
			</div>
			<div class="col-xs-12">
				<table id="MDtable">
				</table>
			</div>
			<div id="PIEtoolbar">
				<span class="label label-success"
					style="font-size: 17px; font-weight: bold;">PIE技术交底</span>
			</div>
			<div class="col-xs-12">
				<table id="PIEtable">
				</table>
			</div>
			<div id="toolbar3">
				<span> <span class="label label-success"
					style="font-size: 17px; font-weight: bold;">BOM清单</span>
				</span>
			</div>
			<div class="col-xs-12">
				<table id="bom_table">
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
	<script src="js/bootstrap-table-print.js"></script>
	<script src="js/bootstrap-table-locale-all.min.js"></script>
	<script src="js/bootstrap-table-editable.js"></script>
	<script src="js/combodate.js"></script>
	<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
	<script type="text/javascript">
	var lang = navigator.language || navigator.userLanguage;
	$('#dzp_table').bootstrapTable({
		url : '/Otracking/GetDZPInfoByMO?mo_id=${MO.id}&order_id=${Batch.order_id}', //请求后台的URL（*）
		method : 'get', //请求方式（*）
		contentType : "application/x-www-form-urlencoded",//必须要有！！！！
		toolbar : '#dzp_toolbar', //工具按钮用哪个容器
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

		function start() {
			$.ajax({
				url : 'Start?id=${production_Schedule.id}',
				type : 'GET',
				success : function(data) {
					$table.bootstrapTable('refresh');
					buttonRefresh(data.flag);
				if(${Routing.sequence } == 1){
					$.ajax({
						url : 'http://localhost:55667/'+${MO.name },
						type : 'GET',
						success : function(data) {
							
						}
					});
				}
				if(${MethodProcess.method_process_type_id } == 2){
					$.ajax({
						url : 'http://localhost:55668/'+${MO.id },
						type : 'GET',
						success : function(data) {
							
						}
					});
				}
				}
			});
		}
		function finish() {
			$.ajax({
				url : 'End?id=${production_Schedule.id}',
				type : 'GET',
				success : function(data) {
					$table.bootstrapTable('refresh');
					buttonRefresh(data.flag);
				}
			});
		}
		function interruption_recover() {
			var interruption_recover = document.getElementById("btn_interruption_recover");
			var myvalue = interruption_recover.innerHTML;
			if(myvalue=="继续"){
			$
			.ajax({
				url : 'UpdateInterruption?id=${production_Schedule.id}',
				type : 'GET',
				success : function(data) {
					$('#interruption_recover_table').bootstrapTable('refresh');
					buttonRefresh(data.flag);
				}
			});
			//alert("继续");
		}
		}
		function interruption_recover_save() {
			var interruption_recover = document.getElementById("btn_interruption_recover");
			var myvalue = interruption_recover.innerHTML;
			if(myvalue=="中断"){
			var interruption_type = document
					.getElementById("interruption_type");
			var interruption_department = document
					.getElementById("interruption_department");
			var owner = document
					.getElementById("owner");
			var interruption_description = document
					.getElementById("interruption_description");
			//alert(interruption_type.value);
			//alert(interruption_description.value);
			$
					.ajax({
						url : 'SaveInterruption?interruption_Recover.description='
								+ interruption_description.value
								+'&interruption_Recover.interruption_recover_department=' + interruption_department.value
								+'&interruption_Recover.owner=' + owner.value
								+ '&interruption_Recover.production_schedule_id=${production_Schedule.id}&interruption_Recover.type='
								+ interruption_type.value,
						type : 'GET',
						success : function(data) {
							$('#interruption_recover_table').bootstrapTable('refresh');
							buttonRefresh(data.flag);
							if(data.flag != 3){
								alert("生产中断异常，请联系管理员！(注：中断类型和中断原因不能为空)");
							}
						}
					});
		}
		}
		var tableConfig = {
			url : '/Otracking/GetProductionScheduleAction?id=${production_Schedule.id}', //请求后台的URL（*）
			method : 'get', //请求方式（*）
			toolbar : '#toolbar', //工具按钮用哪个容器
			striped : true, //是否显示行间隔色
			cache : false, //是否使用缓存，默认为true，所以一般情况下需要设置一下这个属性（*）
			pagination : false, //是否显示分页（*）
			sortable : true, //是否启用排序
			sortOrder : "asc", //排序方式
			//editable : true,
			//queryParams: oTableInit.queryParams,//传递参数（*）
			//sidePagination: "server",           //分页方式：client客户端分页，server服务端分页（*）
			//pageNumber:1,                       //初始化加载第一页，默认第一页
			//pageSize: 10,                       //每页的记录行数（*）
			//pageList: [10, 25, 50, 100],        //可供选择的每页的行数（*）
			search : false, //是否显示表格搜索，此搜索是客户端搜索，不会进服务端，所以，个人感觉意义不大
			//strictSearch: true,
			//showColumns: true,                  //是否显示所有的列
			showRefresh : false, //是否显示刷新按钮
			//minimumCountColumns: 2,             //最少允许的列数
			clickToSelect : true, //是否启用点击选中行
			//height: 500,                        //行高，如果没有设置height属性，表格自动根据记录条数觉得表格高度
			uniqueId : "ID", //每一行的唯一标识，一般为主键列
			//showToggle:true,                    //是否显示详细视图和列表视图的切换按钮
			//cardView: false,                    //是否显示详细视图
			//detailView: false,                   //是否显示父子表
			locale : lang,
			columns : [ {
				field : 'processline',
				title : '产线',
				align : 'center',
				valign : 'middle',
				sortable: true,
				width : '100px',
			},{
				field : 'order_name',
				title : '订单名称',
				align : 'center',
				valign : 'middle',
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
				field : 'quantity',
				title : '数量',
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
			},{
				field : 'mo_schedule_starttime',
				title : '计划上线时间',
				align : 'center',
				valign : 'middle',
			}, {
				field : 'no',
				title : 'NO',
				align : 'center',
				valign : 'middle',
			},{
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
				field : 'deliver_time',
				title : '发货时间',
				align : 'center',
				valign : 'middle',
			},{
				field : 'flag',
				title : '状态',
				align : 'center',
				valign : 'middle',
			}, ],
			onEditableSave : function(field, row, oldValue, $el) {
				$.ajax({
					type : "post",
					url : "EditMO",
					data : {
						"id" : row.id,
						"fieldName" : field,
						"oldValue" : oldValue,
						"newValue" : row[field]
					},
					success : function(data, status) {
						if (status == "success") {
							if (status != 0) {
								alert("编辑成功");
							} else {
								alert("编辑失败");
							}
						}
					},
					error : function() {
						alert("编辑失败");
					},
					complete : function() {
						//alert("complete:"+"field:"+field+"rowid:"+row.id+"rowfield:"+row[field]+"oldvalue:"+oldValue+"el:"+$el);
						$table.bootstrapTable('refresh');
					}
				});
			}
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
		$('#interruption_recover_table')
				.bootstrapTable(
						{
							url : '/Otracking/FindInterruptionAndRecover?id=${production_Schedule.id}', //请求后台的URL（*）
							method : 'get', //请求方式（*）
							contentType : "application/x-www-form-urlencoded",//必须要有！！！！
							toolbar : '#toolbar2', //工具按钮用哪个容器
							striped : true, //是否显示行间隔色
							cache : false, //是否使用缓存，默认为true，所以一般情况下需要设置一下这个属性（*）
							pagination : true, //是否显示分页（*）
							sortable : false, //是否启用排序
							sortOrder : "desc", //排序方式
							//editable : true,
							//queryParams: oTableInit.queryParams,//传递参数（*）
							sidePagination : "client", //分页方式：client客户端分页，server服务端分页（*）
							pageNumber : 1, //初始化加载第一页，默认第一页
							pageSize : 10, //每页的记录行数（*）
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
							columns : [ {
								checkbox : true
							}, {
								field : 'id',
								align : 'center',
								valign : 'middle',
								title : '编号'
							}, {
								field : 'type_name',
								align : 'center',
								valign : 'middle',
								title : '分类'
							}, {
								field : 'description',
								align : 'center',
								valign : 'middle',
								title : '问题描述',
								editable : true
							},{
								field : 'interruption_time',
								align : 'center',
								valign : 'middle',
								title : '中断时间'
							}, {
								field : 'recover_time',
								align : 'center',
								valign : 'middle',
								title : '恢复时间',
								editable : true
							}, {
								field : 'interruption_recover_department_name',
								align : 'center',
								valign : 'middle',
								title : '责任部门'
							}, {
								field : 'owner',
								align : 'center',
								valign : 'middle',
								title : '责任人'
							}, ],
							onEditableSave : function(field, row, oldValue, $el) {
								$.ajax({
									type : "post",
									url : "EditInterruption_recover",
									data : {
										"id" : row.id,
										"fieldName" : field,
										"oldValue" : oldValue,
										"newValue" : row[field]
									},
									success : function(data, status) {
										if (status == "success") {
											if (status != 0) {
												alert("编辑成功");
											} else {
												alert("编辑失败");
											}
										}
									},
									error : function() {
										alert("编辑失败");
									},
									complete : function() {
										//alert("complete:"+"field:"+field+"rowid:"+row.id+"rowfield:"+row[field]+"oldvalue:"+oldValue+"el:"+$el);
										$table.bootstrapTable('refresh');
									}
								});
							}
						});
		//初始化Table
		$('#bom_table')
				.bootstrapTable(
						{
							url : '/Otracking/GetMaterial?mo_id=${MO.id}', //请求后台的URL（*）
							method : 'get', //请求方式（*）
							contentType : "application/x-www-form-urlencoded",//必须要有！！！！
							toolbar : '#toolbar3', //工具按钮用哪个容器
							striped : true, //是否显示行间隔色
							cache : false, //是否使用缓存，默认为true，所以一般情况下需要设置一下这个属性（*）
							pagination : true, //是否显示分页（*）
							sortable : false, //是否启用排序
							sortOrder : "desc", //排序方式
							//editable : true,
							//queryParams: oTableInit.queryParams,//传递参数（*）
							sidePagination : "client", //分页方式：client客户端分页，server服务端分页（*）
							pageNumber : 1, //初始化加载第一页，默认第一页
							pageSize : 20, //每页的记录行数（*）
							pageList : [ 50,100, 200, 300, 400, 500 ], //可供选择的每页的行数（*）
							search : false, //是否显示表格搜索，此搜索是客户端搜索，不会进服务端，所以，个人感觉意义不大
							showPrint : true,
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
							columns : [{
								field : 'id',
								align : 'center',
								valign : 'middle',
								title : '编号'
							}, {
								field : 'R_MATNR',
								align : 'center',
								valign : 'middle',
								title : '物料号'
							}, {
								field : 'MAKTX',
								align : 'center',
								valign : 'middle',
								title : '物料描述'
							}, {
								field : 'MENGE',
								align : 'center',
								valign : 'middle',
								title : '数量'
							}, {
								field : 'WKSTG',
								align : 'center',
								valign : 'middle',
								title : 'WKSTG'
							}, {
								field : 'RGEKZ',
								align : 'center',
								valign : 'middle',
								title : 'RGEKZ'
							},]
						});
		$(function() {
			var sltProcessLine = document.getElementById("interruption_type");
			$.ajax({
				url : 'GetInterruptionType',
				type : 'GET',
				success : function(data) {
					obj = data;
					var opt = document.createElement('option');
					for (var i = 0; i < obj.length; i++) {
						var opt = document.createElement('option');
						opt.value = obj[i].id;
						opt.text = obj[i].name;
						sltProcessLine.add(opt, null);
					}
				}
			});
		});
		$(function() {
			var sltProcessLine = document.getElementById("interruption_department");
			$.ajax({
				url : 'GetInterruptionDepartment',
				type : 'GET',
				success : function(data) {
					obj = data;
					var opt = document.createElement('option');
					for (var i = 0; i < obj.length; i++) {
						var opt = document.createElement('option');
						opt.value = obj[i].id;
						opt.text = obj[i].name;
						sltProcessLine.add(opt, null);
					}
				}
			});
		});
		var production_status = ${production_Schedule.flag};
		function buttonRefresh(flag) {
			var start = document.getElementById("btn_start");
			var interruption_recover = document
					.getElementById("btn_interruption_recover");
			var finish = document.getElementById("btn_finish");
			switch (flag) {
			case 1:
				start.disabled = false;
				interruption_recover.disabled = true;
				finish.disabled = true;
				break;
			case 2:
				start.disabled = true;
				interruption_recover.disabled = false;
				interruption_recover.setAttribute("data-target","#exampleModa1");
				interruption_recover.innerHTML = "中断";
				finish.disabled = false;
				break;
			case 3:
				start.disabled = true;
				interruption_recover.disabled = false;
				interruption_recover.setAttribute("data-target","#exampleModa2");
				interruption_recover.innerHTML = "继续";
				finish.disabled = true;
				break;
			case 4:
				start.disabled = true;
				interruption_recover.disabled = true;
				finish.disabled = true;
				break;
			case 5:
				start.disabled = true;
				interruption_recover.disabled = true;
				finish.disabled = true;
				break;
			default:
				start.disabled = true;
				interruption_recover.disabled = true;
				finish.disabled = true;
			}
			production_status = flag;
		}
		var OTR = document.getElementById("OTR");
		function updateOTR(){
			$.ajax({
				url : 'GetOTR?id=${production_Schedule.id}',
				type : 'GET',
				success : function(data) {
					obj = data;
					OTR.innerHTML = data+"分钟";
				}
			});
		}
		function updateStatus(){
			$.ajax({
				url : 'GetProductionScheduleByIDAction?id=${production_Schedule.id}',
				type : 'GET',
				success : function(data) {
					buttonRefresh(data.production_status);
				}
			});
		}
		window.onload = function() {
			buttonRefresh(${production_Schedule.flag});
			//window.setInterval("updateOTR()",60000);
			//window.setInterval("updateStatus()",6000);
		var code = "";
    	var lastTime,nextTime;
    	var lastCode,nextCode;
    	document.onkeypress = function(e) {
    			nextCode = e.which;
    			nextTime = new Date().getTime();
    		
    			if(lastCode == null && lastTime == null) {
    				
    			} if(lastCode != null && lastTime != null && nextTime - lastTime <= 30) {
    				code += String.fromCharCode(lastCode);
    			} else if(lastCode != null && lastTime != null && nextTime - lastTime > 1000) {
    				code = "";//超时清空
    			}
    			lastCode = nextCode;
    			lastTime = nextTime;
				//alert(code);
    	    };
    		
    		$(this).keypress(function(e) {
    			if(e.which == 13) {
				//alert(production_status);
					if(code == "${MO.name}"){
					if(production_status==1){
						start();
					}else if(production_status==2){
						finish();
					}else if(production_status==3){
						alert("中断中，请恢复生产");
					}else if(production_status==4){
						alert("生产已结束");
					}else if(production_status==5){
						alert("未达开工条件！");
					}
    				//alert(String.fromCharCode(e.which));
    				//alert(code);
    				code = ""; //回车输入后清空
    				}else{
						alert("柜号不匹配，请检查！");
					}
					}
    		});
    	}
	/* 	$("#code").qrcode({ 
		    render: "table",  //table方式 
		    width:70,  //宽度 
		    height:70,  //高度 
		    text:"${MethodProcess.id}", //任意内容 
		}); */
		function utf16to8(str) {  
		    var out, i, len, c;  
		    out = "";  
		    len = str.length;  
		    for(i = 0; i < len; i++) {  
		    c = str.charCodeAt(i);  
		    if ((c >= 0x0001) && (c <= 0x007F)) {  
		        out += str.charAt(i);  
		    } else if (c > 0x07FF) {  
		        out += String.fromCharCode(0xE0 | ((c >> 12) & 0x0F));  
		        out += String.fromCharCode(0x80 | ((c >>  6) & 0x3F));  
		        out += String.fromCharCode(0x80 | ((c >>  0) & 0x3F));  
		    } else {  
		        out += String.fromCharCode(0xC0 | ((c >>  6) & 0x1F));  
		        out += String.fromCharCode(0x80 | ((c >>  0) & 0x3F));  
		    }  
		    }  
		    return out;  
		}
		jQuery('#code').qrcode({
		    render: "canvas", //也可以替换为table
		    width: 70,
		    height: 70,
		    text: utf16to8("MethodProcess_id:${MethodProcess.id}:${ProcessLine.name}-${MethodProcess.name}"),
		});
		
		//项目交底
		//初始化Table
		$('#PMtable')
				.bootstrapTable(
						{
							url : '/Otracking/GetOrderTechnicalInfoByRoleAndOrder?role_id=5&order_id=${Batch.order_id}', //请求后台的URL（*）
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
							pageSize : 10, //每页的记录行数（*）
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
							url : '/Otracking/GetOrderTechnicalInfoByRoleAndOrder?role_id=6&order_id=${Batch.order_id}', //请求后台的URL（*）
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
							pageSize : 10, //每页的记录行数（*）
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
							url : '/Otracking/GetOrderTechnicalInfoByRoleAndOrder?role_id=7&order_id=${Batch.order_id}', //请求后台的URL（*）
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
							pageSize : 10, //每页的记录行数（*）
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
							url : '/Otracking/GetOrderTechnicalInfoByRoleAndOrder?role_id=8&order_id=${Batch.order_id}', //请求后台的URL（*）
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
							pageSize : 10, //每页的记录行数（*）
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
		function printLabel(){
			alert("请仔细核对柜号：${MO.name }，柜号错误会造成客户投诉！");
			$.ajax({
				url : 'http://localhost:55667/'+${MO.name },
				type : 'GET',
				success : function(data) {
					
				}
			});
		}
		function printLabel0(){
			alert("请仔细核对柜号：${MO.name }，柜号错误会造成客户投诉！");
			$.ajax({
				url : 'http://localhost:55668/'+${MO.id },
				type : 'GET',
				success : function(data) {
					
				}
			});
		}
		 function projectDocument(){
			var str="http://10.177.118.249:8096/Projectdocument/html/EProjectdocument.html?action=${MO.order_name}";
			window.open(str);
		}
    </script>
</body>
</html>