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
					placeholder="请扫MO码...">
			</div>
			<div class="col-xs-12">
				<br>
			<input id=securityCode type="text" class="form-control"
					placeholder="请扫防伪码...">
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
		var modata = document.getElementById("codedata");
		var securityCode = document.getElementById("securityCode");
		var log = document.getElementById("log");
		var method_id = 0;
		function moGetFocus() {
			modata.focus();
			//document.activeElement.blur();
		}
		function securityCodeGetFocus() {
			securityCode.focus();
			//document.activeElement.blur();
		}
		window.onload = function() {
			log.innerText = "请扫描作业区域码...";
			log.disabled = true;
			modata.focus();
			//window.setInterval("getFocus()", 3000);
			modata.oninput = function() {
				securityCodeGetFocus()
			}
			
			securityCode.oninput = function() {
				if(modata.value == null || modata.value == "" || modata.value == undefined){
					setInputClear();
					modata.focus();
					log.innerText = new Date().toLocaleString().split(" ")[1]+":" + "MO码不能为空！" + '\n'
					+ log.value;
				}else if(securityCode.value == null || securityCode.value == "" || securityCode.value == undefined){
					setInputClear();
					modata.focus();
					log.innerText = new Date().toLocaleString().split(" ")[1]+":" + "防伪码不能为空！" + '\n'
					+ log.value;
				}else {
				sentSecurityCode(modata.value,securityCode.value.substr(46,12));
				setInputClear();
				modata.focus();
				}
			}
		}
		function setInputClear(){
			modata.value = null;
			securityCode.value = null;
		}
		// Fakenum = Mid(Text2.Text, 47, 12) substr(47,12)
		function sentSecurityCode(mo_name,securityCode){
			$
			.ajax({
				url : 'sentSecurityCode?mo_name='+mo_name+'&securityCode='+securityCode,
				type : 'GET',
				success : function(data) {
					if(data == 1){
						log.innerText = new Date().toLocaleString().split(" ")[1]+":" +mo_name + "录入防伪码" + securityCode + '\n'
						+ log.value;
					}else{
						log.innerText = new Date().toLocaleString().split(" ")[1]+":" + "MO不存在！" + '\n'
						+ log.value;
					}
				}
			});
			
		}
	</script>
</body>
</html>