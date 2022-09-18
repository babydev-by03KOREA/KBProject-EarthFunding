<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="${cp}/resources/view/css/header.css">
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Source+Sans+Pro&display=swap" rel="stylesheet">
    <title>NavBar</title>
    <script src="${cp}/resources/view/javascript/navbar.js" defer></script>
    <script src="https://kit.fontawesome.com/4163862d0f.js" crossorigin="anonymous"></script>
</head>
<body>
<nav class="navbar">
    <div class="navbar__logo">
        <img alt="EarthFunding" src="${cp}/resources/view/img/IconLogo.png">
        <a href="/index.do">EarthFunding</a>
    </div>

    <ul class="navbar__menu">
        <li><a href="/funding/simulation.do">지구 시뮬레이션</a></li>
        <li><a href="/funding/list.do">기부하기</a></li>
        <li><a href="/funding/createFunding.do">기부만들기</a></li>
        <li><a href="#">heal the world</a></li>
        <li><a href="#">우리의 추구</a></li>
    </ul>

    <ul class="navbar__icons">
            <!-- 로그인 하지 않은 상태 -->
            <c:if test = "${empty sessionScope.member && empty sessionScope.Kmember}">
                <li><i class="fa-solid fa-arrow-right-to-bracket"><a href="/member/login.do">로그인</a></i></li>
                <li><i class="fa-solid fa-file-signature"><a href="/member/UserJoin.do">회원가입</a></i></li>
            </c:if>

            <!-- 로그인한 상태 -->
            <c:if test="${not empty sessionScope.member}">
                <li>${member.userid}님 환영합니다!</li>
                <li><i class="fa-solid fa-file-signature"><a href="/member/logout.do" style="text-decoration: none">로그아웃</a></i></li>
            </c:if>

            <c:if test="${not empty sessionScope.Kmember}">
                <li>${sessionScope.Kmember}님 환영합니다!</li>
                <li><i class="fa-solid fa-file-signature"><a href="/member/logout.do" style="text-decoration: none">로그아웃</a></i></li>
            </c:if>
    </ul>

    <a href="#" class="navbar__toogleBtn">
        <i class="fa-solid fa-bars"></i>
    </a>
</nav>
</body>
</html>