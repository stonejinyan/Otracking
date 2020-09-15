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
<link href="css/home.css" rel="stylesheet">
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
</head>

<body onload="editable()">
	<%@include file="head.jsp"%>
	<div class="container-fluid mycontainer">
		<h3>
			<span class="label label-success">耗材信息</span>
		</h3>
		<div class="col-xs-12">
			<div class="panel-body" style="padding-bottom: 0px;">
				<%-- <div id="toolbar" class="btn-group">
					<button id="btn_add" type="button" class="btn btn-default"
						data-toggle="modal" data-target="#exampleModal"
						data-whatever="@mdo">
						<span class="glyphicon glyphicon-plus" aria-hidden="true"></span>新增
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
									<h4 class="modal-title" id="exampleModalLabel">产线新增</h4>
								</div>
								<form action="ProcessLineSave" method="post">
									<div class="modal-body">
										<div class="form-group">
											<label for="recipient-name" class="control-label">请输入新增产线名称</label>
											<input type="text" class="form-control" id="recipient-name"
												name="name">
										</div>
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
					<button id="btn_edit" type="button" class="btn btn-default">
						<span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>修改
					</button>
					<button id="btn_delete" type="button" class="btn btn-default">
						<span class="glyphicon glyphicon-remove" aria-hidden="true"></span>删除
					</button>
				</div> --%>
				<table id="table">
				</table>
			</div>
		</div>
	</div>
	<div class="modal fade" id="exampleModal" tabindex="-1" role="dialog"
		aria-labelledby="exampleModalLabel">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title" id="exampleModalLabel">上传物料图片</h4>
				</div>
				<form action="SaveBulkFile" method="post" enctype="multipart/form-data">
					<div class="modal-body">
						<div class="form-group">
							<input type="hidden" class="form-control" id="recipient-name"
								name="id">
						</div>
						<div class="form-group">
							<input type="file" name="uploadfile">
						</div>
					</div>
					<div class="modal-footer">
						<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
						<button type="submit" class="btn btn-primary" on>保存</button>
					</div>
				</form>
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
	<script src="js/bootstrap-editable.js"></script>
	<script src="js/bootstrap-table.js"></script>
	<script src="js/bootstrap-table-locale-all.min.js"></script>
	<script src="js/bootstrap-table-editable.js"></script>
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
		//初始化子表格(无线循环)
	    InitSubTable = function (index, row, $detail) {
	        var parentid = row.MENU_ID;
	        var cur_table = $detail.html('<table id="cur_table"></table>').find('table');
	        $(cur_table).bootstrapTable({
	            url: '/Otracking/GetEdit_Bulk_Log_TableByBulk_IDAction?bulk_id='+row.id,
	            method: 'get',
	            queryParams: { strParentID: parentid },
	            ajaxOptions: { strParentID: parentid },
	            clickToSelect: false,
	            detailView: false,//父子表
	            sortName : "Delivery_Time",
	            sortable : true, //是否启用排序
				sortOrder : "desc", //排序方式
	            uniqueId: "id",
	            pageSize: 10,
	            pageList: [10, 25],
	            locale : lang,
	            columns: [ {
					field : 'id',
					align : 'center',
					valign : 'middle',
					title : '编号'
				},{
					field : 'field_name',
					align : 'center',
					valign : 'middle',
					title : '字段'
				}, {
					field : 'new_value',
					align : 'center',
					valign : 'middle',
					title : '数值'
				}, {
					field : 'created_time',
					align : 'center',
					valign : 'middle',
					title : '时间戳'
				}, {
					field : 'staff_name',
					align : 'center',
					valign : 'middle',
					title : '员工'
				}, ],
	            //无线循环取子表，直到子表里面没有记录
	            onExpandRow: function (index, row, $Subdetail) {
	              oInit.InitSubTable1(index, row, $Subdetail);
	            }
	        });
	    };
		var oTableInit;
		window.operateEvents = {
			'click .Start' : function(e, value, row, index) {
				$.ajax({
					url : '/Otracking/PullMaterialAction?id=' + row.id,
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
		function operateFormatter(value, row, index) {
			return [
					'<button id="btn_add" type="button" class="btn btn-default" data-toggle="modal" data-target="#exampleModal" data-whatever="'+row.id+'">上传照片 </button>', ]
					.join('');
		}
		var tableConfig = {
			url : '/Otracking/GetBulkAction', //请求后台的URL（*）
			method : 'get', //请求方式（*）
			toolbar : '#toolbar', //工具按钮用哪个容器
			striped : true, //是否显示行间隔色
			cache : false, //是否使用缓存，默认为true，所以一般情况下需要设置一下这个属性（*）
			pagination : true, //是否显示分页（*）
			sortable : true, //是否启用排序
			sortOrder : "asc", //排序方式
			//editable : true,
			//queryParams: oTableInit.queryParams,//传递参数（*）
			sidePagination : "server", //分页方式：client客户端分页，server服务端分页（*）
			//pageNumber:1,                       //初始化加载第一页，默认第一页
			//pageSize: 10,                       //每页的记录行数（*）
			//pageList: [10, 25, 50, 100],        //可供选择的每页的行数（*）
			search : true, //是否显示表格搜索，此搜索是客户端搜索，不会进服务端，所以，个人感觉意义不大
			//strictSearch: true,
			//showColumns: true,                  //是否显示所有的列
			showRefresh : true, //是否显示刷新按钮
			//minimumCountColumns: 2,             //最少允许的列数
			clickToSelect : true, //是否启用点击选中行
			//height: 500,                        //行高，如果没有设置height属性，表格自动根据记录条数觉得表格高度
			uniqueId : "ID", //每一行的唯一标识，一般为主键列
			//showToggle:true,                    //是否显示详细视图和列表视图的切换按钮
			//cardView: false,                    //是否显示详细视图
			detailView: true,                   //是否显示父子表
			locale : lang,
			columns : [ {
				field : 'id',
				title : '编号',
				align : 'center',
				valign : 'middle',
				width : '50px',
			//editable: true
			}, {
				field : 'image',
				title : '图片',
				align : 'center',
				valign : 'middle',
			}, {
				field : 'name',
				title : '名称',
				align : 'center',
				valign : 'middle',
			}, {
				field : 'description_zh',
				title : '中文描述',
				align : 'center',
				valign : 'middle',
				editable : true
			}, {
				field : 'description_en',
				title : '英文描述',
				align : 'center',
				valign : 'middle',
				editable : true
			}, {
				field : 'price',
				title : '价格',
				align : 'center',
				valign : 'middle',
			}, {
				field : 'mpq',
				title : '最小包装量',
				align : 'center',
				valign : 'middle',
				editable : true
			}, {
				field : 'smallest_unit',
				title : '最小单位',
				align : 'center',
				valign : 'middle',
				editable : true
			}, {
				field : 'smallest_unit_quantity',
				title : '代表数量',
				align : 'center',
				valign : 'middle',
				editable : true
			}, {
				field : 'delivery_unit',
				title : '送货单位',
				align : 'center',
				valign : 'middle',
				editable : true
			}, {
				field : 'delivery_quantity',
				title : '代表数量',
				align : 'center',
				valign : 'middle',
				editable : true
			}, {
				field : 'flag',
				title : '操作 ',
				align : 'center',
				valign : 'middle',
				events : operateEvents,
				formatter : operateFormatter
			} ],
			onEditableSave : function(field, row, oldValue, $el) {
				$.ajax({
					type : "post",
					url : "EditBulkAction",
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
		$('#exampleModal').on('show.bs.modal', function(event) {
			var button = $(event.relatedTarget) // Button that triggered the modal
			var recipient = button.data('whatever') // Extract info from data-* attributes
			// If necessary, you could initiate an AJAX request here (and then do the updating in a callback).
			// Update the modal's content. We'll use jQuery here, but you could use a data binding library or other methods instead.
			var modal = $(this)
			modal.find('.modal-title').text('请上传图片')
			modal.find('.modal-body input').val(recipient)
		})
	</script>
</body>
</html>