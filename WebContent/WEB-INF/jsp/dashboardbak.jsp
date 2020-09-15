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
<style>
.text-mymuted {
	color: #777;
}

.text-myprimary {
	color: #337ab7;
}

.text-mysuccess {
	color: #1cba63;
}

.text-myinfo {
	color: #00c3e0;
}

.text-mywarning {
	color: #8a6d3b;
}

.text-mydanger {
	color: #ef4844;
}
.text-mydefault {
	color: #cccccc;
}
</style>
</head>

<body>
	<%@include file="head.jsp"%>

	<div class="container-fluid mycontainer bs-docs-container">
		<div class="row">
			<div class="col-md-10" role="main">
				<%-- <div class="bs-docs-section">
					<h1 id="download" class="page-header">产出统计</h1>
					<br>
					<div class="row">
						<div class="col-xs-3 myblock">
							<blockquote>
								<h4>
									19616台 <span class="glyphicon glyphicon-chevron-up success"
										aria-hidden="true"></span>
								</h4>
								<footer>
									历史产出<cite title="Source Title"></cite>
								</footer>
								<br>
								<div style="width: 100%;">
									<canvas id="canvasH" class="chart-legend"></canvas>
								</div>
							</blockquote>
						</div>
						<div class="col-xs-3 myblock">
							<blockquote>
								<h4>
									793台 <span class="glyphicon glyphicon-chevron-up success"
										aria-hidden="true"></span>
								</h4>
								<footer>
									当年产出<cite title="Source Title"></cite>
								</footer>
								<br>
								<div style="width: 100%;">
									<canvas id="canvasY" class="chart-legend"></canvas>
								</div>
							</blockquote>
						</div>
						<div class="col-xs-3 myblock">
							<blockquote>
								<h4>
									719台 <span class="glyphicon glyphicon-chevron-up success"
										aria-hidden="true"></span>
								</h4>
								<footer>
									当年OKKEN产出<cite title="Source Title"></cite>
								</footer>
								<br>
								<div style="width: 100%;">
									<canvas id="canvasO" class="chart-legend"></canvas>
								</div>
							</blockquote>
						</div>
						<div class="col-xs-3 myblock">
							<blockquote>
								<h4>
									74台 <span class="glyphicon glyphicon-chevron-up success"
										aria-hidden="true"></span>
								</h4>
								<footer>
									当年Blokset产出<cite title="Source Title"></cite>
								</footer>
								<br>
								<div style="width: 100%;">
									<canvas id="canvasB" class="chart-legend"></canvas>
								</div>
							</blockquote>
						</div>
					</div>
				</div> --%>
				<div class="bs-docs-section">
					<h1 id="whats-included" class="page-header">生产状态</h1>
					<%-- 
					<div class="row">
						<div class="col-md-6" style="padding-left:0px">
							<h3 id="mo">
								<span class="label label-success">主线</span>
							</h3>
						</div>
						<div class="col-md-6">
							<div class="btn-group pull-right">
								</br>
								<button class="btn btn-default dropdown-toggle" type="button"
									id="dropdownMenu1" data-toggle="dropdown" aria-haspopup="true"
									aria-expanded="true">
									Export <span class="caret"></span>
								</button>
								<ul class="dropdown-menu dropdown-light pull-right">
									<li><a href="#" class="export-csv" data-table="#table">
											Save as CSV </a></li>
									<!-- <li>
														<a href="#" class="export-txt" data-table="#table">
															Save as TXT
														</a>
													</li>
													<li>
														<a href="#" class="export-xml" data-table="#table">
															Save as XML
														</a>
													</li>
													<li>
														<a href="#" class="export-sql" data-table="#table">
															Save as SQL
														</a>
													</li>
													<li>
														<a href="#" class="export-json" data-table="#table">
															Save as JSON
														</a>
													</li>
													<li>
														<a href="#" class="export-excel" data-table="#table">
															Export to Excel
														</a>
													</li>
													<li>
														<a href="#" class="export-doc" data-table="#table">
															Export to Word
														</a>
													</li> -->
								</ul>
							</div>
						</div>
					</div>
					<div id="toolbar">
						<h4>
							<span class="label label-success">已完成</span> <span
								class="label label-info">生产中</span> <span
								class="label label-default">未开始</span> <span
								class="label label-danger">生产异常</span>
						</h4>
					</div>
					<table id="table"></table>
					<h3 id="lvs">
						<span class="label label-success">LVS</span>
					</h3>
					<div id="lvstoolbar">
						<h4>
							<span class="label label-success">已完成</span> <span
								class="label label-info">生产中</span> <span
								class="label label-default">未开始</span> <span
								class="label label-danger">生产异常</span>
						</h4>
					</div>
					<table id="LVStable"></table> --%>
					<h3 id="wip">
						<span class="label label-success">WIP状态：${TotalWIP }/500</span>
					</h3>
					<br>
					<div class="row">
						<!--  
						<div class="col-xs-5">
							<div class="hr">
								<div id="canvas-holder" style="width: 100%">
									<canvas id="chart-area"></canvas>
								</div>
							</div>
						</div>
						-->
						<div class="col-xs-12">
							<div style="width: 100%">
								<canvas id="wipcanvas"></canvas>
							</div>
						</div>
					</div>
				</div>
				<%-- <div class="bs-docs-section">
					<h1 id="plt" class="page-header">PLT统计(测试：数据统计中)</h1>
					<br>
					<div class="row">
						<div class="col-xs-2 col-xs-offset-10">
							<select
								onchange="show_PLT(this.options[this.options.selectedIndex].value)"
								class="form-control">
								<option>OKKEN</option>
								<option>Blokset</option>
							</select>
						</div>
					</div>

					<div id="container" style="width: 100%;">
						<canvas id="canvasplt"></canvas>
					</div>
				</div> --%>
			</div>
			<div class="col-xs-2" role="complementary">
				<nav class="bs-docs-sidebar hidden-print hidden-xs hidden-sm">
					<ul class="nav bs-docs-sidenav">
						<li><a href="#download">产出统计</a></li>
						<li><a href="#whats-included">生产进度</a>
							<ul class="nav">
								<li><a href="#mo">主线</a></li>
								<li><a href="#lvs">LVS</a></li>
								<li><a href="#wip">WIP状态</a></li>
							</ul></li>
						<li><a href="#grunt">异常信息看板</a></li>
						<li><a href="#plt">PLT统计</a></li>
					</ul>
					<a class="back-to-top" href="#top"> 返回顶部 </a>
				</nav>
			</div>
		</div>
	</div>

	<%@include file="bottom.jsp"%>
	<!-- Bootstrap core JavaScript
    ================================================== -->
	<!-- Placed at the end of the document so the pages load faster -->
	<script type="text/javascript" src="js/jquery.min.js"></script>
	<script>
		window.jQuery
				|| document.write('<script src="js/jquery.min.js"><\/script>')
	</script>
	<script src="js/bootstrap.min.js"></script>
	<script src="js/bootstrap3-typeahead.js"></script>
	<script src="js/bootstrap-table.js"></script>
	<script src="js/bootstrap-table-locale-all.min.js"></script>
	<script type="text/javascript" src="js/Chartbundle.js"></script>
	<script type="text/javascript" src="js/utils.js"></script>
	<script type="text/javascript" src="js/docs.min.js"></script>
	<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
	<script src="js/ie10-viewport-bug-workaround.js"></script>
	<!-- table export -->
	<script src="js/tableExport/tableExport.js"></script>
	<script src="js/tableExport/jquery.base64.js"></script>
	<script src="js/tableExport/html2canvas.js"></script>
	<script src="js/tableExport/jspdf/libs/sprintf.js"></script>
	<script src="js/tableExport/jspdf/jspdf.js"></script>
	<script src="js/tableExport/jspdf/libs/base64.js"></script>
	<script src="js/table-export.js"></script>
	<script src="js/main.js"></script>
	<script type="text/javascript">
	var lang = navigator.language || navigator.userLanguage;
		var MONTHS = [ 'January', 'February', 'March', 'April', 'May', 'June',
				'July', 'August', 'September', 'October', 'November',
				'December' ];
		var color = Chart.helpers.color;

		var tableConfig = {
			url : '/Otracking/GetMODetailStatus', //请求后台的URL（*）
			method : 'get', //请求方式（*）
			contentType : "application/x-www-form-urlencoded",//必须要有！！！！
			toolbar : '#toolbar', //工具按钮用哪个容器
			striped : true, //是否显示行间隔色
			cache : false, //是否使用缓存，默认为true，所以一般情况下需要设置一下这个属性（*）
			pagination : true, //是否显示分页（*）
			sortable : false, //是否启用排序
			sortOrder : "desc", //排序方式
			//editable : true,
			//queryParams: oTableInit.queryParams,//传递参数（*）
			sidePagination : "client", //分页方式：client客户端分页，server服务端分页（*）
			pageNumber : 1, //初始化加载第一页，默认第一页
			pageSize : 8, //每页的记录行数（*）
			pageList : [ 15, 25, 40, 80, 100,500,1000,1500 ], //可供选择的每页的行数（*）
			search : true, //是否显示表格搜索，此搜索是客户端搜索，不会进服务端，所以，个人感觉意义不大
			//strictSearch: true,
			//showColumns: true,                  //是否显示所有的列
			showRefresh : true, //是否显示刷新按钮
			//minimumCountColumns: 2,             //最少允许的列数
			clickToSelect : false, //是否启用点击选中行
			//height: 500,                        //行高，如果没有设置height属性，表格自动根据记录条数觉得表格高度
			uniqueId : "ID", //每一行的唯一标识，一般为主键列
			//showToggle:true,                    //是否显示详细视图和列表视图的切换按钮
			//cardView: false,                    //是否显示详细视图
			//detailView: false,                   //是否显示父子表+
			//showFullscreen : true,
			buttonsAlign : 'left',
			searchAlign : 'left',
			toolbarAlign : 'right',
			//searchText : '请输入订单名称或Batch号进行检索...',
			locale : lang,
			columns : [ {
				field : 'id',
				title : '编号',
				sortable : true,
				align : 'center',
				valign : 'middle',
				width : '50px',
			}, {
				field : 'processline',
				title : '产线',
				editable : true,
				align : 'center',
				valign : 'middle',
				width : '80px',
			} ,{
				field : 'ordername',
				title : '订单名称',
				editable : true,
				align : 'center',
				valign : 'middle',
				width : '180px',
			}, {
				field : 'batchname',
				title : 'Batch',
				editable : true,
				align : 'center',
				valign : 'middle',
				width : '100px',
			}, {
				field : 'moname',
				title : 'MO',
				editable : true,
				align : 'center',
				valign : 'middle',
				width : '100px',
			}, {
				field : 'dms_id',
				title : 'AOP',
				editable : true,
				align : 'center',
				valign : 'middle',
				width : '120px',
			},{
				field : 'cabling_sub_assembly',
				title : '配线预组',
				align : 'center',
				valign : 'middle',
				width : '75px',
			}, {
				field : 'mechanical_sub_assembly',
				title : '柜体预组',
				align : 'center',
				valign : 'middle',
				width : '75px',
			}, /* {
						field : 'cabling_sub_assembly',
						title : '配线预组',
						align : 'center',
						valign : 'middle',

					},  */{
				field : 'mechanical_assembly',
				title : '机械',
				editable : true,
				align : 'center',
				valign : 'middle',
				width : '60px',
			}, /* {
						field : 'door_assembly',
						title : '门板安装',
						editable : true,
						align : 'center',
						valign : 'middle',
					},  */{
				field : 'cubicle_cabling',
				title : '配线',
				editable : true,
				align : 'center',
				valign : 'middle',
				width : '60px',
			}, {
				field : 'FQC',
				title : 'FQC',
				align : 'center',
				valign : 'middle',
				width : '60px',
			}, {
				field : 'finaly_assembly',
				title : '后段',
				align : 'center',
				valign : 'middle',
				width : '60px',
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
		var lvstableConfig = {
				url : '/Otracking/GetLVSMODetailStatusAction', //请求后台的URL（*）
				method : 'get', //请求方式（*）
				contentType : "application/x-www-form-urlencoded",//必须要有！！！！
				toolbar : '#lvstoolbar', //工具按钮用哪个容器
				striped : true, //是否显示行间隔色
				cache : false, //是否使用缓存，默认为true，所以一般情况下需要设置一下这个属性（*）
				pagination : true, //是否显示分页（*）
				sortable : false, //是否启用排序
				sortOrder : "desc", //排序方式
				//editable : true,
				//queryParams: oTableInit.queryParams,//传递参数（*）
				sidePagination : "client", //分页方式：client客户端分页，server服务端分页（*）
				pageNumber : 1, //初始化加载第一页，默认第一页
				pageSize : 8, //每页的记录行数（*）
				pageList : [ 15, 25, 40, 80, 100 ], //可供选择的每页的行数（*）
				search : true, //是否显示表格搜索，此搜索是客户端搜索，不会进服务端，所以，个人感觉意义不大
				//strictSearch: true,
				//showColumns: true,                  //是否显示所有的列
				showRefresh : true, //是否显示刷新按钮
				//minimumCountColumns: 2,             //最少允许的列数
				clickToSelect : false, //是否启用点击选中行
				//height: 500,                        //行高，如果没有设置height属性，表格自动根据记录条数觉得表格高度
				uniqueId : "ID", //每一行的唯一标识，一般为主键列
				//showToggle:true,                    //是否显示详细视图和列表视图的切换按钮
				//cardView: false,                    //是否显示详细视图
				//detailView: false,                   //是否显示父子表+
				//showFullscreen : true,
				buttonsAlign : 'left',
				searchAlign : 'left',
				toolbarAlign : 'right',
				//searchText : '请输入订单名称或Batch号进行检索...',
				locale : lang,
				columns : [ {
					field : 'id',
					title : '编号',
					sortable : true,
					align : 'center',
					valign : 'middle',
				}, {
					field : 'ordername',
					title : '订单名称',
					editable : true,
					align : 'left',
					valign : 'middle',
				}, {
					field : 'batchname',
					title : 'Batch',
					editable : true,
					align : 'center',
					valign : 'middle',
					width : '150px',
				}, {
					field : 'moname',
					title : 'MO',
					editable : true,
					align : 'center',
					valign : 'middle',
					width : '100px',
				}, {
					field : 'product_bigtype_name',
					title : '类型',
					editable : true,
					align : 'center',
					valign : 'middle',
					width : '100px',
				}, {
					field : 'product_type_name',
					title : '型号',
					editable : true,
					align : 'center',
					valign : 'middle',
					width : '100px',
				}, {
					field : 'schedule_starttime',
					title : '排产日期',
					editable : true,
					align : 'center',
					valign : 'middle',
					width : '100px',
				}, {
					field : 'LVS',
					title : 'LVS',
					align : 'center',
					valign : 'middle',
				}, /* {
							field : 'cabling_sub_assembly',
							title : '配线预组',
							align : 'center',
							valign : 'middle',

						},  */{
					field : 'FQC',
					title : 'FQC',
					editable : true,
					align : 'center',
					valign : 'middle',
				}, /* {
							field : 'door_assembly',
							title : '门板安装',
							editable : true,
							align : 'center',
							valign : 'middle',
						},  */{
					field : 'warehouse_received',
					title : '库房收货',
					editable : true,
					align : 'center',
					valign : 'middle',
				}, {
					field : 'warehouse_typing',
					title : '成品上账',
					align : 'center',
					valign : 'middle',
				}],
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
		var interruptiontableConfig = {
			url : '/Otracking/getCurrentInterruption', //请求后台的URL（*）
			method : 'get', //请求方式（*）
			contentType : "application/x-www-form-urlencoded",//必须要有！！！！
			//toolbar : '#toolbar', //工具按钮用哪个容器
			striped : true, //是否显示行间隔色
			cache : false, //是否使用缓存，默认为true，所以一般情况下需要设置一下这个属性（*）
			pagination : true, //是否显示分页（*）
			sortable : false, //是否启用排序
			sortOrder : "desc", //排序方式
			//editable : true,
			//queryParams: oTableInit.queryParams,//传递参数（*）
			sidePagination : "client", //分页方式：client客户端分页，server服务端分页（*）
			pageNumber : 1, //初始化加载第一页，默认第一页
			pageSize : 15, //每页的记录行数（*）
			pageList : [ 15, 25, 40, 80, 100 ], //可供选择的每页的行数（*）
			search : true, //是否显示表格搜索，此搜索是客户端搜索，不会进服务端，所以，个人感觉意义不大
			//strictSearch: true,
			//showColumns: true,                  //是否显示所有的列
			showRefresh : true, //是否显示刷新按钮
			//minimumCountColumns: 2,             //最少允许的列数
			clickToSelect : false, //是否启用点击选中行
			//height: 500,                        //行高，如果没有设置height属性，表格自动根据记录条数觉得表格高度
			uniqueId : "ID", //每一行的唯一标识，一般为主键列
			//showToggle:true,                    //是否显示详细视图和列表视图的切换按钮
			//cardView: false,                    //是否显示详细视图
			//detailView: false,                   //是否显示父子表+
			//showFullscreen : true,
			buttonsAlign : 'left',
			searchAlign : 'left',
			toolbarAlign : 'right',
			//searchText : '请输入订单名称或Batch号进行检索...',
			locale : lang,
			columns : [ {
				field : 'seeeorder_name',
				title : '订单名称',
				editable : true,
				align : 'left',
				valign : 'middle',
			}, {
				field : 'batch_name',
				title : 'Batch',
				editable : true,
				align : 'center',
				valign : 'middle',
			}, {
				field : 'mo_name',
				title : 'MO',
				editable : true,
				align : 'center',
				valign : 'middle',
			}, {
				field : 'type_name',
				title : '型号',
				align : 'center',
				valign : 'middle',
			}, {
				field : 'processline_name',
				title : '产线',
				editable : true,
				align : 'center',
				valign : 'middle',
			},{
				field : 'interruption_time',
				title : '中断时间',
				editable : true,
				align : 'center',
				valign : 'middle',
			}, {
				field : 'schedule_endtime',
				title : '发货日期',
				editable : true,
				align : 'center',
				valign : 'middle',
			}, {
				field : 'interruption_recover_type',
				title : '分类',
				align : 'center',
				valign : 'middle',
			},{
				field : 'description',
				title : '描述',
				align : 'center',
				valign : 'middle',
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
			/* //WIP占比设置
			var randomScalingFactor = function() {
				return Math.round(Math.random() * 100);
			};
			var pmProportion = [ 0, 0 ];
			function setChartArea() {
				$.ajax({
					url : '/Otracking/WIPProportion',
					type : 'GET',
					success : function(data) {
						//config.data.datasets.data.push(30);
						//alert(pmProportion);
						//for (var i = 0; i < data.length; i++) {
						//pmProportion[i] = data[i];
						//}
						var i = 0;
						config.data.datasets.forEach(function(dataset) {
							dataset.data = dataset.data.map(function() {
								return data[i++];
							});
						});
						var ctx = document.getElementById('chart-area').getContext('2d');
						window.myDoughnut = new Chart(ctx, config);
					}
				});
			} */
		/* var config = {
			type : 'doughnut',
			data : {
				datasets : [ {
					data : pmProportion,
					mytype : 'doughnut',
					backgroundColor : [ 'rgba(0,208,98,255)',window.chartColors.blue,
							window.chartColors.red, window.chartColors.orange,
							window.chartColors.yellow,
							window.chartColors.green, window.chartColors.blue,
							window.chartColors.purple,window.chartColors.gray ],
					label : 'Dataset 1'
				} ],
				labels : [ '余量', '柜体预组', '70产线', '115产线', 'BlockSet产线', 'PLC产线',
						'非标产线', '核电产线', 'FQC', '最终装配' ]
			},
			options : {
				responsive : true,
				legend : {
					position : 'left',
					display : false,
				},
				title : {
					display : false,
					text : ''
				},
				animation : {
					animateScale : true,
					animateRotate : true
				}
			}
		}; */

		// Define a plugin to provide data labels
		Chart.plugins.register({
			afterDatasetsDraw : function(chart) {
				if (chart.data.datasets[0].mytype == 'doughnut') {
					//alert(chart.getDatasetMeta(i));
					var ctx = chart.ctx;
					//var ctx = document.getElementById('chart-area').getContext('2d');
					chart.data.datasets.forEach(function(dataset, i) {
						var meta = chart.getDatasetMeta(i);
						if (!meta.hidden) {
							meta.data
									.forEach(function(element, index) {
										//if(dataset.labels[0].toString()!= 'PM' ){
										//return false;
										//}
										// Draw the text in black, with the specified font
										ctx.fillStyle = 'rgb(0, 0, 0)';
										var fontSize = 16;
										var fontStyle = 'normal';
										var fontFamily = 'Helvetica Neue';
										ctx.font = Chart.helpers
												.fontString(fontSize,
														fontStyle, fontFamily);
										// Just naively convert to string for now
										var dataString = dataset.data[index]
												.toString();
										// Make sure alignment settings are correct
										ctx.textAlign = 'center';
										ctx.textBaseline = 'middle';
										var padding = 5;
										var position = element
												.tooltipPosition();
										ctx.fillText(dataString + '',
												position.x, position.y
														- (fontSize / 2)
														- padding + 10);
									});
						}
					});
				}
			}
		});
		var MONTHS = [ '', '', '', '', '', '', '', '', '', '', '', '' ];
		var History = [ '', '', '', '', '' ];
		var configH = {
			type : 'line',
			data : {
				labels : History,
				display : false,
				datasets : [ {
					display : false,
					label : '',
					fill : false,
					backgroundColor : "#38c859",
					borderColor : "#38c859",
					data : [ 431, 322, 518, 488, 506, 327, 278, 512, 517 ],
				} ]
			},
			options : {
				responsive : true,
				title : {
					display : false,
					text : '设备故障平均修复时间MTTR'
				},
				tooltips : {
					mode : 'index',
					intersect : false,
				},
				hover : {
					mode : 'nearest',
					intersect : true
				},
				scales : {
					xAxes : [ {
						display : false,
						scaleLabel : {
							display : false,
							labelString : '月'
						}
					} ],
					yAxes : [ {
						ticks : {
							beginAtZero : true
						},
						display : false,
						scaleLabel : {
							display : false,
							labelString : '台'
						}
					} ]
				},
				legend : {
					position : 'bottom',
					display : false,
				},
			}
		};
		var configY = {
			type : 'line',
			data : {
				labels : MONTHS,
				display : false,
				datasets : [ {
					display : false,
					label : '',
					fill : false,
					backgroundColor : "#38c859",
					borderColor : "#38c859",
					data : [ 431, 322, 518, 488, 506, 327, 278, 512, 517 ],
				} ]
			},
			options : {
				responsive : true,
				title : {
					display : false,
					text : '设备故障平均修复时间MTTR'
				},
				tooltips : {
					mode : 'index',
					intersect : false,
				},
				hover : {
					mode : 'nearest',
					intersect : true
				},
				scales : {
					xAxes : [ {
						display : false,
						scaleLabel : {
							display : false,
							labelString : '月'
						}
					} ],
					yAxes : [ {
						ticks : {
							beginAtZero : true
						},
						display : false,
						scaleLabel : {
							display : false,
							labelString : '台'
						}
					} ]
				},
				legend : {
					position : 'bottom',
					display : false,
				},
			}
		};
		var configO = {
			type : 'line',
			data : {
				labels : MONTHS,
				display : false,
				datasets : [ {
					display : false,
					label : '',
					fill : false,
					backgroundColor : "#38c859",
					borderColor : "#38c859",
					data : [ 431, 322, 518, 488, 506, 327, 278, 512, 517 ],
				} ]
			},
			options : {
				responsive : true,
				title : {
					display : false,
					text : '设备故障平均修复时间MTTR'
				},
				tooltips : {
					mode : 'index',
					intersect : false,
				},
				hover : {
					mode : 'nearest',
					intersect : true
				},
				scales : {
					xAxes : [ {
						display : false,
						scaleLabel : {
							display : false,
							labelString : '月'
						}
					} ],
					yAxes : [ {
						ticks : {
							beginAtZero : true
						},
						display : false,
						scaleLabel : {
							display : false,
							labelString : '台'
						}
					} ]
				},
				legend : {
					position : 'bottom',
					display : false,
				},
			}
		};
		var configB = {
			type : 'line',
			data : {
				labels : MONTHS,
				display : false,
				datasets : [ {
					display : false,
					label : '',
					fill : false,
					backgroundColor : "#38c859",
					borderColor : "#38c859",
					data : [ 431, 322, 518, 488, 506, 327, 278, 512, 517 ],
				} ]
			},
			options : {
				responsive : true,
				title : {
					display : false,
					text : '设备故障平均修复时间MTTR'
				},
				tooltips : {
					mode : 'index',
					intersect : false,
				},
				hover : {
					mode : 'nearest',
					intersect : true
				},
				scales : {
					xAxes : [ {
						display : false,
						scaleLabel : {
							display : false,
							labelString : '月'
						}
					} ],
					yAxes : [ {
						ticks : {
							beginAtZero : true
						},
						display : false,
						scaleLabel : {
							display : false,
							labelString : '台'
						}
					} ]
				},
				legend : {
					position : 'bottom',
					display : false,
				},
			}
		};
		var OKKEN = [ '70-2P', '70-2M', '70-2IM', '70-MP', '70-MM', '70-MIM',
				'70-F', '115(1MT)', '115-S', '115(2MT)', '115(3MT)', '115-3',
				'115-70', '230', 'PFC', 'ATS', 'VSD/SS', 'Other' ];
		var Blokset = [ 'APF', 'SPE', 'Corner', 'UP', 'UM', 'UIM', 'Da(1MT)',
				'Da(2MT)', 'Da(4K)', 'Da(5K)', 'Df', 'Daf', 'Mf', 'Dc', 'MxP',
				'MxM', 'MxIM', 'Other' ];
		var barChartData = {
			labels : OKKEN,
			datasets : [ {
				label : 'PLT',
				backgroundColor : color(window.chartColors.blue).alpha(0.5)
						.rgbString(),
				borderColor : window.chartColors.blue,
				borderWidth : 1,
				data : [ 987, 1529, 1328, 987, 1529, 1328, 987, 1529, 1328,
						987, 1529, 1328, 987, 1529, 1328, 987, 1529, 1328 ]
			} ]

		};
		function show_PLT(i) {
			if (i == 'OKKEN') {
				barChartData.datasets[0].data = [ 987, 1529, 1328, 987, 1529,
						1328, 987, 1529, 1328, 987, 1529, 1328, 987, 1529,
						1328, 987, 1529, 1000 ];
				barChartData.labels = OKKEN;
				window.chart2.update();
			} else if (i == 'Blokset') {
				barChartData.datasets[0].data = [ 987, 1529, 1328, 987, 1529,
						1328, 987, 1529, 1328, 987, 1529, 1328, 987, 1529,
						1328, 987, 1529, 500 ];
				barChartData.labels = Blokset;
				window.chart2.update();
			}
		}

		var wipbarChartData = {
				labels: ['70预组','115预组','非标预组','70机械','70配线',
					'115机械','115配线','Blokset机械','Blokset配线','核电机械','核电配线','非标机械','非标配线','PLC机械','PLC配线','弹性线机械','弹性线配线', 'FQC', '最终装配'],
				datasets: [{
					label: '可开工',
					backgroundColor: 'rgba(78,121,167,0.8)',
					stack: 'Stack 0',
					data: [
						${WIPFlag1[0]},
						${WIPFlag1[1]},
						${WIPFlag1[2]},
						${WIPFlag1[3]},
						${WIPFlag1[4]},
						${WIPFlag1[5]},
						${WIPFlag1[6]},
						${WIPFlag1[7]},
						${WIPFlag1[8]},
						${WIPFlag1[9]},
						${WIPFlag1[10]},
						${WIPFlag1[11]},
						${WIPFlag1[12]},
						${WIPFlag1[13]},
						${WIPFlag1[14]},
						${WIPFlag1[15]},
						${WIPFlag1[16]},
						${WIPFlag1[17]},
						${WIPFlag1[18]},
						${WIPFlag1[19]}
					]
				}, {
					label: '生产中',
					backgroundColor: 'rgba(242,142,43,0.8)',
					stack: 'Stack 0',
					data: [
						${WIPFlag2[0]},
						${WIPFlag2[1]},
						${WIPFlag2[2]},
						${WIPFlag2[3]},
						${WIPFlag2[4]},
						${WIPFlag2[5]},
						${WIPFlag2[6]},
						${WIPFlag2[7]},
						${WIPFlag2[8]},
						${WIPFlag2[9]},
						${WIPFlag2[10]},
						${WIPFlag2[11]},
						${WIPFlag2[12]},
						${WIPFlag2[13]},
						${WIPFlag2[14]},
						${WIPFlag2[15]},
						${WIPFlag2[16]},
						${WIPFlag2[17]},
						${WIPFlag2[18]},
						${WIPFlag2[19]}
					]
				}, {
					label: '异常',
					backgroundColor: 'rgba(255,0,0,0.8)',
					stack: 'Stack 0',
					data: [
						${WIPFlag3[0]},
						${WIPFlag3[1]},
						${WIPFlag3[2]},
						${WIPFlag3[3]},
						${WIPFlag3[4]},
						${WIPFlag3[5]},
						${WIPFlag3[6]},
						${WIPFlag3[7]},
						${WIPFlag3[8]},
						${WIPFlag3[9]},
						${WIPFlag3[10]},
						${WIPFlag3[11]},
						${WIPFlag3[12]},
						${WIPFlag3[13]},
						${WIPFlag3[14]},
						${WIPFlag3[15]},
						${WIPFlag3[16]},
						${WIPFlag3[17]},
						${WIPFlag3[18]},
						${WIPFlag3[19]}
					]
				}]

			};
		
		window.onload = function() {
			//$('#table').bootstrapTable(tableConfig);
			//$('#LVStable').bootstrapTable(lvstableConfig);
			//$('#interruptiontable').bootstrapTable(interruptiontableConfig);
			//Main.init();
			//TableExport.init();
			/* setChartArea(); */
			/* configH.data.datasets[0].data = [ 2391, 4366, 5260, 6806 ];
			var ctx = document.getElementById('canvasH').getContext('2d');
			window.myLine = new Chart(ctx, configH);
			configY.data.datasets[0].data = [ 385,408 ];
			var ctx = document.getElementById('canvasY').getContext('2d');
			window.myLine = new Chart(ctx, configY);
			configO.data.datasets[0].data = [361,358 ];
			var ctx = document.getElementById('canvasO').getContext('2d');
			window.myLine = new Chart(ctx, configO);
			configB.data.datasets[0].data = [ 24,50 ];
			var ctx = document.getElementById('canvasB').getContext('2d');
			window.myLine = new Chart(ctx, configB); */

			//var ctx = document.getElementById('canvasplt').getContext('2d');
			/* window.chart2 = new Chart(ctx, {
				type : 'bar',
				data : barChartData,
				options : {
					responsive : true,
					legend : {
						position : 'bottom',
						display : false,
					},
					title : {
						display : false,
						text : 'Chart.js Bar Chart'
					},
					scales : {
						xAxes : [ {

							display : true,
							scaleLabel : {
								display : true,

							}
						} ],
						yAxes : [ {
							ticks : {
								beginAtZero : true
							},
							display : true,
							scaleLabel : {
								display : true,
								labelString : '分钟'
							}
						} ]
					}
				}
			}); */
			
			var ctx = document.getElementById('wipcanvas').getContext('2d');
			window.myBar = new Chart(ctx, {
				type: 'bar',
				data: wipbarChartData,
				options: {
					title: {
						display: false,
						text: 'Chart.js Bar Chart - Stacked'
					},
					tooltips: {
						mode: 'index',
						intersect: false
					},
					responsive: true,
					scales: {
						xAxes: [{
							stacked: true,
						}],
						yAxes: [{
							stacked: true
						}]
					}
				}
			});
		};
	</script>
</body>
</html>