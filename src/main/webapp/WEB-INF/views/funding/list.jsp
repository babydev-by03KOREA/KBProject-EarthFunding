<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!doctype html>
<head>
    <link rel="shortcut icon" href="${cp}/resources/view/img/IconLogo.png" type="image/x-icon"> <!--추가-->
    <link rel="stylesheet" href="${cp}/resources/view/css/fundingList.css">
    <title>펀딩 리스트</title>
</head>
<body>
<%@ include file="../header.jsp" %>
<section>
    <h1><strong>원하는 펀딩을 선택하세요</strong></h1>
    <div class="funding_list">
        <div class="product1">
            <a href="/funding/polarBear.do"><h3>북극곰의 내집마련 프로젝트 🏠️</h3></a>
            <a href="/funding/polarBear.do"><img src="${cp}/resources/view/img/pbear.jpg" alt="북극곰"/></a>
            <h3>모금액</h3>
            <h1>~10,000,000₩</h1>
            <h3>펀딩 생성일</h3>
            <h1>2022-09-16</h1>
        </div>
        <div class="product2">
            <a href="/funding/turtle.do"><h3>거북이의 멸종방지 프로젝트 🐢</h3></a>
            <a href="/funding/turtle.do"><img src="${cp}/resources/view/img/turtle.jpg" alt="거북이"/></a>
            <h3>모금액</h3>
            <h1>~6,000,000₩</h1>
            <h3>펀딩 생성일</h3>
            <h1>2022-09-16</h1>
        </div>
        <div class="product3">
            <a href="/funding/factory.do"><h3>미세먼지 줄이기 프로젝트 🏭</h3></a>
            <a href="/funding/factory.do"><img src="${cp}/resources/view/img/factory.jpg" alt="공장"/></a>
            <h3>모금액</h3>
            <h1>~5,000,000₩</h1>
            <h3>펀딩 생성일</h3>
            <h1>2022-09-16</h1>
        </div>
    </div>
</section>
<%@ include file="../footer.jsp" %>
</body>
</html>
