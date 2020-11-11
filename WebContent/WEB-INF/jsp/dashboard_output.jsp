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
<link href="css/bootstrap-datetimepicker.min.css" rel="stylesheet">
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
					<div class="row">
						<div class="col-xs-10" style="padding-left: 0px;">
							<h1 id="grunt" class="page-header">计划看板</h1>
						</div>
						<div class="col-xs-2" style="padding-left: 0px;">
							<div id="datetimePicker" style="padding-top: 60px;"
								class="controls input-append date form_dateplanning"
								data-date="" data-date-format="yyyy-mm"
								data-link-field="dtp_input2" data-link-format="yyyy-mm">
								<input id="pickDate" class="text-center" size="20" type="text"
									readonly> <span class="add-on"><i
									class="icon-remove"></i></span> <span class="add-on"><i
									class="icon-th"></i></span>
							</div>
						</div>
					</div>
					<div class="row">
							<div class="col-xs-6 hr" style="padding-left: 0px;">
								<div id="chart21" style="height: 300px"></div>
							</div>
							<div class="col-xs-6 hr" style="padding-left: 0px;">
								<div id="chart22" style="height: 300px"></div>
							</div>
						</div>
						<hr>
						<div class="row">
							<div class="col-xs-6 hr" style="padding-left: 0px;">
								<div id="chart23" style="height: 300px"></div>
							</div>
							<div class="col-xs-6 hr" style="padding-left: 0px;">
								<div id="chart24" style="height: 300px"></div>
							</div>
						</div>
					<div>
						<div class="row">
							<div class="col-xs-10" style="padding-left: 0px;">
								<h1 id="grunt" class="page-header">产出看板</h1>
							</div>
							<div class="col-xs-2" style="padding-left: 0px;">
								<div id="datetimePicker" style="padding-top: 60px;"
									class="controls input-append date form_date" data-date=""
									data-date-format="yyyy-mm" data-link-field="dtp_input2"
									data-link-format="yyyy-mm">
									<input id="pickDate" class="text-center" size="20" type="text"
										readonly> <span class="add-on"><i
										class="icon-remove"></i></span> <span class="add-on"><i
										class="icon-th"></i></span>
								</div>
							</div>
						</div>


						<div class="row">
							<div class="col-xs-6 hr" style="padding-left: 0px;">
								<div id="chart1" style="height: 300px"></div>
							</div>
							<div class="col-xs-6 hr" style="padding-left: 0px;">
								<div id="chart2" style="height: 300px"></div>
							</div>
						</div>
						<hr>
						<div class="row">
							<div class="col-xs-6 hr" style="padding-left: 0px;">
								<div id="chart17" style="height: 300px"></div>
							</div>
							<div class="col-xs-6 hr" style="padding-left: 0px;">
								<div id="chart18" style="height: 300px"></div>
							</div>
						</div>
						<hr>
						<div class="row">
							<div class="col-xs-6 hr" style="padding-left: 0px;">
								<div id="chart19" style="height: 300px"></div>
							</div>
							<div class="col-xs-6 hr" style="padding-left: 0px;">
								<div id="chart20" style="height: 300px"></div>
							</div>
						</div>
						<hr>
						<div class="row">
							<div class="col-xs-6 hr" style="padding-left: 0px;">
								<div id="chart3" style="height: 300px"></div>
							</div>
							<div class="col-xs-6 hr" style="padding-left: 0px;">
								<div id="chart4" style="height: 300px"></div>
							</div>
						</div>
						<hr>
						<div class="row">
							<div class="col-xs-6 hr" style="padding-left: 0px;">
								<div id="chart5" style="height: 300px"></div>
							</div>
							<div class="col-xs-6 hr" style="padding-left: 0px;">
								<div id="chart6" style="height: 300px"></div>
							</div>
						</div>
						<hr>
						<div class="row">
							<div class="col-xs-6 hr" style="padding-left: 0px;">
								<div id="chart7" style="height: 300px"></div>
							</div>
							<div class="col-xs-6 hr" style="padding-left: 0px;">
								<div id="chart8" style="height: 300px"></div>
							</div>
						</div>
						<hr>
						<div class="row">
							<div class="col-xs-6 hr" style="padding-left: 0px;">
								<div id="chart9" style="height: 300px"></div>
							</div>
							<div class="col-xs-6 hr" style="padding-left: 0px;">
								<div id="chart10" style="height: 300px"></div>
							</div>
						</div>
						<hr>
						<div class="row">
							<div class="col-xs-6 hr" style="padding-left: 0px;">
								<div id="chart11" style="height: 300px"></div>
							</div>
							<div class="col-xs-6 hr" style="padding-left: 0px;">
								<div id="chart12" style="height: 300px"></div>
							</div>
						</div>
						<hr>
						<div class="row">
							<div class="col-xs-6 hr" style="padding-left: 0px;">
								<div id="chart13" style="height: 300px"></div>
							</div>
							<div class="col-xs-6 hr" style="padding-left: 0px;">
								<div id="chart14" style="height: 300px"></div>
							</div>
						</div>
						<hr>
						<div class="row">
							<div class="col-xs-6 hr" style="padding-left: 0px;">
								<div id="chart15" style="height: 300px"></div>
							</div>
							<div class="col-xs-6 hr" style="padding-left: 0px;">
								<div id="chart16" style="height: 300px"></div>
							</div>
						</div>
						<hr>
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
					|| document
							.write('<script src="js/jquery.min.js"><\/script>')
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
		<!-- DatePick -->
		<script type="text/javascript"
			src="js/bootstrap-datetimepicker.js" charset="UTF-8"></script>
		<script type="text/javascript">
			var dom = document.getElementById("chart1");
			var myChart1 = echarts.init(dom, 'macarons');
			var dom = document.getElementById("chart2");
			var myChart2 = echarts.init(dom, 'macarons');
			var dom = document.getElementById("chart3");
			var myChart3 = echarts.init(dom, 'macarons');
			var dom = document.getElementById("chart4");
			var myChart4 = echarts.init(dom, 'macarons');
			var dom = document.getElementById("chart5");
			var myChart5 = echarts.init(dom, 'macarons');
			var dom = document.getElementById("chart6");
			var myChart6 = echarts.init(dom, 'macarons');
			var dom = document.getElementById("chart7");
			var myChart7 = echarts.init(dom, 'macarons');
			var dom = document.getElementById("chart8");
			var myChart8 = echarts.init(dom, 'macarons');
			var dom = document.getElementById("chart9");
			var myChart9 = echarts.init(dom, 'macarons');
			var dom = document.getElementById("chart10");
			var myChart10 = echarts.init(dom, 'macarons');
			var dom = document.getElementById("chart11");
			var myChart11 = echarts.init(dom, 'macarons');
			var dom = document.getElementById("chart12");
			var myChart12 = echarts.init(dom, 'macarons');
			var dom = document.getElementById("chart13");
			var myChart13 = echarts.init(dom, 'macarons');
			var dom = document.getElementById("chart14");
			var myChart14 = echarts.init(dom, 'macarons');
			var dom = document.getElementById("chart15");
			var myChart15 = echarts.init(dom, 'macarons');
			var dom = document.getElementById("chart16");
			var myChart16 = echarts.init(dom, 'macarons');
			var dom = document.getElementById("chart17");
			var myChart17 = echarts.init(dom, 'macarons');
			var dom = document.getElementById("chart18");
			var myChart18 = echarts.init(dom, 'macarons');
			var dom = document.getElementById("chart19");
			var myChart19 = echarts.init(dom, 'macarons');
			var dom = document.getElementById("chart20");
			var myChart20 = echarts.init(dom, 'macarons');
			var dom = document.getElementById("chart21");
			var myChart21 = echarts.init(dom, 'macarons');
			var dom = document.getElementById("chart22");
			var myChart22 = echarts.init(dom, 'macarons');
			var dom = document.getElementById("chart23");
			var myChart23 = echarts.init(dom, 'macarons');
			var dom = document.getElementById("chart24");
			var myChart24 = echarts.init(dom, 'macarons');
			var dateList = [];
			var valueList = [];
			var method_process_id = 11;
			var year = 2019;
			var month = 11;

			option = {
				title : {
					top : '10%',
					left : 'center',
					text : '后段产出'
				},
				tooltip : {
					trigger : 'axis'
				},
				xAxis : {
					type : 'category',
					data : [ 'Mon', 'Tue', 'Wed', 'Thu', 'Fri', 'Sat', 'Sun' ]
				},
				yAxis : {
					type : 'value'
				},
				series : [ {
					name : 'Quantity',
					data : [ 820, 932, 901, 934, 1290, 1330, 1320 ],
					type : 'line'
				} ]
			};

			function showEChart(year, month) {
				//后段
				myChart1.setOption(option);
				myChart1.showLoading();
				method_process_id = 67;

				$
						.ajax({
							url : '/Otracking/getOutputAction?flag=1&method_process_id='
									+ method_process_id
									+ '&year='
									+ year
									+ '&month=' + month,
							type : 'GET',
							success : function(Outputdata) {
								dateList = [];
								valueList = [];
								for (var i = 0; i < Outputdata.length; i++) {
									dateList.push(Outputdata[i].outputDate);
									valueList.push(Outputdata[i].quantity);
								}
								myChart1.setOption({ //加载数据图表 
									title : {
										text : '柜体后段产出'
									},
									xAxis : {
										data : dateList
									},
									series : [ {
										data : valueList,
										type : 'line'
									} ]
								});
							}
						});
				myChart1.hideLoading(); //隐藏加载动画
				//柜体FQC
				myChart2.setOption(option);
				myChart2.showLoading();
				method_process_id = 65;

				$
						.ajax({
							url : '/Otracking/getOutputAction?flag=1&method_process_id='
									+ method_process_id
									+ '&year='
									+ year
									+ '&month=' + month,
							type : 'GET',
							success : function(Outputdata) {
								dateList = [];
								valueList = [];
								for (var i = 0; i < Outputdata.length; i++) {
									dateList.push(Outputdata[i].outputDate);
									valueList.push(Outputdata[i].quantity);
								}
								myChart2.setOption({ //加载数据图表 
									title : {
										text : '柜体FQC产出'
									},
									xAxis : {
										data : dateList
									},
									series : [ {
										data : valueList,
										type : 'line'
									} ]
								});
							}
						});
				myChart2.hideLoading(); //隐藏加载动画
				//70产线
				myChart3.setOption(option);
				myChart3.showLoading();
				method_process_id = 5;
				$
						.ajax({
							url : '/Otracking/getOutputAction?flag=1&method_process_id='
									+ method_process_id
									+ '&year='
									+ year
									+ '&month=' + month,
							type : 'GET',
							success : function(Outputdata) {
								dateList = [];
								valueList = [];
								for (var i = 0; i < Outputdata.length; i++) {
									dateList.push(Outputdata[i].outputDate);
									valueList.push(Outputdata[i].quantity);
								}
								myChart3.setOption({ //加载数据图表 
									title : {
										text : '70产线'
									},
									xAxis : {
										data : dateList
									},
									series : [ {
										data : valueList,
										type : 'line'
									} ]
								});
							}
						});
				myChart3.hideLoading(); //隐藏加载动画
				//115产线
				myChart4.setOption(option);
				myChart4.showLoading();
				method_process_id = 24;
				$
						.ajax({
							url : '/Otracking/getOutputAction?flag=1&method_process_id='
									+ method_process_id
									+ '&year='
									+ year
									+ '&month=' + month,
							type : 'GET',
							success : function(Outputdata) {
								dateList = [];
								valueList = [];
								for (var i = 0; i < Outputdata.length; i++) {
									dateList.push(Outputdata[i].outputDate);
									valueList.push(Outputdata[i].quantity);
								}
								myChart4.setOption({ //加载数据图表 
									title : {
										text : '115产线'
									},
									xAxis : {
										data : dateList
									},
									series : [ {
										data : valueList,
										type : 'line'
									} ]
								});
							}
						});
				myChart4.hideLoading(); //隐藏加载动画

				//B柜产线
				myChart5.setOption(option);
				myChart5.showLoading();
				method_process_id = 33;
				$
						.ajax({
							url : '/Otracking/getOutputAction?flag=1&method_process_id='
									+ method_process_id
									+ '&year='
									+ year
									+ '&month=' + month,
							type : 'GET',
							success : function(Outputdata) {
								dateList = [];
								valueList = [];
								for (var i = 0; i < Outputdata.length; i++) {
									dateList.push(Outputdata[i].outputDate);
									valueList.push(Outputdata[i].quantity);
								}
								myChart5.setOption({ //加载数据图表 
									title : {
										text : 'B柜产线'
									},
									xAxis : {
										data : dateList
									},
									series : [ {
										data : valueList,
										type : 'line'
									} ]
								});
							}
						});
				myChart5.hideLoading(); //隐藏加载动画
				//核电产线
				myChart6.setOption(option);
				myChart6.showLoading();
				method_process_id = 42;
				$
						.ajax({
							url : '/Otracking/getOutputAction?flag=1&method_process_id='
									+ method_process_id
									+ '&year='
									+ year
									+ '&month=' + month,
							type : 'GET',
							success : function(Outputdata) {
								dateList = [];
								valueList = [];
								for (var i = 0; i < Outputdata.length; i++) {
									dateList.push(Outputdata[i].outputDate);
									valueList.push(Outputdata[i].quantity);
								}
								myChart6.setOption({ //加载数据图表 
									title : {
										text : '核电产线'
									},
									xAxis : {
										data : dateList
									},
									series : [ {
										data : valueList,
										type : 'line'
									} ]
								});
							}
						});
				myChart6.hideLoading(); //隐藏加载动画
				//非标产线
				myChart7.setOption(option);
				myChart7.showLoading();
				method_process_id = 51;
				$
						.ajax({
							url : '/Otracking/getOutputAction?flag=1&method_process_id='
									+ method_process_id
									+ '&year='
									+ year
									+ '&month=' + month,
							type : 'GET',
							success : function(Outputdata) {
								dateList = [];
								valueList = [];
								for (var i = 0; i < Outputdata.length; i++) {
									dateList.push(Outputdata[i].outputDate);
									valueList.push(Outputdata[i].quantity);
								}
								myChart7.setOption({ //加载数据图表 
									title : {
										text : '非标产线'
									},
									xAxis : {
										data : dateList
									},
									series : [ {
										data : valueList,
										type : 'line'
									} ]
								});
							}
						});
				myChart7.hideLoading(); //隐藏加载动画
				//PLC产线
				myChart8.setOption(option);
				myChart8.showLoading();
				method_process_id = 60;
				$
						.ajax({
							url : '/Otracking/getOutputAction?flag=1&method_process_id='
									+ method_process_id
									+ '&year='
									+ year
									+ '&month=' + month,
							type : 'GET',
							success : function(Outputdata) {
								dateList = [];
								valueList = [];
								for (var i = 0; i < Outputdata.length; i++) {
									dateList.push(Outputdata[i].outputDate);
									valueList.push(Outputdata[i].quantity);
								}
								myChart8.setOption({ //加载数据图表 
									title : {
										text : 'PLC产线'
									},
									xAxis : {
										data : dateList
									},
									series : [ {
										data : valueList,
										type : 'line'
									} ]
								});
							}
						});
				myChart8.hideLoading(); //隐藏加载动画
				//70柜体预组
				myChart9.setOption(option);
				myChart9.showLoading();
				method_process_id = 11;
				$
						.ajax({
							url : '/Otracking/getOutputAction?flag=1&method_process_id='
									+ method_process_id
									+ '&year='
									+ year
									+ '&month=' + month,
							type : 'GET',
							success : function(Outputdata) {
								dateList = [];
								valueList = [];
								for (var i = 0; i < Outputdata.length; i++) {
									dateList.push(Outputdata[i].outputDate);
									valueList.push(Outputdata[i].quantity);
								}
								myChart9.setOption({ //加载数据图表 
									title : {
										text : '70柜体预组'
									},
									xAxis : {
										data : dateList
									},
									series : [ {
										data : valueList,
										type : 'line'
									} ]
								});
							}
						});
				myChart9.hideLoading(); //隐藏加载动画
				//115柜体预组
				myChart10.setOption(option);
				myChart10.showLoading();
				method_process_id = 12;
				$
						.ajax({
							url : '/Otracking/getOutputAction?flag=1&method_process_id='
									+ method_process_id
									+ '&year='
									+ year
									+ '&month=' + month,
							type : 'GET',
							success : function(Outputdata) {
								dateList = [];
								valueList = [];
								for (var i = 0; i < Outputdata.length; i++) {
									dateList.push(Outputdata[i].outputDate);
									valueList.push(Outputdata[i].quantity);
								}
								myChart10.setOption({ //加载数据图表 
									title : {
										text : '115柜体预组'
									},
									xAxis : {
										data : dateList
									},
									series : [ {
										data : valueList,
										type : 'line'
									} ]
								});
							}
						});
				myChart10.hideLoading(); //隐藏加载动画
				//非标柜体预组
				myChart11.setOption(option);
				myChart11.showLoading();
				method_process_id = 13;
				$
						.ajax({
							url : '/Otracking/getOutputAction?flag=1&method_process_id='
									+ method_process_id
									+ '&year='
									+ year
									+ '&month=' + month,
							type : 'GET',
							success : function(Outputdata) {
								dateList = [];
								valueList = [];
								for (var i = 0; i < Outputdata.length; i++) {
									dateList.push(Outputdata[i].outputDate);
									valueList.push(Outputdata[i].quantity);
								}
								myChart11.setOption({ //加载数据图表 
									title : {
										text : '非标柜体预组'
									},
									xAxis : {
										data : dateList
									},
									series : [ {
										data : valueList,
										type : 'line'
									} ]
								});
							}
						});
				myChart11.hideLoading(); //隐藏加载动画

				//Frame
				myChart13.setOption(option);
				myChart13.showLoading();
				method_process_id = 15;
				$
						.ajax({
							url : '/Otracking/getOutputAction?flag=1&method_process_id='
									+ method_process_id
									+ '&year='
									+ year
									+ '&month=' + month,
							type : 'GET',
							success : function(Outputdata) {
								dateList = [];
								valueList = [];
								for (var i = 0; i < Outputdata.length; i++) {
									dateList.push(Outputdata[i].outputDate);
									valueList.push(Outputdata[i].quantity);
								}
								myChart13.setOption({ //加载数据图表 
									title : {
										text : 'Frame'
									},
									xAxis : {
										data : dateList
									},
									series : [ {
										data : valueList,
										type : 'line'
									} ]
								});
							}
						});
				myChart13.hideLoading(); //隐藏加载动画
				//JAW
				myChart14.setOption(option);
				myChart14.showLoading();
				method_process_id = 14;
				$
						.ajax({
							url : '/Otracking/getOutputAction?flag=1&method_process_id='
									+ method_process_id
									+ '&year='
									+ year
									+ '&month=' + month,
							type : 'GET',
							success : function(Outputdata) {
								dateList = [];
								valueList = [];
								for (var i = 0; i < Outputdata.length; i++) {
									dateList.push(Outputdata[i].outputDate);
									valueList.push(Outputdata[i].quantity);
								}
								myChart14.setOption({ //加载数据图表 
									title : {
										text : 'JAW'
									},
									xAxis : {
										data : dateList
									},
									series : [ {
										data : valueList,
										type : 'line'
									} ]
								});
							}
						});
				myChart14.hideLoading(); //隐藏加载动画
				//Polyfast
				myChart15.setOption(option);
				myChart15.showLoading();
				method_process_id = 16;
				$
						.ajax({
							url : '/Otracking/getOutputAction?flag=1&method_process_id='
									+ method_process_id
									+ '&year='
									+ year
									+ '&month=' + month,
							type : 'GET',
							success : function(Outputdata) {
								dateList = [];
								valueList = [];
								for (var i = 0; i < Outputdata.length; i++) {
									dateList.push(Outputdata[i].outputDate);
									valueList.push(Outputdata[i].quantity);
								}
								myChart15.setOption({ //加载数据图表 
									title : {
										text : 'Polyfast'
									},
									xAxis : {
										data : dateList
									},
									series : [ {
										data : valueList,
										type : 'line'
									} ]
								});
							}
						});
				myChart15.hideLoading(); //隐藏加载动画

				//柜体主线
				myChart17.setOption(option);
				myChart17.showLoading();
				method_process_type_id = 5;
				$
						.ajax({
							url : '/Otracking/getOutputAction?flag=2&method_process_type_id='
									+ method_process_type_id
									+ '&year='
									+ year
									+ '&month=' + month,
							type : 'GET',
							success : function(Outputdata) {
								dateList = [];
								valueList = [];
								for (var i = 0; i < Outputdata.length; i++) {
									dateList.push(Outputdata[i].outputDate);
									valueList.push(Outputdata[i].quantity);
								}
								myChart17.setOption({ //加载数据图表 
									title : {
										text : '柜体主线'
									},
									xAxis : {
										data : dateList
									},
									series : [ {
										data : valueList,
										type : 'line'
									} ]
								});
							}
						});
				myChart17.hideLoading(); //隐藏加载动画
				//柜体预组
				myChart18.setOption(option);
				myChart18.showLoading();
				method_process_type_id = 1;
				$
						.ajax({
							url : '/Otracking/getOutputAction?flag=2&method_process_type_id='
									+ method_process_type_id
									+ '&year='
									+ year
									+ '&month=' + month,
							type : 'GET',
							success : function(Outputdata) {
								dateList = [];
								valueList = [];
								for (var i = 0; i < Outputdata.length; i++) {
									dateList.push(Outputdata[i].outputDate);
									valueList.push(Outputdata[i].quantity);
								}
								myChart18.setOption({ //加载数据图表 
									title : {
										text : '柜体预组'
									},
									xAxis : {
										data : dateList
									},
									series : [ {
										data : valueList,
										type : 'line'
									} ]
								});
							}
						});
				myChart18.hideLoading(); //隐藏加载动画
				//端子排预组
				myChart19.setOption(option);
				myChart19.showLoading();
				method_process_id = 19;
				$
						.ajax({
							url : '/Otracking/getOutputAction?flag=1&method_process_id='
									+ method_process_id
									+ '&year='
									+ year
									+ '&month=' + month,
							type : 'GET',
							success : function(Outputdata) {
								dateList = [];
								valueList = [];
								for (var i = 0; i < Outputdata.length; i++) {
									dateList.push(Outputdata[i].outputDate);
									valueList.push(Outputdata[i].quantity);
								}
								myChart19.setOption({ //加载数据图表 
									title : {
										text : '端子排预组'
									},
									xAxis : {
										data : dateList
									},
									series : [ {
										data : valueList,
										type : 'line'
									} ]
								});
							}
						});
				myChart19.hideLoading(); //隐藏加载动画
			}
			function showEChartPlanning(year, month) {
				//PTEQP计划
				myChart21.setOption(option);
				myChart21.showLoading();
				$
						.ajax({
							url : '/Otracking/GetPlanningAction?classify=PTEQP'
									+ '&year='
									+ year
									+ '&month=' + month,
							type : 'GET',
							success : function(Outputdata) {
								dateList = [];
								valueList = [];
								for (var i = 0; i < Outputdata.length; i++) {
									dateList.push(Outputdata[i].outputDate);
									valueList.push(Outputdata[i].quantity);
								}
								myChart21.setOption({ //加载数据图表 
									title : {
										text : '柜体计划'
									},
									xAxis : {
										data : dateList
									},
									series : [ {
										data : valueList,
										type : 'line'
									} ]
								});
							}
						});
				myChart21.hideLoading(); //隐藏加载动画
				//JAW计划
				myChart22.setOption(option);
				myChart22.showLoading();
				$
						.ajax({
							url : '/Otracking/GetPlanningAction?classify=JAW'
									+ '&year='
									+ year
									+ '&month=' + month,
							type : 'GET',
							success : function(Outputdata) {
								dateList = [];
								valueList = [];
								for (var i = 0; i < Outputdata.length; i++) {
									dateList.push(Outputdata[i].outputDate);
									valueList.push(Outputdata[i].quantity);
								}
								myChart22.setOption({ //加载数据图表 
									title : {
										text : 'Jaw计划'
									},
									xAxis : {
										data : dateList
									},
									series : [ {
										data : valueList,
										type : 'line'
									} ]
								});
							}
						});
				myChart22.hideLoading(); //隐藏加载动画
				//Frame计划
				myChart23.setOption(option);
				myChart23.showLoading();
				$
						.ajax({
							url : '/Otracking/GetPlanningAction?classify=Frame'
									+ '&year='
									+ year
									+ '&month=' + month,
							type : 'GET',
							success : function(Outputdata) {
								dateList = [];
								valueList = [];
								for (var i = 0; i < Outputdata.length; i++) {
									dateList.push(Outputdata[i].outputDate);
									valueList.push(Outputdata[i].quantity);
								}
								myChart23.setOption({ //加载数据图表 
									title : {
										text : 'Frame计划'
									},
									xAxis : {
										data : dateList
									},
									series : [ {
										data : valueList,
										type : 'line'
									} ]
								});
							}
						});
				myChart23.hideLoading(); //隐藏加载动画
				//Polyfast计划
				myChart24.setOption(option);
				myChart24.showLoading();
				$
						.ajax({
							url : '/Otracking/GetPlanningAction?classify=Polyfast'
									+ '&year='
									+ year
									+ '&month=' + month,
							type : 'GET',
							success : function(Outputdata) {
								dateList = [];
								valueList = [];
								for (var i = 0; i < Outputdata.length; i++) {
									dateList.push(Outputdata[i].outputDate);
									valueList.push(Outputdata[i].quantity);
								}
								myChart24.setOption({ //加载数据图表 
									title : {
										text : 'Polyfast计划'
									},
									xAxis : {
										data : dateList
									},
									series : [ {
										data : valueList,
										type : 'line'
									} ]
								});
							}
						});
				myChart24.hideLoading(); //隐藏加载动画
			}

			$('.form_date').datetimepicker({
				format : 'yyyy-mm',
				autoclose : true,
				todayBtn : true,
				startView : 'year',
				minView : 'year',
				maxView : 'decade',//Number, String. 默认值：4, ‘decade’，日期时间选择器最高能展示的选择范围视图
			});
			$('.form_date').data("datetimepicker").setDate(new Date());
			$('.form_dateplanning').datetimepicker({
				format : 'yyyy-mm',
				autoclose : true,
				todayBtn : true,
				startView : 'year',
				minView : 'year',
				maxView : 'decade',//Number, String. 默认值：4, ‘decade’，日期时间选择器最高能展示的选择范围视图
			});
			$('.form_dateplanning').data("datetimepicker").setDate(new Date());
			function getMonth(month) {
				switch (month) {
				case 0:
					return '01';
					break;
				case 1:
					return '02';
					break;
				case 2:
					return '03';
					break;
				case 3:
					return '04';
					break;
				case 4:
					return '05';
					break;
				case 5:
					return '06';
					break;
				case 6:
					return '07';
					break;
				case 7:
					return '08';
					break;
				case 8:
					return '09';
					break;
				case 9:
					return '10';
					break;
				case 10:
					return '11';
					break;
				case 11:
					return '12';
					break;
				}
			}
			window.onload = function() {

				showEChart(new Date().getFullYear(), getMonth(new Date()
						.getMonth()));
				$('.form_date').change(
						function() {
							var date = $('.form_date').data("datetimepicker")
									.getDate();
							showEChart(date.getFullYear(), getMonth(date
									.getMonth()));
						});
				showEChartPlanning(new Date().getFullYear(), getMonth(new Date()
				.getMonth()));
				$('.form_dateplanning').change(
						function() {
							var date = $('.form_dateplanning').data(
									"datetimepicker").getDate();
							showEChartPlanning(date.getFullYear(),
									getMonth(date.getMonth()));
						});
			}
		</script>
</body>
</html>