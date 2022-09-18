<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>내손으로 만드는 깨끗한 지구🌏</title>
</head>
<body>
<%@ include file="../header.jsp" %>
<form method="post" action="/funding/createFundingSuccess.do">

    <div class="inputArea">
        <label for="fundingName">펀딩 이름</label>
        <input type="text" id="fundingName" name="fundingName" />
    </div>

    <div class="inputArea">
        <label for="fundingMaxPrice">펀딩 모집 가격</label>
        <input type="text" id="fundingMaxPrice" name="fundingMaxPrice" />
    </div>

    <div class="inputArea">
        <label for="fundingDescription">펀딩 설명</label>
        <input type="text" id="fundingDescription" name="fundingDescription" />
    </div>

    <div class="inputArea">
        <label for="fundingPurpose">펀딩 목적</label>
        <textarea rows="5" cols="50" id="fundingPurpose" name="fundingPurpose"></textarea>
    </div>

    <div class="inputArea">
        <button type="submit" id="register_Btn" class="btn btn-primary">등록</button>
    </div>

</form>
<%@ include file="../footer.jsp" %>
</body>
</html>
