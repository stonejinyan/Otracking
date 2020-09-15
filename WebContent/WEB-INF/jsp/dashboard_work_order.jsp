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
<link href="css/bootstrap-datetimepicker.min.css" rel="stylesheet">

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

	<div class="container-fluid mycontainer">
		<div class="row">
			<div class="col-xs-12">

				<div class="bs-docs-section">

					<div id="whats-included" class="page-header">
						<div class="row">
							<h1 class="col-xs-6" style="padding-top: 0px;margin-top: 0px;">工单查询</h1>
							<div class="col-xs-6">
								<div class="row">
									<div  class="col-xs-2"></div>
									<h4 class="col-xs-3" style="padding-top: 0px;">生产结束时间:</h4>
									<div class="col-xs-3" style="padding-left: 0px;">
										<div id="datetimePickerStart" style="padding-top: 5px;"
											class="controls input-append date form_date_start"
											data-date="" data-date-format="yyyy-mm-dd"
											data-link-field="dtp_input2" data-link-format="yyyy-mm-dd">
											<input id="pickDate" class="text-center" size="16"
												type="text" readonly> <span class="add-on"><i
												class="icon-remove"></i></span> <span class="add-on"><i
												class="icon-th"></i></span>
										</div>
									</div>
									<span class="col-xs-1 glyphicon glyphicon-menu-right"
										aria-hidden="true" style="padding-top: 12px;"></span>
									<div class="col-xs-3" style="padding-left: 0px;">
										<div id="datetimePickerEnd" style="padding-top: 5px;"
											class="controls input-append date form_date_end" data-date=""
											data-date-format="yyyy-mm-dd" data-link-field="dtp_input1"
											data-link-format="yyyy-mm-dd">
											<input id="pickDateStart" class="text-center" size="16"
												type="text" readonly> <span class="add-on"><i
												class="icon-remove"></i></span> <span class="add-on"><i
												class="icon-th"></i></span>
										</div>
									</div>
								</div>
							</div>



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
								<li><a href="#" class="export-csv" data-table="#table">
										Save as CSV </a></li>
							</ul>
						</div>
						<button onclick="output()" class="btn btn-success" type="button"
							id="output">最终装配</button> 
					</div>
					<table id="table"></table>

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
	<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
	<script src="js/ie10-viewport-bug-workaround.js"></script>
	<!-- table export -->
	<script src="js/tableExport/tableExport.js"></script>
	<script src="js/table-export.js"></script>
	<script src="js/main.js"></script>
	<script type="text/javascript" src="js/bootstrap-datetimepicker.min.js"
		charset="UTF-8"></script>
	<script type="text/javascript">
		var lang = navigator.language || navigator.userLanguage;
		var now = new Date();
		var date_start = getNowFormatDate(now);
		var date_end = getNowFormatDate(now);
		var tableConfig = {
			url : '/Otracking/SearchProductionScheduleAction?searchType=actual_endtime&date_start='+date_start+'&date_end='+date_end, //请求后台的URL（*）
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
			sidePagination : "server", //分页方式：client客户端分页，server服务端分页（*）
			pageNumber : 1, //初始化加载第一页，默认第一页
			pageSize : 50, //每页的记录行数（*）
			pageList : [ 50, 100, 500, 1000, 5000, 10000 ], //可供选择的每页的行数（*）
			search : false, //是否显示表格搜索，此搜索是客户端搜索，不会进服务端，所以，个人感觉意义不大
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
				field : 'processline',
				title : '产线',
				editable : true,
				align : 'center',
				valign : 'middle',
				width : '80px',
			}, {
				field : 'method_process',
				title : '工序',
				editable : true,
				align : 'center',
				valign : 'middle',
				width : '120px',
			}, {
				field : 'order_name',
				title : '订单名称',
				editable : true,
				align : 'center',
				valign : 'middle',
				width : '120px',
			}, {
				field : 'batch_name',
				title : 'Batch',
				editable : true,
				align : 'center',
				valign : 'middle'
			}, {
				field : 'mo_name',
				title : 'MO',
				editable : true,
				align : 'center',
				valign : 'middle'
			}, {
				field : 'dms_id',
				title : 'AOP',
				align : 'center',
				valign : 'middle',
				width : '90px',
			}, {
				field : 'product_bigtype_name',
				title : '产品类型',
				align : 'center',
				valign : 'middle',
				width : '75px',
			}, {
				field : 'product_type_name',
				title : '产品型号',
				editable : true,
				align : 'center',
				valign : 'middle',
				width : '75px',
			}, {
				field : 'quantity',
				title : '数量',
				align : 'center',
				valign : 'middle',
				width : '50px',
			}, {
				field : 'schedule_starttime',
				title : '计划上线时间',
				align : 'center',
				valign : 'middle',
				width : '105px',
				formatter: function (value, row, index) {
		            return changeDateFormat(value)
		        },
			}, /* {
																field : 'schedule_endtime',
																title : '发货时间',
																align : 'center',
																valign : 'middle',
									}, */{
				field : 'actual_starttime',
				title : '实际上线时间',
				align : 'center',
				valign : 'middle',
				width : '105px',
			}, {
				field : 'actual_endtime',
				title : '生产结束时间',
				align : 'center',
				valign : 'middle',
				width : '105px',
			}, {
				field : 'plt',
				title : '生产周期(H)',
				align : 'center',
				valign : 'middle'
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
		$('.form_date_start').datetimepicker({
			language : 'zh-CN',
			weekStart : 1,
			todayBtn : 1,
			autoclose : 1,
			todayHighlight : 1,
			startView : 2,
			minView : 2,
			forceParse : 0
		});
		$('.form_date_start').data("datetimepicker").setDate(new Date());
		$('.form_date_end').datetimepicker({
			language : 'zh-CN',
			weekStart : 1,
			todayBtn : 1,
			autoclose : 1,
			todayHighlight : 1,
			startView : 2,
			minView : 2,
			forceParse : 0
		});
		$('.form_date_end').data("datetimepicker").setDate(new Date());
		function datePickChange(){
			var output = document.getElementById("output");
			if(output.innerHTML=='取消筛选'){
			var dateStart = $('.form_date_start').data("datetimepicker").getDate();
			var dateEnd = $('.form_date_end').data("datetimepicker").getDate();
			date_start = getNowFormatDate(dateStart);
			date_end = getNowFormatDate(dateEnd);
			tableConfig.url = '/Otracking/SearchProductionScheduleAction?searchType=actual_endtime&date_start='+date_start+'&date_end='+date_end+'&processline=最终装配', //请求后台的URL（*）
			$('#table').bootstrapTable('refresh',tableConfig);
			}else if(output.innerHTML=='最终装配'){
				var dateStart = $('.form_date_start').data("datetimepicker").getDate();
				var dateEnd = $('.form_date_end').data("datetimepicker").getDate();
				date_start = getNowFormatDate(dateStart);
				date_end = getNowFormatDate(dateEnd);
				tableConfig.url = '/Otracking/SearchProductionScheduleAction?searchType=actual_endtime&date_start='+date_start+'&date_end='+date_end, //请求后台的URL（*）
				$('#table').bootstrapTable('refresh',tableConfig);
			}
		}
		function output(){
			var output = document.getElementById("output");
			if(output.innerHTML=='最终装配'){
			var dateStart = $('.form_date_start').data("datetimepicker").getDate();
			var dateEnd = $('.form_date_end').data("datetimepicker").getDate();
			date_start = getNowFormatDate(dateStart);
			date_end = getNowFormatDate(dateEnd);
			tableConfig.url = '/Otracking/SearchProductionScheduleAction?searchType=actual_endtime&date_start='+date_start+'&date_end='+date_end+'&processline=最终装配', //请求后台的URL（*）
			$('#table').bootstrapTable('refresh',tableConfig);
			output.innerHTML='取消筛选';
			}else if(output.innerHTML=='取消筛选'){
				var dateStart = $('.form_date_start').data("datetimepicker").getDate();
				var dateEnd = $('.form_date_end').data("datetimepicker").getDate();
				date_start = getNowFormatDate(dateStart);
				date_end = getNowFormatDate(dateEnd);
				tableConfig.url = '/Otracking/SearchProductionScheduleAction?searchType=actual_endtime&date_start='+date_start+'&date_end='+date_end, //请求后台的URL（*）
				$('#table').bootstrapTable('refresh',tableConfig);
				output.innerHTML='最终装配';
			}
		}
		//获取当前时间，格式YYYY-MM-DD
	    function getNowFormatDate(date) {
	        var seperator1 = "-";
	        var year = date.getFullYear();
	        var month = date.getMonth() + 1;
	        var strDate = date.getDate();
	        if (month >= 1 && month <= 9) {
	            month = "0" + month;
	        }
	        if (strDate >= 0 && strDate <= 9) {
	            strDate = "0" + strDate;
	        }
	        var currentdate = year + seperator1 + month + seperator1 + strDate;
	        return currentdate;
	    }
	    function changeDateFormat(cellval) {
	    	var dateVal = cellval + "";
	    	if (cellval != null) {
	        	var date = new Date(dateVal);
	        	var month = date.getMonth() + 1 < 10 ? "0" + (date.getMonth() + 1) : date.getMonth() + 1;
	        	var currentDate = date.getDate() < 10 ? "0" + date.getDate() : date.getDate();
	        	var hours = date.getHours() < 10 ? "0" + date.getHours() : date.getHours();
	        	var minutes = date.getMinutes() < 10 ? "0" + date.getMinutes() : date.getMinutes();
	        	var seconds = date.getSeconds() < 10 ? "0" + date.getSeconds() : date.getSeconds();
	        	//return date.getFullYear() + "-" + month + "-" + currentDate + " " + hours + ":" + minutes + ":" + seconds;
	        	return date.getFullYear() + "-" + month + "-" + currentDate;
	    }
	    }
		window.onload = function() {
			tableConfig.url = '/Otracking/SearchProductionScheduleAction?searchType=actual_endtime&date_start='+date_start+'&date_end='+date_end, //请求后台的URL（*）
			$('#table').bootstrapTable(tableConfig);
			Main.init();
			TableExport.init();
			$('.form_date_start').change(function() {datePickChange()});
			$('.form_date_end').change(function() {datePickChange()});
		}
	</script>
</body>
</html>