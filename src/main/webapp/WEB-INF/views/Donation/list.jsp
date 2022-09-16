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
    <div class="funding_list">
        <c:forEach items="${list}" var="list">
        <div class="product1">
            <a href="/donation/donationProduct.do?n=${list.donationNum}"><h3>${list.donationName}</h3></a>
            <img src="${cp}/resources/view/img/pbear.jpg" alt="북극곰"/>
            <h1><fmt:formatNumber value="${list.donationMaxPrice}" pattern="~ ###,###,###₩"/></h1>
            <h1><fmt:formatDate value="${list.gdsDate}" pattern="yyyy-mm-dd"/></h1>
        </div>
        <div class="product2">
            <a href="/donation/turtle.do"><h3>거북이에 멸종방지 프로젝트 🐢</h3></a>
            <img src="${cp}/resources/view/img/turtle.jpg" alt=""/>
        </div>
        <div class="product3">
            <h3>미세먼지 줄이기 프로젝트 🏭</h3>
            <img src="${cp}/resources/view/img/factory.jpg" alt=""/>
        </div>
        </c:forEach>
    </div>
</section>
<%@ include file="../footer.jsp" %>
</body>
</html>
