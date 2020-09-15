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

<body onload="editable()">
	<%@include file="head.jsp"%>
	<div class="container-fluid mycontainer">
		<h3>
			<span class="label label-success">工艺路径维护</span>
		</h3>
		<div class="col-xs-12">
			<div class="panel-body" style="padding-bottom: 0px;">
				<div id="toolbar" class="btn-group">
					<%-- <button id="btn_add" type="button" class="btn btn-default"
						data-toggle="modal" data-target="#exampleModal"
						data-whatever="@mdo">
						<span class="glyphicon glyphicon-plus" aria-hidden="true"></span>新增
					</button> --%>
					<div class="modal fade" id="exampleModal" tabindex="-1"
						role="dialog" aria-labelledby="exampleModalLabel">
						<div class="modal-dialog" role="document">
							<div class="modal-content">
								<div class="modal-header">
									<button type="button" class="close" data-dismiss="modal"
										aria-label="Close">
										<span aria-hidden="true">&times;</span>
									</button>
									<h4 class="modal-title" id="exampleModalLabel">工艺路径新增</h4>
								</div>
								<form action="SaveRouting" method="post">
									<div class="modal-body">
										<div class="form-group">
											<label for="recipient-name" class="control-label">请选择工艺过程所在产线</label>
											<select id="processline" class="form-control">
												<option value="">请选择产线</option>
											</select>
										</div>
										<div class="form-group">
											<label for="recipient-name" class="control-label">请选择工艺过程</label>
											<select id="method_process" name="routing.method_process_id"
												class="form-control">
												<option value="">请选择工艺过程</option>
											</select>
										</div>
										<div class="form-group">
											<label for="recipient-name" class="control-label">请选择产品类型</label>
											<select id="big_product_type" name="routing."
												class="form-control">
												<option value="">请选择产品类型</option>
											</select>
										</div>
										<div class="form-group">
											<label for="recipient-name" class="control-label">请选择产品型号</label>
											<select id="product_type" name="routing.type_id"
												class="form-control">
												<option value="">请选择产品型号</option>
											</select>
										</div>
										<div class="form-group">
											<label for="recipient-name" class="control-label">请输入工艺路径序号</label>
											<input type="text" class="form-control" id="recipient-name"
												name="routing.sequence">
										</div>
										<div class="form-group">
											<label for="recipient-name" class="control-label">请输入工艺过程的DT</label>
											<input type="text" class="form-control" id="recipient-name"
												name="routing.dt">
										</div>
										<div class="form-group">
											<label for="recipient-name" class="control-label">请输入工艺过程的TT</label>
											<input type="text" class="form-control" id="recipient-name"
												name="routing.tt">
										</div>

									</div>
									<div class="modal-footer">
										<button type="button" class="btn btn-default"
											data-dismiss="modal">Close</button>
										<button type="submit" class="btn btn-primary">保存</button>
									</div>
								</form>
							</div>
						</div>
					</div>
					<button id="btn_edit" type="button" class="btn btn-default">
						<span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>修改
					</button>
					<%-- <button id="btn_delete" type="button" class="btn btn-default">
						<span class="glyphicon glyphicon-remove" aria-hidden="true"></span>删除
					</button> --%>
				</div>
				<table id="table">
				</table>
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
		$('.form_date').datetimepicker({
			language : 'zh-CN',
			format : 'yyyy-mm-dd',//显示格式
			minView : "month",//设置只显示到月份
			initialDate : new Date(),//初始化当前日期
			setDate : new Date(),//初始化当前日期
			autoclose : true,//选中自动关闭
			todayBtn : true,//显示今日按钮
			weekStart : 1,
			todayBtn : 1,
			autoclose : 1,
			todayHighlight : 1,
			startView : 2,
			minView : 2,
			forceParse : 0,
			pickerPosition:'top-right',
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

		var tableConfig = {
			url : '/Otracking/GetRouting', //请求后台的URL（*）
			method : 'get', //请求方式（*）
			contentType : "application/x-www-form-urlencoded",//必须要有！！！！
			toolbar : '#toolbar', //工具按钮用哪个容器
			striped : true, //是否显示行间隔色
			cache : false, //是否使用缓存，默认为true，所以一般情况下需要设置一下这个属性（*）
			pagination : true, //是否显示分页（*）
			sortable : false, //是否启用排序
			sortOrder : "asc", //排序方式
			<s:if test="%{#session.staff.id == 40}">
			editable : true,
			</s:if>
			//queryParams: oTableInit.queryParams,//传递参数（*）
			sidePagination : "client", //分页方式：client客户端分页，server服务端分页（*）
			pageNumber : 1, //初始化加载第一页，默认第一页
			pageSize : 10, //每页的记录行数（*）
			pageList : [ 10, 20, 30, 40, 50, 100 ], //可供选择的每页的行数（*）
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
				checkbox : true
			}, {
				field : 'id',
				title : '序号',
			},{
				field : 'product_classify_name',
				title : '产品类型',
			}, {
				field : 'product_type_name',
				title : '产品型号',
			},{
				field : 'processline_name',
				title : '产线名称',
			}, {
				field : 'method_process',
				title : '工艺过程',
			}, {
				field : 'sequence',
				title : '生产顺序号',
			}, {
				field : 'dt',
				title : 'DT时间(min)',
				<s:if test="%{#session.staff.id == 40}">
				editable : true,
				</s:if>
			},{
				field : 'tt',
				title : 'TT时间(min)',
			}, ],
			onEditableSave : function(field, row, oldValue, $el) {
				$.ajax({
					type : "post",
					url : "EditRouting",
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
		$(function() {
			var sltProcessLine = document.getElementById("processline");
			$.ajax({
				url : '/Otracking/GetProcessLine',
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
			var sltProcessLine = document.getElementById("method_process");
			$.ajax({
				url : '/Otracking/GetMethodProcess',
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
			var sltProcessLine = document.getElementById("big_product_type");
			$.ajax({
				url : '/Otracking/GetBigType',
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
			var sltProcessLine = document.getElementById("product_type");
			$.ajax({
				url : '/Otracking/GetSmallType',
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
	</script>
</body>
</html>