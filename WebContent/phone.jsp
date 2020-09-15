<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
<link rel="icon" href="image/favicon.ico">

<title>Otracking</title>

<!-- Bootstrap -->
<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/custom.css" rel="stylesheet">
<!-- HTML5 shim 和 Respond.js 是为了让 IE8 支持 HTML5 元素和媒体查询（media queries）功能 -->
<!-- 警告：通过 file:// 协议（就是直接将 html 页面拖拽到浏览器中）访问页面时 Respond.js 不起作用 -->
<!--[if lt IE 9]>
      <script src="https://cdn.jsdelivr.net/npm/html5shiv@3.7.3/dist/html5shiv.min.js"></script>
      <script src="https://cdn.jsdelivr.net/npm/respond.js@1.4.2/dest/respond.min.js"></script>
    <![endif]-->
</head>
<body>
	<div class="col-xs-7">
		<img class="logo img-responsive" alt="logo" src="image/logo.png">
	</div>
	<div class="col-xs-5">
		<h4 class="display-5  title hmargin">
			Order Tracking<br>扫码系统
		</h4>
	</div>
	<div class="container-fluid">
		<div class="row">
			<br>
			<div class="col-xs-12">
				<br> <input id="codedata" type="text" class="form-control"
					placeholder="请扫码...">
			</div>
			<div class="col-xs-12">
				<br>
			<h4 class="display-5  title hmargin">当前作业区域：</h4>
				<p id="methodname" class="form-control-static bg-danger"></p>
			</div>
			<div class="col-xs-12">
				<br>
			<h4 class="display-5  title hmargin">日志：</h4>
				<textarea id="log" readonly="" class="form-control" rows="12"></textarea>
			</div>
		</div>
	</div>
	<%@include file="WEB-INF/jsp/PhoneBottom.jsp"%>
	<!-- jQuery (Bootstrap 的所有 JavaScript 插件都依赖 jQuery，所以必须放在前边) -->
	<script>
		window.jQuery
				|| document
						.write('<script src="js/jquery-1.10.2.min.js"><\/script>')
	</script>
	<script type="text/javascript" src="js/jquery-1.10.2.min.js"></script>
	<!-- 加载 Bootstrap 的所有 JavaScript 插件。你也可以根据需要只加载单个插件。 -->
	<script src="js/bootstrap.min.js"></script>
	<script type="text/javascript">
		var codedata = document.getElementById("codedata");
		var methodname = document.getElementById("methodname");
		var log = document.getElementById("log");
		var method_id = 0;
		function getFocus() {
			codedata.focus();
			//document.activeElement.blur();
		}
		window.onload = function() {
			log.innerText = "请扫描作业区域码...";
			log.disabled = true;
			codedata.focus();
			//window.setInterval("getFocus()", 3000);
			codedata.oninput = function() {
				code = codedata.value;
				if (code.indexOf("MethodProcess_id:") == 0) {
					var areaname = code.split(":")[2];
					log.innerText = new Date().toLocaleString().split(" ")[1] +":当前作业区域：" + areaname + '\n' + log.value;
					method_id = code.split(":")[1];
					methodname.innerText = areaname + " ID:"
							+ method_id;
				} else {
					if (method_id > 0) {
						$
								.ajax({
									url : '/Otracking/PhoneRequest?mo_name='
											+ code + '&method_process_id='
											+ method_id,
									type : 'GET',
									success : function(data) {
										production_status = data.flag;
										if (production_status == 1) {
											start(data.id);
										} else if (production_status == 2) {
											finish(data.id);
										} else if (production_status == 3) {
											log.innerText = new Date().toLocaleString().split(" ")[1] +":"+code+"中断中，请恢复生产" + '\n'
													+ log.value;
										} else if (production_status == 4) {
											log.innerText = new Date().toLocaleString().split(" ")[1] +":"+code+"生产已结束" + '\n'
													+ log.value;
										} else if (production_status == 5) {
											log.innerText = new Date().toLocaleString().split(" ")[1] +":"+code+"未达开工条件" + '\n'
													+ log.value;
										} else if (production_status == 0) {
											log.innerText = new Date().toLocaleString().split(" ")[1] +":"+code+"无此生产计划，请检查！"
													+ '\n' + log.value;
										}
									}
								});
					} else {
						log.innerText = new Date().toLocaleString().split(" ")[1] +":当前作业区域为空，请扫描作业区域！" + '\n' + log.value;
					}
				}
				;
				codedata.value = null;
				//log.innerText = new Date().toLocaleString() + log.value;
			}
		}
		function start(id) {
			$
					.ajax({
						url : 'Start?id='+id,
						type : 'GET',
						success : function(data) {
							log.innerText = new Date().toLocaleString().split(" ")[1]+":" +code + "开始生产！" + '\n'
									+ log.value;
						}
					});
		}
		function finish(id) {
			$.ajax({
				url : 'GetOTR?id='+id,
				type : 'GET',
				success : function(data) {
					//alert(data);
					if(data>5){
					$
					.ajax({
						url : 'End?id='+id,
						type : 'GET',
						success : function(data) {
							log.innerText = new Date().toLocaleString().split(" ")[1]+":" +code + "结束生产！" + '\n'
									+ log.value;
						}
					});
				}else{
					log.innerText = new Date().toLocaleString().split(" ")[1]+":" +code + ":5分钟内不可结束生产！" + '\n'
					+ log.value;
				}
				}
			});
			
		}
	</script>
</body>
</html>