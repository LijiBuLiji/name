<%--
  Created by IntelliJ IDEA.
  User: liujixiang
  Date: 2022/5/4
  Time: 10:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="d" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
${studentList}
<d:forEach var="temp" items="${list}">
    ${temp.name}+<br/>
</d:forEach>
</body>
</html>
