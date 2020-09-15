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

<body style="height: 100%; margin: 0">
	<%@include file="head.jsp"%>

	<div class="container-fluid mycontainer bs-docs-container">
		<div class="row">
			<div class="col-md-12" role="main">

				<div>
					<h1 id="grunt" class="page-header">无线测温数据下载</h1>
					
					<div class="row">
						<div class="col-xs-12" style="padding-left: 0px;">
							<h3 id="mo">
								<span class="label label-success">无线测温匹配记录</span>
							</h3>
						</div>
					</div>
					<div id="toolbar">
						<div class="btn-group pull-right">
							<button class="btn btn-default dropdown-toggle" type="button"
								id="dropdownMenu1" data-toggle="dropdown" aria-haspopup="true"
								aria-expanded="true">
								Export <span class="caret"></span>
							</button>
							<ul class="dropdown-menu dropdown-light pull-right">
								<li><a href="#" class="export-csv"
									data-table="#interruptiontable"> Save as CSV </a></li>
							</ul>
						</div>
					</div>
					<table id="interruptiontable"></table>
				</div>
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
	<script src="js/main.js"></script>
	<!-- EChart -->
	<script type="text/javascript" src="js/echarts/echarts.min.js"></script>
	<script type="text/javascript" src="js/echarts/echarts-gl.min.js"></script>
	<script type="text/javascript" src="js/echarts/ecStat.min.js"></script>
	<script type="text/javascript" src="js/echarts/dataTool.min.js"></script>
	<script src="js/macarons.js"></script>
	<script type="text/javascript">
		
		var lang = navigator.language || navigator.userLanguage;
		var interruptiontableConfig = {
			url : '/Otracking/GetEasergyAction', //请求后台的URL（*）
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
			pageSize : 5, //每页的记录行数（*）
			pageList : [ 5, 50, 500, 1000, 5000, 10000 ], //可供选择的每页的行数（*）
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
				align : 'center',
				valign : 'middle',
				width : '70px',
			}, {
				field : 'customer_id',
				title : '柜号',
				align : 'center',
				valign : 'middle',
				sortable : true,
			}, {
				field : 'model',
				title : '柜型',
				align : 'center',
				valign : 'middle',
				width : '90px',
			}, {
				field : 'aop',
				title : 'AOP号',
				align : 'center',
				valign : 'middle',
				width : '120px',
			}, {
				field : 'so_item',
				title : 'SO Item',
				align : 'center',
				valign : 'middle',
				width : '90px',
			}, {
				field : 'zbrn32_imput_port',
				title : 'ZBRN32 无线接入点',
				align : 'center',
				valign : 'middle',
				width : '150px',
			}, {
				field : 'assembly_position',
				title : '安装位置',
				align : 'center',
				valign : 'middle'
			}, {
				field : 'easergy_id',
				title : '无线测温传感器TH110-ID',
				align : 'center',
				valign : 'middle',
			}, {
				field : 'sequence',
				title : '匹配编码',
				align : 'center',
				valign : 'middle',
				width : '90px',
				
			} ],
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

		window.onload = function() {
			$('#interruptiontable').bootstrapTable(interruptiontableConfig);
			Main.init();
			TableExport.init();
			//showEChart();
		}
	</script>
</body>
</html>