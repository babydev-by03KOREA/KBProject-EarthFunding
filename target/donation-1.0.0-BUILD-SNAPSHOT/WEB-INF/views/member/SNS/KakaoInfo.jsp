<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <a href="https://kauth.kakao.com/oauth/authorize?response_type=code&client_id=b516cfd19e1309e1920f8910eedeabc2&redirect_uri=http://localhost:8080/Kakao/UserLogin.do&response_type=code" id="kakao_login">Login For Kakao</a>
    <h3>${nickName} Kakao User님 환영합니다!</h3>
</body>
</html>