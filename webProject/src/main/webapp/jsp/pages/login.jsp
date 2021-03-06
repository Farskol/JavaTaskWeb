<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="pageLanguage" scope="session" value="${language}"/>
<c:choose>
    <c:when test="${not empty pageLanguage}"> <fmt:setLocale value="${language}" scope="session"/></c:when>
    <c:when test="${empty pageLanguage}"> <fmt:setLocale value="${language = 'ru_RU'}" scope="session"/></c:when>
</c:choose>
<fmt:bundle basename="context.language">
    <fmt:message key="login.login" var="client_login"></fmt:message>
    <fmt:message key="login.password" var="client_password"></fmt:message>
    <fmt:message key="login.sign_in" var="sign_in"></fmt:message>
    <fmt:message key="login.registration" var="registration"></fmt:message>
</fmt:bundle>
<!DOCTYPE html>
<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>
<div class="container">
    <div class="row align-items-center">
        <form class="col-md-4 offset-md-4 needs-validation" name="loginForm" method="POST" action="controller">
            <div class="form-group col-auto">
                <input type="hidden" name="command" value="login">
                <label for="login">${client_login}</label>
                <input type="text" class="form-control" id="login"  placeholder="${client_login}" name="login" required
                       pattern="^[A-Za-zА-Яа-я0-9_]{3,30}$">
            </div>
            <div class="form-group">
                <label for="password">${client_password}</label>
                <input type="password" class="form-control" id="password" placeholder="${client_password}" name="password" required
                pattern="^[A-Za-zА-Яа-я0-9\.]{8,40}$">
            </div>
            <button type="submit" class="btn btn-success">${sign_in}</button>
        </form>
        <form action="registration.jsp" class="col-md-4 offset-md-4 needs-validation">
            <button type="submit" class="btn btn-outline-success">${registration}</button>
        </form>
    </div>
</div>
</body>
</html>
