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
<link href="css/bootstrap-switch.min.css" rel="stylesheet">
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
	<div class="container-fluid mycontainer">
		<div class="row">
			<div class="col-xs-12">

				<!-- <div id="searchtop">
			<br> <br> <br> <br> <br>
		</div> -->
				<div class="row">
					<%-- <div class="col-xs-12">
				<h1>
					SEEE<small> 累计销售：5000台</small>
				</h1>
			</div> --%>
				</div>
				<div class="row">
					<div class="col-xs-10" style="padding-left: 0px">
						<h3>
							<span class="label label-success">订单状态</span> 	<input style="margin-top: 0px;" name="status" type="checkbox"  checked>
						</h3>
					</div>
					<div class="col-xs-1">
						<h4>
							<span class="label label-info">Target ：<span id="target"></span></span>
						</h4>
						<h4>
							<span class="label label-warning"> W I P：<span id="wip"></span> </span>
						</h4>
					</div>
					<div class="col-xs-1" style="padding-right: 0px">
						<h4>
							<span class="label label-success">F G ：<span id="finishGoods"></span> </span>
						</h4>
						<h4>
							<span class="label label-danger">Abnor ：<span id="abnormal"></span> </span>
						</h4>
					</div>
					<%-- <div class="col-xs-5" id=""><br>
						<div class="input-group">
							<input data-provide="typeahead"
								placeholder="请输入订单名称或Batch号进行检索..." type="text"
								class="form-control typeahead" placeholder="Username"
								aria-describedby="basic-addon2"><a href="#"
								onclick="ordersearch();return false;" class="input-group-addon"
								id="basic-addon2"><span class="glyphicon glyphicon-search"
								aria-hidden="true"></span></a>
						</div>
					</div>  --%>
					<div id="toolbar">
						<h4>
							<span class="label label-success">已完成</span> <span
								class="label label-info">生产中</span> <span
								class="label label-default">未开始</span> <span
								class="label label-danger">生产异常</span>
								<span>|</span>
								<span><a href="#" class="export-excel" data-table="#table">Export</a></span>
						</h4>

					</div>
				</div>
				<table id="table"></table>
			</div>
			<%-- <div class="col-xs-4">
				<div class="hrbottom">
					<h3>
						<span class="label label-success">WIP 可容纳量：500</span>
					</h3>
					<div id="canvas-holder" style="width: 100%">
						<canvas id="chart-area"></canvas>
					</div>
				</div>
				<div></div>
			</div> --%>
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
	<script src="js/bootstrap3-typeahead.js"></script>
	<script src="js/bootstrap-table.js"></script>
	<script src="js/bootstrap-table-print.js"></script>
	<script src="js/bootstrap-table-locale-all.min.js"></script>
	<script type="text/javascript" src="js/Chartbundle.js"></script>
	<script type="text/javascript" src="js/utils.js"></script>
	<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
	<script src="js/ie10-viewport-bug-workaround.js"></script>
	<!-- table export -->
	<script src="js/tableExport/tableExport.js"></script>
	<script src="js/table-export.js"></script>
	<script src="js/main.js"></script>
	<script src="js/bootstrap-switch.min.js"></script>
	<script type="text/javascript">
	var lang = navigator.language || navigator.userLanguage;
		var $table = $('#table'), $button = $('#btn_edit');
		
		//设置KPI
		function setKPI(familyID){
			$.ajax({
				type : "get",
				url : "GetKPIAction",
				data : {
					"familyID" : familyID,
				},
				success : function(data, status) {
					$('#target').html(data.target);
					$('#wip').html(data.wip);
					$('#finishGoods').html(data.finishGoods);
					$('#abnormal').html(data.abnormal);
					}
			});
		}
        // 开关
		 $('[name="status"]').bootstrapSwitch({    //初始化按钮
		       onText:"PTEQP",
		       offText:"LVD",
		       onColor:"success",
		       offColor:"success",
		       size:"noraml",
		       labelWidth:1,
		       handleWidth:30,
		       onSwitchChange:function(event,state){
		          if(state==true){
		        	  console.log("PTEQP");
		        	  setKPI(1);
		        	  tableConfig.url = url + "1";
					  $('#table').bootstrapTable('refresh',tableConfig);
		             }else{
		            	console.log("LVD");
		            	setKPI(2);
		            	tableConfig.url = url + "2";
		 				$('#table').bootstrapTable('refresh',tableConfig);
		             }
		         }
		    });
		
		//初始化子表格(无线循环)
	    InitSubTable1 = function (index, row, $detail) {
	        var parentid = row.MENU_ID;
	        var cur_table = $detail.html('<table id="cur_table"></table>').find('table');
	        $(cur_table).bootstrapTable({
	            url: '/Otracking/FindInterruptionAndRecoverByMOAction?mo_id='+row.mo_id,
	            method: 'get',
	            queryParams: { strParentID: parentid },
	            ajaxOptions: { strParentID: parentid },
	            clickToSelect: false,
	            detailView: false,//父子表
	            sortName : "Delivery_Time",
	            sortable : true, //是否启用排序
				sortOrder : "asc", //排序方式
	            uniqueId: "MENU_ID",
	            pageSize: 10,
	            pageList: [10, 25],
	            locale : lang,
	            columns: [ {
					field : 'id',
					align : 'center',
					valign : 'middle',
					title : '编号'
				}, {
					field : 'method_process',
					align : 'center',
					valign : 'middle',
					title : '工序'
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
	            //无线循环取子表，直到子表里面没有记录
	            onExpandRow: function (index, row, $Subdetail) {
	              oInit.InitSubTable1(index, row, $Subdetail);
	            }
	        });
	    };
		
		//初始化子表格(无线循环)
	    InitSubTable = function (index, row, $detail) {
	        var parentid = row.MENU_ID;
	        var mo_table = $detail.html('<table id="mo_table"></table>').find('table');
	        $(mo_table).bootstrapTable({
	            url: '/Otracking/GetMODetailStatus?batch_id='+row.batch_id,
	            method: 'get',
	            queryParams: { strParentID: parentid },
	            ajaxOptions: { strParentID: parentid },
	            clickToSelect: false,
	            detailView: true,//父子表
	            sortName : "Delivery_Time",
	            sortable : true, //是否启用排序
				sortOrder : "asc", //排序方式
	            uniqueId: "MENU_ID",
	            pageSize: 10,
	            pageList: [10, 25],
	            locale : lang,
	            columns: [ {
					field : 'id',
					title : '编号',
					align : 'center',
					valign : 'middle',
					width : '45px',
				}, {
					field : 'processline',
					title : '产线',
					editable : true,
					align : 'center',
					valign : 'middle',
				},{
					field : 'moname',
					title : 'MO',
					editable : true,
					align : 'center',
					valign : 'middle',
					width : '100px',
				},{
					field : 'dms_id',
					title : 'AOP',
					align : 'center',
					valign : 'middle',
					width : '115px',
				},{
					field : 'product_bigtype_name',
					title : '类型',
					align : 'center',
					valign : 'middle',
					width : '70px',
				}, {
					field : 'product_type_name',
					title : '型号',
					editable : true,
					align : 'center',
					valign : 'middle',
				}, {
					field : 'schedule_starttime',
					title : '计划时间',
					align : 'center',
					valign : 'middle',
				}, /* {
					field : 'schedule_endtime',
					title : '发货时间',
					align : 'center',
					valign : 'middle',
				}, */{
					field : 'actual_starttime',
					title : '实际上线',
					align : 'center',
					valign : 'middle',
				},{
					field : 'fat_datetime',
					title : 'FAT',
					align : 'center',
					valign : 'middle',
				}, {
					field : 'actual_endtime',
					title : '生产结束',
					align : 'center',
					valign : 'middle',
				},{
					field : 'quantity',
					title : '数量',
					align : 'center',
					valign : 'middle',
					width : '75px',
				}
				<s:if test="%{#session.staff.role_id==1}">
				,{
					field : 'cabling_sub_assembly',
					title : '配线预组',
					align : 'center',
					valign : 'middle',
					width : '80px',
				}
				</s:if>
				, {
					field : 'mechanical_sub_assembly',
					title : '柜体预组',
					align : 'center',
					valign : 'middle',
					width : '75px',
				}, {
					field : 'mechanical_assembly',
					title : '机械',
					editable : true,
					align : 'center',
					valign : 'middle',
					width : '65px',
				}, {
					field : 'cubicle_cabling',
					title : '配线',
					editable : true,
					align : 'center',
					valign : 'middle',
					width : '65px',
				}, {
					field : 'FQC',
					title : 'FQC',
					align : 'center',
					valign : 'middle',
					width : '65px',
				}, {
					field : 'finaly_assembly',
					title : '后段',
					align : 'center',
					valign : 'middle',
					width : '65px',
				},],
	            //无线循环取子表，直到子表里面没有记录
	            onExpandRow: function (index, row, $Subdetail) {
	              InitSubTable1(index, row, $Subdetail);
	            }
	        });
	    };
		
		$(function() {
			//1.初始化Table
			var oTable = new TableInit();
			oTable.Init();
		});
		var oTableInit;

		var tableConfig = {
			url : '/Otracking/GetBatchStatus?familyID=', //请求后台的URL（*）
			method : 'get', //请求方式（*）
			contentType : "application/x-www-form-urlencoded",//必须要有！！！！
			toolbar : '#toolbar', //工具按钮用哪个容器
			striped : true, //是否显示行间隔色
			cache : false, //是否使用缓存，默认为true，所以一般情况下需要设置一下这个属性（*）
			pagination : true, //是否显示分页（*）
			sortable : true, //是否启用排序
			sortOrder : "asc", //排序方式
			showPrint : true,
			//sortName : "DeliveryTime",
			//editable : true,
			//queryParams: oTableInit.queryParams,//传递参数（*）
			sidePagination : "client", //分页方式：client客户端分页，server服务端分页（*）
			pageNumber : 1, //初始化加载第一页，默认第一页
			pageSize : 50, //每页的记录行数（*）
			pageList : [ 50, 100 ], //可供选择的每页的行数（*）
			search : true, //是否显示表格搜索，此搜索是客户端搜索，不会进服务端，所以，个人感觉意义不大
			//strictSearch: true,
			//showColumns: true,                  //是否显示所有的列
			showRefresh : true, //是否显示刷新按钮
			//minimumCountColumns: 2,             //最少允许的列数
			clickToSelect : false, //是否启用点击选中行
			//height: 500,                        //行高，如果没有设置height属性，表格自动根据记录条数觉得表格高度
			uniqueId : "ID", //每一行的唯一标识，一般为主键列
			showToggle:false,                    //是否显示详细视图和列表视图的切换按钮
			cardView: false	,                    //是否显示详细视图
			detailView: true,                   //是否显示父子表+
			showFullscreen : false,
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
				width : '50px',
			},  {
				field : 'level',
				title : 'Level',
				editable : true,
				align : 'center',
				valign : 'middle',
				width : '60px',
			},{
				field : 'ordername',
				title : '项目名称',
				editable : true,
				align : 'left',
				halign : "center",
				valign : 'middle',
			}, /* {
				field : 'batchname',
				title : 'Batch',
				editable : true,
				align : 'center',
				valign : 'middle',
			}, */ {
				field : 'WBS',
				title : 'WBS',
				editable : true,
				align : 'center',
				valign : 'middle',
			}, {
				field : 'fatTime',
				title : 'FAT日期',
				align : 'center',
				valign : 'middle',
				width : '100px',
			},{
				field : 'DeliveryTime',
				title : '交货日期',
				editable : true,
				align : 'center',
				valign : 'middle',
					sortable : true,
					width : '100px',
			}, {
				field : 'quantity',
				title : '数量',
				editable : true,
				align : 'center',
				valign : 'middle',
				width : '50px',
			}, {
				field : 'releaseQuantity',
				title : '排产',
				editable : true,
				align : 'center',
				valign : 'middle',
				width : '50px',
			}, {
				field : 'finishGoodsQuantity',
				title : '挂单',
				editable : true,
				align : 'center',
				valign : 'middle',
				width : '50px',
			}, {
				field : 'packageQuantity',
				title : '包装',
				editable : true,
				align : 'center',
				valign : 'middle',
				width : '50px',
			}
			<s:if test="%{#session.staff.role_id==1}">
			,{
				field : 'cabling_sub_assembly',
				title : '配线预组',
				align : 'center',
				valign : 'middle',
				width : '80px',
			}
			</s:if>
			,{
				field : 'mechanical_sub_assembly',
				title : '柜体预组',
				align : 'center',
				valign : 'middle',
				width : '80px',
			},/*  {
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
			}, {
				field : 'comments',
				title : '备注',
				align : 'left',
				halign : "center",
				valign : 'middle',
				width : '100px',
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
			},
			 //注册加载子表的事件。注意下这里的三个参数！
            onExpandRow: function (index, row, $detail) {
                    InitSubTable(index, row, $detail);
                }
		};
		var TableInit = function() {
			var oTableInit = new Object();
			//初始化Table
			oTableInit.Init = function() {
				setKPI(1);
				url = "/Otracking/GetBatchStatus?familyID=";
				tableConfig.url = url + "1";
				$('#table').bootstrapTable(tableConfig);
			};
			return oTableInit;
		};
		window.onload = function() {
			Main.init();
			TableExport.init();
		}
	</script>
</body>
</html>