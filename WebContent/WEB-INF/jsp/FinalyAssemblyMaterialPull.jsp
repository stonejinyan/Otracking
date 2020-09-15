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
			<span class="label label-success">后段物料拉动清单</span>
		</h3>
		<br>
		<div>
			<!-- Nav tabs -->
			<ul class="nav nav-tabs" role="tablist">
				<li role="presentation" class="active"><a href="#home"
					aria-controls="home" role="tab" data-toggle="tab">待拉动</a></li>
				<li role="presentation"><a href="#profile"
					aria-controls="profile" role="tab" data-toggle="tab">已拉动</a></li>
			</ul>

			<!-- Tab panes -->
			<div class="tab-content">
				<!--待拉动 -->
				<div role="tabpanel" class="tab-pane active" id="home">
					<div class="col-xs-12">
						<div class="panel-body"
							style="padding-bottom: 0px; padding-top: 0px;">
							<p class="bg-danger">${savenumber}${updatenumber}${error}</p>
							<div id="toolbar" class="btn-group">
								<button id="btn_add" type="button" class="btn btn-default"
									data-toggle="modal" data-target="#exampleModal"
									data-whatever="@mdo">
									<span class="glyphicon glyphicon-plus" aria-hidden="true"></span>批量上传已拉动清单
								</button>
								<div class="modal fade" id="exampleModal" tabindex="-1"
									role="dialog" aria-labelledby="exampleModalLabel">
									<div class="modal-dialog" role="document">
										<div class="modal-content">
											<div class="modal-header">
												<button type="button" class="close" data-dismiss="modal"
													aria-label="Close">
													<span aria-hidden="true">&times;</span>
												</button>
												<h4 class="modal-title" id="exampleModalLabel">已拉动清单上传</h4>
											</div>
											<form action="PullSuccessBatchAction" method="post"
												enctype="multipart/form-data">
												<div class="modal-body">
													<div class="form-group">
														<label for="exampleInputFile">CSV文件上传</label> <input
															type="file" id="exampleInputFile" name="excel">
														<p class="help-block">请使用标准模板，并核对表格中的数据后上传.</p>
													</div>
												</div>
												<div class="modal-footer">
													<button type="button" class="btn btn-default"
														data-dismiss="modal">Close</button>
													<button type="submit" class="btn btn-primary">上传</button>
												</div>
											</form>
										</div>
									</div>
								</div>
								<div class="btn-group">
									<button class="btn btn-default dropdown-toggle" type="button"
										id="dropdownMenu1" data-toggle="dropdown" aria-haspopup="true"
										aria-expanded="true">
										<span class="glyphicon glyphicon-download-alt"
											aria-hidden="true"></span>批量导出<span class="caret"></span>
									</button>
									<ul class="dropdown-menu dropdown-light">
										<li><a href="#" class="export-csv" data-table="#table">
												Save as CSV </a></li>
									</ul>
								</div>

							</div>

							<table id="table">
							</table>
						</div>
					</div>

				</div>
				<!--待拉动结束 -->
				<!--已拉动-->
				<div role="tabpanel" class="tab-pane" id="profile">
					<div class="col-xs-12">
						<div class="panel-body"
							style="padding-bottom: 0px; padding-top: 0px;">
							<p class="bg-danger">${savenumber}${updatenumber}${error}</p>
							<%-- <div id="toolbar2" class="btn-group">
								<button id="btn_add" type="button" class="btn btn-default"
									data-toggle="modal" data-target="#exampleModal"
									data-whatever="@mdo">
									<span class="glyphicon glyphicon-plus" aria-hidden="true"></span>批量上传已拉动清单
								</button>
								<div class="modal fade" id="exampleModal" tabindex="-1"
									role="dialog" aria-labelledby="exampleModalLabel">
									<div class="modal-dialog" role="document">
										<div class="modal-content">
											<div class="modal-header">
												<button type="button" class="close" data-dismiss="modal"
													aria-label="Close">
													<span aria-hidden="true">&times;</span>
												</button>
												<h4 class="modal-title" id="exampleModalLabel">MO新增</h4>
											</div>
											<form action="SaveMO" method="post"
												enctype="multipart/form-data">
												<div class="modal-body">
													<div class="form-group">
														<label for="exampleInputFile">Excel文件上传</label> <input
															type="file" id="exampleInputFile" name="excel">
														<p class="help-block">请使用标准模板，并核对表格中的数据后上传.</p>
													</div>
												</div>
												<div class="modal-footer">
													<button type="button" class="btn btn-default"
														data-dismiss="modal">Close</button>
													<button type="submit" class="btn btn-primary">上传</button>
												</div>
											</form>
										</div>
									</div>
								</div>
								<div class="btn-group">
								<button class="btn btn-default dropdown-toggle" type="button"
									id="dropdownMenu1" data-toggle="dropdown" aria-haspopup="true"
									aria-expanded="true">
									<span class="glyphicon glyphicon-download-alt" aria-hidden="true"></span>批量导出<span class="caret"></span>
								</button>
								<ul class="dropdown-menu dropdown-light">
									<li><a href="#" class="export-csv" data-table="#table">
											Save as CSV </a></li>
								</ul>
							</div>
							</div> --%>
							<table id="table2">
							</table>
						</div>
					</div>

				</div>
				<!--已拉动结束-->
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
	<script src="js/bootstrap-editable.js"></script>
	<script src="js/bootstrap-table.js"></script>
	<script src="js/bootstrap-table-locale-all.min.js"></script>
	<script src="js/bootstrap-table-editable.js"></script>
	<script src="js/combodate.js"></script>
	<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
	<!-- table export -->
	<script src="js/tableExport/tableExport.js"></script>
	<script src="js/table-export.js"></script>
	<script src="js/main.js"></script>
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
		window.operateEvents = {
			'click .Start' : function(e, value, row, index) {
				$.ajax({
					type : "post",
					url : "PullSuccessAction",
					data : {
						"id" : row.id,
						"method_type_id" : "3"
					},
					success : function(data, status) {
						$('#table').bootstrapTable('refresh');
					}
				});
			}
		};
		function operateFormatter(value, row, index) {
			return [
					'<a href="#'+ '" class="Start"><button class="btn btn-success" type="button">确认</button></a>', ]
					.join('');
		}
		var oTableInit;
		var tableConfig = {
			url : '/Otracking/GetMaterialPullListAction?method_type_id=3&flag=1', //请求后台的URL（*）
			method : 'get', //请求方式（*）
			contentType : "application/x-www-form-urlencoded",//必须要有！！！！
			toolbar : '#toolbar', //工具按钮用哪个容器
			striped : true, //是否显示行间隔色
			cache : false, //是否使用缓存，默认为true，所以一般情况下需要设置一下这个属性（*）
			pagination : true, //是否显示分页（*）
			sortable : true, //是否启用排序
			sortOrder : "asc", //排序方式
			//editable : true,
			//queryParams: oTableInit.queryParams,//传递参数（*）
			sidePagination : "server", //分页方式：client客户端分页，server服务端分页（*）
			pageNumber : 1, //初始化加载第一页，默认第一页
			pageSize : 10, //每页的记录行数（*）
			pageList : [ 10, 100, 1000, 5000, 10000 ], //可供选择的每页的行数（*）
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
			paginationVAlign : "both",
			columns : [ {
				field : 'id',
				title : 'ID',
				align : 'center',
				valign : 'middle'
			}, {
				field : 'processline',
				title : '产线',
				align : 'center',
				valign : 'middle',
			}, {
				field : 'order_name',
				title : '订单名称',
				align : 'center',
				valign : 'middle'
			}, {
				field : 'batch_name',
				title : 'Batch',
				align : 'center',
				valign : 'middle'
			}, {
				field : 'name',
				title : 'MO',
				align : 'center',
				valign : 'middle'
			}, {
				field : 'dms_id',
				title : 'AOP',
				align : 'center',
				valign : 'middle'
			}, {
				field : 'family',
				title : '产品类型',
				align : 'center',
				valign : 'middle'
			}, {
				field : 'type',
				title : '产品型号',
				align : 'center',
				valign : 'middle'
			}, {
				field : 'schedule_starttime',
				title : '排产日期',
				sortable : true,
				align : 'center',
				valign : 'middle',
				formatter : function(value, row, index) {
					return changeDateFormat(value)
				}
			}, {
				field : 'mechanical_assembly_starttime',
				title : '机械开始时间',
				sortable : true,
				align : 'center',
				valign : 'middle'
			}, {
				field : 'cubicle_cabling_starttime',
				title : '配线开始时间',
				sortable : true,
				align : 'center',
				valign : 'middle'
			}, {
				field : 'schedule_endtime',
				title : '发货日期',
				sortable : true,
				align : 'center',
				valign : 'middle',
				formatter : function(value, row, index) {
					return changeDateFormat(value)
				}
			}, {
				field : 'material_name',
				title : '物料名称',
				align : 'center',
				valign : 'middle'
			}, {
				field : 'material_description',
				title : '物料描述',
				align : 'center',
				valign : 'middle'
			}, {
				field : 'quantity',
				title : '数量',
				align : 'center',
				valign : 'middle'
			}, {
				field : 'pull',
				title : '拉动',
				align : 'center',
				valign : 'middle',
				events : operateEvents,
				formatter : operateFormatter
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
							if (data != 0) {
								alert("编辑成功");
							} else {
								alert("编辑失败（目前仅支持OKKEN/Blokset修改产线！）");
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
		var table2Config = {
			url : '/Otracking/GetMaterialPullListAction?method_type_id=3&flag=2', //请求后台的URL（*）
			method : 'get', //请求方式（*）
			contentType : "application/x-www-form-urlencoded",//必须要有！！！！
			toolbar : '#toolbar2', //工具按钮用哪个容器
			striped : true, //是否显示行间隔色
			cache : false, //是否使用缓存，默认为true，所以一般情况下需要设置一下这个属性（*）
			pagination : true, //是否显示分页（*）
			sortable : true, //是否启用排序
			sortOrder : "desc", //排序方式
			//editable : true,
			//queryParams: oTableInit.queryParams,//传递参数（*）
			sidePagination : "server", //分页方式：client客户端分页，server服务端分页（*）
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
			columns : [ {
				field : 'id',
				title : 'ID',
				align : 'center',
				valign : 'middle'
			}, {
				field : 'processline',
				title : '产线',
				align : 'center',
				valign : 'middle',
			}, {
				field : 'order_name',
				title : '订单名称',
				align : 'center',
				valign : 'middle'
			}, {
				field : 'batch_name',
				title : 'Batch',
				align : 'center',
				valign : 'middle'
			}, {
				field : 'name',
				title : 'MO',
				align : 'center',
				valign : 'middle'
			}, {
				field : 'dms_id',
				title : 'AOP',
				align : 'center',
				valign : 'middle'
			}, {
				field : 'family',
				title : '产品类型',
				align : 'center',
				valign : 'middle'
			}, {
				field : 'type',
				title : '产品型号',
				align : 'center',
				valign : 'middle'
			}, {
				field : 'schedule_starttime',
				title : '排产日期',
				sortable : true,
				align : 'center',
				valign : 'middle',
				formatter : function(value, row, index) {
					return changeDateFormat(value)
				}
			}, {
				field : 'mechanical_assembly_starttime',
				title : '机械开始时间',
				sortable : true,
				align : 'center',
				valign : 'middle',
				width : '105px',
			}, {
				field : 'cubicle_cabling_starttime',
				title : '配线开始时间',
				sortable : true,
				align : 'center',
				valign : 'middle',
				width : '105px',
			}, {
				field : 'schedule_endtime',
				title : '发货日期',
				sortable : true,
				align : 'center',
				valign : 'middle',
				width : '105px',
				formatter : function(value, row, index) {
					return changeDateFormat(value)
				}
			}, {
				field : 'material_name',
				title : '物料名称',
				align : 'center',
				valign : 'middle'
			}, {
				field : 'material_description',
				title : '物料描述',
				align : 'center',
				valign : 'middle'
			}, {
				field : 'quantity',
				title : '数量',
				align : 'center',
				valign : 'middle'
			}, {
				field : 'pull_time',
				title : '拉动时间',
				align : 'center',
				valign : 'middle',
				width : '105px',
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
							if (data != 0) {
								alert("编辑成功");
							} else {
								alert("编辑失败（目前仅支持OKKEN/Blokset修改产线！）");
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
				$('#table2').bootstrapTable(table2Config);

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
		window.onload = function() {
			Main.init();
			TableExport.init();
		}
		//修改——转换日期格式(时间戳转换为date格式)
		function changeDateFormat(cellval) {
			if (cellval != null) {
				var d = new Date(cellval);
				var times = d.getFullYear() + '-' + (d.getMonth() + 1) + '-'
						+ d.getDate()
				return times;
			} else {
				return cellval;
			}
		}
		//修改——转换日期格式(时间戳转换为datetime格式)
		function changeDateTimeFormat(cellval) {
			if (cellval != null) {
				var d = new Date(cellval);
				var times = d.getFullYear() + '-' + (d.getMonth() + 1) + '-'
						+ d.getDate() + ' ' + d.getHours() + ':'
						+ d.getMinutes() + ':' + d.getSeconds();
				return times;
			} else {
				return cellval;
			}
		}
	</script>
</body>
</html>