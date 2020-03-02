<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>学生信息</h1>
	<form action="Index" method="post">
		<table>
			<tr>
				<th>编号</th>
				<th>姓名</th>
				<th>性别</th>
				<th>年龄</th>
				<th>地址</th>
				<th>邮箱</th>
			</tr>
				<c:forEach items="${info }" var="in">
				<tr>
					<td>${in.getStuNo() }</td>
					<td>${in.getSname() }</td>
					<td>${in.getSgender() }</td>
					<td>${in.getSage() }</td>
					<td>${in.getSaddress() }</td>
					<td>${in.getSemail() }</td>
				</tr>
				</c:forEach>
		</table>
	</form>
</body>
</html>