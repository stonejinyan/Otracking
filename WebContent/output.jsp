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
<meta http-equiv="refresh" content="36000">
<!-- Note there is no responsive meta tag here -->

<link rel="icon" href="image/favicon.ico">

<title>Output</title>

<!-- Bootstrap core CSS -->
<link href="css/bootstrap.min.css" rel="stylesheet">
<!-- Custom styles for this template -->
<link href="css/custom.css" rel="stylesheet">
<link href="css/login.css" rel="stylesheet">
<link href="css/home.css" rel="stylesheet">
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

h1
  {
  color:#3dcd58;
  font-family: ;
  }
 h2
  {
  color:#3dcd58;
  font-family: 'Microsoft YaHei';
  }
</style>
</head>

<body style="background-color: #e6eaf5">

<br> <br> <br> <br>
	<div class="container-fluid" style="background-image: url(image/building.jpg)">


<div class="row">
			<div class="col-xs-7">
		<img alt="" src="image/logo.png">
		</div>
		<div class="col-xs-5">
<br>
		<h2 id="timenow"></h2>
		</div>
		</div>
		<div class="row">
			<div class="col-xs-1 segreen"></div>
			<div class="col-xs-3 segreen">
				 <br> <br> <br>
				<h2>当年实际产出：</h2>
				<br><br>
				<h2>本周实际产出：</h2>
				<br> <br> <br> <br> <br> <br> <br>
				<br> <br> <br> <br> <br> <br>
			</div>
			<div class="col-xs-3">
				<br> <br> <br>  
				<h2 id="year">0台</h2>
				<br><br>
				<h2 id="day">0台</h2>
				<br> <br> <br> <br> <br>
			</div>
			<div class="col-xs-3 segreen">
				 <br> <br> <br> 
				<h2>当月实际产出：</h2>
				<br><br>
				<h2>历史接待访客：</h2>
				<br> <br> <br> <br> <br> <br> <br>
				<br> <br> <br> <br> <br> <br>
			</div>
			<div class="col-xs-2">
				<br> <br> <br> 
				<h2 id="month">0台</h2>
				<br><br>
				<h2 id="">9235人</h2>
				<br> <br> <br> <br> <br>
			</div>
			</div>
		<br>
		<div class="row">
			<div></div>
		</div>
	</div>
	<!-- Bootstrap core JavaScript
    ================================================== -->
	<!-- Placed at the end of the document so the pages load faster -->
	<script type="text/javascript" src="js/jquery-1.10.2.min.js"></script>
	<script>
		window.jQuery
				|| document.write('<script src="js/jquery.min.js"><\/script>')
	</script>
	<script src="js/bootstrap.min.js"></script>
	<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
	<script src="js/ie10-viewport-bug-workaround.js"></script>
	<script type="text/javascript" src="js/Chartbundle.js"></script>
	<script type="text/javascript" src="js/utils.js"></script>
	<script type="text/javascript">
	 $(document).ready(function(){
		    //循环执行，每隔1秒钟执行一次 1000 
		    var t1=window.setInterval(refreshCount, 10000);
		    function refreshCount() {
		    	$.ajax({
					url : '/Otracking/getOutputAction',
					type : 'GET',
					success : function(data) {
						obj = data;
						for (var i = 0; i < obj.length; i++) {
							if(obj[i].timetag=="月"){
								document.getElementById("month").innerHTML = obj[i].output_num+"台";
							}else if(obj[i].timetag=="日"){
								document.getElementById("day").innerHTML = obj[i].output_num+"台";
							}else if(obj[i].timetag=="年"){
								document.getElementById("year").innerHTML = obj[i].output_num+"台";
							}
							//alert(obj[i].timetag);
						}
					}
				});
		    }
setInterval(
									"timenow.innerHTML=new Date().toLocaleString()+' 星期'+'日一二三四五六'.charAt(new Date().getDay());",
									1000);
	 });
	</script>
</body>
</html>