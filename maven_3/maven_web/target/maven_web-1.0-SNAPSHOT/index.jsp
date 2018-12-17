<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/12/11
  Time: 15:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>cg</title>
</head>
<body>
<a href="account/findAll.do">访问查询账户</a>
<form action="account/deleteAccountById.do" method="post">
    注销用户id：<input type="text" name="id" /><br/>
    <input type="submit" value="提交" />
</form>

</form>
</body>
</html>
