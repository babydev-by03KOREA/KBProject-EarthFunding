<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!doctype html>
<head>
    <link rel="shortcut icon" href="${cp}/resources/view/img/IconLogo.png" type="image/x-icon"> <!--추가-->
    <link rel="stylesheet" href="${cp}/resources/view/css/DonationList.css">
    <title>펀딩 리스트</title>
</head>
<body>
<%@ include file="../header.jsp" %>
<section>
    <h1><strong>원하는 펀딩을 선택하세요</strong></h1>
    <c:forEach items="${list}" var="list">
        <h1>${list.fundingNum}</h1>
        <h1>${list.fundingName}</h1>
        <h1><fmt:formatNumber value="${list.fundingMaxPrice}" pattern="###,###,###"/></h1>
        <h1>${list.fundingDes}</h1>
        <h1>${list.fundingImg}</h1>
        <h1><fmt:formatDate value="${list.gdsDate}" pattern="yyyy-mm-dd"/></h1>
    </c:forEach>
    <div class="funding_list">
    <%-- HardCoding Area --%>
        <div class="product1">
            <a href="/donation/polarBear.do"><h3>북극곰에 내집마련 프로젝트 🏡</h3></a>
            <img src="${cp}/resources/view/img/pbear.jpg" alt=""/>
        </div>
        <div class="product2">
            <a href="/donation/turtle.do"><h3>거북이에 멸종방지 프로젝트 🐢</h3></a>
            <img src="${cp}/resources/view/img/turtle.jpg" alt=""/>
        </div>
        <div class="product3">
            <h3>미세먼지 줄이기 프로젝트 🏭</h3>
            <img src="${cp}/resources/view/img/factory.jpg" alt=""/>
        </div>
    </div>
</section>
<%@ include file="../footer.jsp" %>
</body>
</html>
