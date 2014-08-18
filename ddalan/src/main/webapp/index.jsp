<%@ page language="java" contentType="text/html; charset=EUC-KR"  pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
	<title>Ddalan Home</title>
	
	<script src="/js/jquery-1.11.1.min.js" type="text/javascript"></script>
	<script src="/js/index.js" type="text/javascript"></script>
	<link rel="stylesheet" href="/css/common.css" type="text/css">
	
	<link rel="stylesheet" href="http://code.jquery.com/mobile/1.4.3/jquery.mobile-1.4.3.min.css" />
    <script src="http://code.jquery.com/mobile/1.4.3/jquery.mobile-1.4.3.min.js"></script>
	
	<script type="text/javascript">
	</script>
	
</head>
<body >
   	<div class="logo">
	   	<h1>
	   		<img id="logo1" src="/images/logos.gif" alt="Logo1" class="none" >
	   		<img id="logo2" src="/images/logos.gif" alt="Logo2" class="none">
	   		<img id="logo3" src="/images/logos.gif" alt="Logo3" class="none">
	   		<img id="logo4" src="/images/logos.gif" alt="Logo4" class="none">
	   		<img id="logo5" src="/images/logos.gif" alt="Logo5" class="none">
   		</h1>
	   	<p>
	   		<img id="info1" src="/images/info1.png" alt="Info1" class="none">
	   		<img id="info2" src="/images/info2.png" alt="Info2" class="none">
	   		<img id="info3" src="/images/info3.png" alt="Info3" class="none" >
	   		<img id="info4" src="/images/info4.png" alt="Info4" class="none" >
	   		<img id="info5" src="/images/info5.png" alt="Info5" class="none" >
	   	</p>
	   	<div class="status">
	   		<img id="status1" src="/images/status1.png" alt="Status1" class="none">
	   		<img id="status2" src="/images/status2.png" alt="Status2" class="none">
	   		<img id="status3" src="/images/status3.png" alt="Status3" class="none">
	   		<img id="status4" src="/images/status4.png" alt="Status4" class="none">
	   		<img id="status5" src="/images/status5.png" alt="Status5" class="none">
	   	</div>
	  
	   <div class="btn_area"> 
	   		<div data-role="fieldcontain">
	   			<input type="tel"   id="phonenumber" value=""/>
	   		</div> 
	   </div>
	   <div class="ui-grid-a">
	 		<div class="ui-block-a"><img src="/images/join_info.png"></div>
	   		<div class="ui-block-b"><input type ="submit" onclick="jsMoveUrl('app://application')"value="확인"> </div>
	   </div>	 
 </div>  	
</body>
</html>