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
    <!-- Placed at the end of the document so the pages load faster -->
	
	<script type="text/javascript">
	function utf16to8(str) {  
	    var out, i, len, c;  
	    out = "";  
	    len = str.length;  
	    for(i = 0; i < len; i++) {  
	    c = str.charCodeAt(i);  
	    if ((c >= 0x0001) && (c <= 0x007F)) {  
	        out += str.charAt(i);  
	    } else if (c > 0x07FF) {  
	        out += String.fromCharCode(0xE0 | ((c >> 12) & 0x0F));  
	        out += String.fromCharCode(0x80 | ((c >>  6) & 0x3F));  
	        out += String.fromCharCode(0x80 | ((c >>  0) & 0x3F));  
	    } else {  
	        out += String.fromCharCode(0xC0 | ((c >>  6) & 0x1F));  
	        out += String.fromCharCode(0x80 | ((c >>  0) & 0x3F));  
	    }  
	    }  
	    return out;  
	}
	</script>
</head>

<body>
	<%@include file="head.jsp"%>
	<div class="container-fluid mycontainer">
		<div class="row">
			<div class="col-xs-12">
				<div class="row">
					<h3>
						<span class="label label-success">二维码打印</span>
					</h3>
					<br>
					<s:iterator value="Method_Process"  var="Record">
					<div  class="col-xs-4">
					<div id="code${id}"></div>
					<h5>(${id})${processLine_name}-${name}</h5>
					</div>
					</s:iterator>
				</div>
			</div>
		</div>
	</div>
	<br>
	<%@include file="bottom.jsp"%>
	<script type="text/javascript" src="js/jquery-1.10.2.min.js"></script>
	<script type="text/javascript" src="js/jquery.qrcode.min.js"></script>
	<!-- Bootstrap core JavaScript
    ================================================== -->
	<script src="js/bootstrap.min.js"></script>
	<script src="js/bootstrap3-typeahead.js"></script>
	<script src="js/bootstrap-table.js"></script>
	<script src="js/bootstrap-table-locale-all.min.js"></script>
	<script type="text/javascript" src="js/Chartbundle.js"></script>
	<script type="text/javascript" src="js/utils.js"></script>
	<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
	<script src="js/ie10-viewport-bug-workaround.js"></script>
	
		<script type="text/javascript">
		<s:iterator value="Method_Process"  var="Record">
						jQuery('#code${id}').qrcode({
							render : "canvas", //也可以替换为table
							width : 140,
							height : 140,
							text : utf16to8("MethodProcess_id:${id}:${processLine_name}-${name}"),
							});
						</s:iterator>
					</script>
					
</body>
</html>