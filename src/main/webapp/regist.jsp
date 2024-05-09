<%@page isELIgnored="false" contentType="text/html; charset=utf-8" pageEncoding="UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
	<title>注册页面</title>
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
						注册
					</h1>
					<form action="${pageContext.request.contextPath}/admin/register" method="post">
						<table cellpadding="0" cellspacing="0" border="0"
							class="form_table">
							<tr>
								<td valign="middle" align="right">
									用户名:
								</td>
								<td valign="middle" align="left">
									<input type="text" class="inputgri" name="name" />
								</td>
							</tr>
							<tr>
								<td valign="middle" align="right">
									真实姓名:
								</td>
								<td valign="middle" align="left">
									<input type="text" class="inputgri" name="username" />
								</td>
							</tr>
							<tr>
								<td valign="middle" align="right">
									密码:
								</td>
								<td valign="middle" align="left">
									<input type="password" class="inputgri" name="password" />
								</td>
							</tr>
							<tr>
								<td valign="middle" align="right">
									性别:
								</td>
								<td valign="middle" align="left">
									男
									<input type="radio" class="inputgri" name="sex" value="false" checked="checked"/>
									女
									<input type="radio" class="inputgri" name="sex" value="true"/>
								</td>
							</tr>
						</table>
						<p>
							<input type="submit" class="button" value="注册 &raquo;" />
						</p>
					</form>
				</div>
			</div>
			<div id="footer">
				<div id="footer_bg">

				</div>
			</div>
		</div>
	</body>
</html>
