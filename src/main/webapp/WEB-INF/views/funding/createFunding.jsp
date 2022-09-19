<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>내손으로 만드는 깨끗한 지구🌏</title>
    <link rel="shortcut icon" href="${cp}/resources/view/img/IconLogo.png" type="image/x-icon"> <!--추가-->
    <link rel="stylesheet" href="${cp}/resources/view/css/createFunding.css">
</head>
<body>
<%@ include file="../header.jsp" %>
<h1>지구펀딩 만들기 🔨</h1>
<h2>현재 입력된 값은 DB에 저장됩니다. 검수 과정을 거친 후 업로드 되게 됩니다.
    <br> 지구를 위한 실천에 동참해주셔서 진심으로 감사드립니다.
    <br>
</h2>
<form method="post" action="/funding/createFundingSuccess.do" class="createForm">

    <div class="inputArea">
        <label for="fundingName">펀딩 이름</label><br>
        <input type="text" id="fundingName" name="fundingName" placeholder="펀딩에 목적이 잘 나타나는 이름을 지어주세요!"/>
    </div>

    <div class="inputArea">
        <label for="fundingMaxPrice">펀딩 모집 가격</label><br>
        <input type="number" id="fundingMaxPrice" name="fundingMaxPrice" placeholder="만 단위로 숫자만 입력해주세요." min="1000" />
    </div>

    <div class="inputArea">
        <label for="fundingDescription">펀딩 설명</label><br>
        <textarea rows="5" cols="50" id="fundingDescription" name="fundingDescription" placeholder="펀딩을 1200자 내로 설명해주세요!"></textarea>
    </div>

    <div class="inputArea">
        <label for="fundingPurpose">펀딩 목적</label><br>
        <textarea rows="5" cols="50" id="fundingPurpose" name="fundingPurpose" placeholder="펀딩에 목적을 1200자 내로 적어주세요!"></textarea>
    </div>

    <div class="inputArea">
        <button type="submit" id="register_Btn" class="submitBtn">등록</button>
    </div>

</form>
<%@ include file="../footer.jsp" %>
</body>
</html>
