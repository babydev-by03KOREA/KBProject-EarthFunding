<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>회원가입성공!</title>
    <link rel="stylesheet" href="${cp}/resources/view/css/JoinSuccess.css">
</head>
<body>
<%@ include file="../header.jsp" %>
<section>
    <div class="checkIMG">
        <img src="${cp}/resources/view/img/greenCheck.jpg" alt="checkIMG"/>
        <h3>정상적으로 등록되었습니다!</h3> <br><br>
        <h4><a href="/index.do">매인화면으로 돌아가기</a></h4>
    </div>
</section>
<%@ include file="../footer.jsp" %>
</body>
</html>