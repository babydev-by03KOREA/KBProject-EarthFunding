<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인에 성공하였습니다!</title>
</head>
<body>
	<h1>로그인에 성공하였습니다!</h1>
	<h3>
		${loginUser}님 환영해요!
	</h3>
	<h3><a href="/index.do" style="text-decoration:none;">메인화면으로 돌아가기</a></h3>
	<h3><a href="/member/logout.do" style="text-decoration:none;">logout</a></h3>
	<c:if test="${message == 'logout'}">
		<div style="color:red;"> 로그아웃 되었습니다! 안녕히가세요~</div>
	</c:if>
</body>
</html>