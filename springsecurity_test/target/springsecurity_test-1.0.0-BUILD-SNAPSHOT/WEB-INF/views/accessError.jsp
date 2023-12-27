<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--<%@ taglib uri:="http://www.springframework.org/securiry/tags" prefix="sec" %>--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Access deinied</title>
</head>
<body>
    <h1>Access Deinied Page</h1>
<%--    <h2><c:out value=" ${SPRING_SECURITY_403_EXCEPTION.getMessage()}"/></h2>--%>
    <h3><c:out value=" ${msg}"/></h3>
</body>
</html>
