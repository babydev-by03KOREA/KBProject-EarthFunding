<%@ page contentType="text/html; charset=UTF-8" language="java" %>
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
            <a href="/index.do">EarthDonation</a>
        </div>

        <ul class="navbar__menu">
            <li><a href="#">지구 시뮬레이션</a></li>
            <li><a href="/donation/list.do">펀딩하기</a></li>
            <li><a href="#">펀딩만들기</a></li>
            <li><a href="#">heal the world</a></li>
            <li><a href="#">우리의 추구</a></li>
        </ul>

        <ul class="navbar__icons">
            <!-- 로그인 하지 않은 상태 -->
            <c:if test = "${member == null }">
                <li><i class="fa-solid fa-arrow-right-to-bracket"><a href="/member/login.do">로그인</a></i></li>
                <li><i class="fa-solid fa-file-signature"><a href="/member/UserJoin.do">회원가입</a></i></li>
            </c:if>

            <!-- 로그인한 상태 -->
            <c:if test="${ member != null }">
                ${member.userid}님 환영합니다! &nbsp; &nbsp;
                <a href="/member/logout.do" style="text-decoration: none">로그아웃</a>
            </c:if>
        </ul>

        <a href="#" class="navbar__toogleBtn">
            <i class="fa-solid fa-bars"></i>
        </a>
    </nav>
</body>
</html>