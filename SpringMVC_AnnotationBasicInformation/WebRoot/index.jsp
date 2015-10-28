<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'index.jsp' starting page</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
</head>

<body>
	<h1>请输入信息</h1>
	<form action="<%=basePath%>courses/save" method="post">
		课程名字：<input name="cname" type="text"><br/><br/>
		课程老师：<input name="cteacher" type="text"><br/><br/> 
		<input type="submit"><br/><br/> 

	</form>
	
	<h2>请选择文件</h2>
	<form action="<%=basePath%>courses/doUpload" method="post" enctype="multipart/form-data">
		<input type="file" name="file"><br/><br/>
		<input type="submit">

	</form>
</body>
</html>
