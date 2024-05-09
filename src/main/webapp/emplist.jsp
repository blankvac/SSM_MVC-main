<%@page isELIgnored="false" contentType="text/html; charset=utf-8" pageEncoding="UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
	<title>展示员工信息</title>
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css"/>
</head>
<body>
<div id="wrap">
	<div id="top_content">
		<div id="header">
			<div id="rightheader">
				<p>
					<jsp:useBean id="now" class="java.util.Date" scope="page"/>
					<fmt:formatDate value="${now}" pattern="yyyy年MM月dd日"/>
					<br/>
					<a href="${pageContext.request.contextPath}/admin/destroy"> 安全退出</a>
				</p>
			</div>
					<div id="topheader">
						<h1 id="title">
							<a href="#">SSM实战项目：人事管理系统</a>
						</h1>
					</div>
					<div id="navigation">
					</div>
				</div>
				<div id="content">
					<p id="whereami">
					</p>
					<h1>
						欢迎${sessionScope.admin.username}来到人事管理系统
					</h1>
					<table class="table">
						<tr class="table_header">
							<td>
								ID
							</td>
							<td>
								姓名
							</td>
							<td>
								工资
							</td>
							<td>
							年龄
							</td>
							<td>
								操作
							</td>
						</tr>
						<c:forEach items="${requestScope.emps}" var="emp" varStatus="e">
						<tr class="row1">
							<td>
								${e.count}
							</td>
							<td>
								${emp.name}
							</td>
							<td>
								${emp.salary}
							</td>
							<td>
								${emp.age}
							</td>
							<td>
								<a href="${pageContext.request.contextPath}/emp/delete?id=${emp.id}">删除员工</a>&nbsp;<a href="${pageContext.request.contextPath}/emp/select?id=${emp.id}">修改员工信息</a>
							</td>
						</tr>
						</c:forEach>
					</table>
					<p>
						<input type="button" class="button" value="添加员工" onclick="location='${pageContext.request.contextPath}/addEmp.jsp'"/>
					</p>
				</div>
			</div>
			<div id="footer">
				<div id="footer_bg">

				</div>
			</div>
		</div>
	</body>
</html>
