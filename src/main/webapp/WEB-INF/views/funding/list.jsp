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
        <c:forEach items="${fundingProjects}" var="project">
            <div class="product">
                <a href="/funding/${project.fundingNum}.do"><h3>${project.fundingName}</h3></a>
                <a href="/funding/${project.fundingNum}.do"><img src="${cp}/resources/uploads/${project.imageFile}"
                                                                 alt="${project.fundingName}"/></a>
                <h3>모금액</h3>
                <h1>~${project.fundingMaxPrice}₩</h1>
                <h3>펀딩 생성일</h3>
                <h1><fmt:formatDate value="${project.gdsDate}" pattern="yyyy-MM-dd"/></h1>
            </div>
        </c:forEach>
    </div>
</section>
<%@ include file="../footer.jsp" %>
</body>
</html>
