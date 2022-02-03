<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
    <fmt:message key="login.registration" var="registration"></fmt:message>
    <fmt:message key="registration.registration" var="reg"></fmt:message>
    <fmt:message key="registration.name" var="name"></fmt:message>
    <fmt:message key="registration.your_name" var="your_name"></fmt:message>
    <fmt:message key="registration.second_name" var="second_name"></fmt:message>
    <fmt:message key="registration.your_second_name" var="your_second_name"></fmt:message>
    <fmt:message key="registration.phone_number" var="phone_number"></fmt:message>
    <fmt:message key="registration.email" var="email"></fmt:message>


<html>
<head>
    <meta charset="UTF-8">
    <title>Registration</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>

<div class="container">
    <div class="row">
        <h4 class="col-md-4 offset-md-4 text-center my-3">${reg}я</h4>
        <form class="col-md-4 offset-md-4 needs-validation" name="registrationForm" method="POST" action="controller">
            <input type="hidden" name="command" value="registration">
            <div class="form-group col-auto my-3">
                <label for="first_name">${name}</label>
                <input type="text" class="form-control" id="first_name" placeholder="${your_name}" name = "first_name" required
                pattern="^[A-Za-zА-Яа-я]{3,50}$">
            </div>
            <div class="form-group col-auto my-3">
                <label for="second_name">${second_name}</label>
                <input type="text" class="form-control is-invalid" id="second_name" placeholder="${your_second_name}" name="second_name"
                pattern="^[A-Za-zА-Яа-я]{3,50}$">
                <div class="invalid-feedback" >
                    <fmt:message key="registration.name" />
                </div>
            </div>
            <div class="form-group col-auto my-3">
                <label for="login">${client_login}</label>
                <input type="text" class="form-control" id="login" placeholder="${client_login}" name="login" required
                       pattern="^[A-Za-zА-Яа-я0-9_]{3,30}$">
            </div>
            <div class="form-group my-3">
                <label for="password">${client_password}</label>
                <input type="password" class="form-control" id="password" placeholder="${client_password}" name="password" required
                       pattern="^[A-Za-zА-Яа-я0-9\.]{8,40}$">
            </div>
            <div class="form-group my-3">
                <label for="phoneNumber">${phone_number}</label>
                <input type="text" class="form-control" id="phoneNumber" placeholder="${phone_number}" name = "phone_number" required
                pattern="(29|25|44)\d{7}">
            </div>
            <div class="form-group col-auto my-3">
                <label for="email">${email}</label>
                <input type="email" class="form-control" id="email" placeholder="${email}" name="email"
                pattern="^[A-Za-z0-9\.]{1,30}@[a-z]{2,7}\.[a-z]{2,4}$">
            </div>

            <button type="submit" class="btn btn-success my-3">${registration}</button>
        </form>
    </div>
</div>

</body>
</fmt:bundle>
</html>
