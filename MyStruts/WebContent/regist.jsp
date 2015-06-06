<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>

</head>
<body>
	<form action="regist" method="post" enctype="multipart/form-data">
		登录名：<input type="text" name="u.loginname" /><br/>
		
		密&nbsp;&nbsp;码：<input type="password" name="u.password"/><br/>
		
		性&nbsp;&nbsp;别：<input type="radio" value="true" checked=true name="u.sex">男</input>
		<input type="radio" value="false" name="u.sex">女</input><br/>
		工&nbsp;&nbsp;资：<input type="text" name="u.salary"/><br/>
		
		爱 &nbsp;&nbsp;好：<input type="checkbox" name="u.fav" value="basket">篮球</input>
		<input type="checkbox" name="u.fav" value="foot">足球</input>
		<input type="checkbox" name="u.fav" value="tennis">网球</input><br/>
		<s:fielderror name="u.loginname"></s:fielderror><br/>
		<input type="submit" value="提交" >
	</form>

</body>
</html>