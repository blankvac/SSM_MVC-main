<%@page isELIgnored="false" contentType="text/html; charset=utf-8" pageEncoding="UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>添加员工</title>
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
                添加员工信息
            </h1>
            <form action="${pageContext.request.contextPath}/emp/insert" method="post">
                <table cellpadding="0" cellspacing="0" border="0"
                       class="form_table">
                    <tr>
                        <td valign="middle" align="right">
                          姓名:
                        </td>
                        <td valign="middle" align="left">
                            <input type="text" class="inputgri" name="name"/>
                        </td>
                    </tr>
                    <tr>
                        <td valign="middle" align="right">
                            工资:
                        </td>
                        <td valign="middle" align="left">
                            <input type="text" class="inputgri" name="salary"/>
                        </td>
                    </tr>
                    <tr>
                        <td valign="middle" align="right">
                            年龄:
                        </td>
                        <td valign="middle" align="left">
                            <input type="text" class="inputgri" name="age"/>
                        </td>
                    </tr>
                </table>
                <p>
                    <input type="submit" class="button" value="添加员工"/>
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
