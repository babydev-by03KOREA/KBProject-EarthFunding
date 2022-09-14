<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입성공!</title>
<style>
	.section {
		width: 100vw;
		height: 100vh;
	}

	.checkIMG {
		display: flex;
		align-items: center;
		justify-content: center;
	}
	
	img {
		width: 200px;
		height: 200px;
	}
	
	a {
		text-decoration: none;
	}
</style>
</head>
<body>
	<%@ include file="../header.jsp" %>
	<section>
		<div class="checkIMG">
			<img src="${cp}/resources/view/img/greenCheck.jpg" alt="checkIMG" />
			<h3>정상적으로 회원가입에 성공하였습니다!</h3> <br><br>
			<h4><a href="/index.do">매인화면으로 돌아가기</a></h4>
		</div>
	</section>
	<%@ include file="../footer.jsp" %>
</body>
</html>