<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="pageLanguage" scope="session" value="${language}"/>
<c:choose>
    <c:when test="${not empty pageLanguage}"> <fmt:setLocale value="${language}" scope="session"/></c:when>
    <c:when test="${empty pageLanguage}"> <fmt:setLocale value="${language = 'ru_RU'}" scope="session"/></c:when>
</c:choose>
<fmt:bundle basename="context.language">

</fmt:bundle>
<!DOCTYPE html>
<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>
<nav class="nav nav-pills nav-fill bg-success">
    <a class="nav-link active" style="background-color: darkgreen"  href="#">Desserts</a>
    <a class="nav-link text-light bg-green" href="#">Cakes</a>
    <a class="nav-link text-light" href="jsp/pages/login.jsp">Login</a>
    <a class="nav-link disabled text-light" href="#" tabindex="-1" aria-disabled="true">Disabled</a>
</nav>
</body>
</html>