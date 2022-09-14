<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>일반 회원가입</title>
    <link rel="stylesheet" href="${cp}/resources/view/css/UserJoin.css">
    <link rel="shortcut icon" href="${cp}/resources/view/img/IconLogo.png"  type="image/x-icon"> <!--추가-->
    <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script src="${cp}/resources/view/javascript/UserJoinAjax.js"></script>
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Source+Sans+Pro&display=swap" rel="stylesheet">
</head>
<body>
<%@ include file="../header.jsp" %>
<section class="section">
    <div class="UserJoin">
        <form action="/member/UserJoin.do" method="post" id="regForm">
            <div>
                <h1 class="join__title">회원가입</h1>
            </div>
            <label class="login__set">아이디를 입력하세요.</label>
            <label class="login__set__info">아이디는 최대 12자리까지 입력 가능합니다.</label>
            <div class="join__id__form">
                <div>
                    <label for="userid"></label><input type="text" id="userid" name="userid" class="join__input__ID" maxlength="12"/>
                </div>
                <button onclick="idOverLap();" value="N" class="idOverLab" id="idOverLab" type="button">ID 중복확인</button>
            </div>
            <div class="join__pwd__form">
                <label class="login__set">비밀번호를 입력하세요.</label>
                <label>
                    <input type="password" id="passwd" name="passwd" class="join__input__PWD" maxlength="12" />
                    <i class="fa fa-eye fa-lg"></i>
                </label>
            </div>
            <label class="login__set">사용하실 이메일을 입력하세요.</label>
            <label class="login__set__info">아이디 및 비밀번호 찾기에 사용됩니다.</label>
            <div class="join__email__form">
                <div>
                    <label for="email__form"></label><input type="email" id="email__form" name="email__form" class="email__input" />
                </div>
                <button class="emailSend" id="emailSend" type="button">인증번호 전송</button>
            </div>
            <div class="join__emailchk__form">
                <label class="login__set">매일로 발송된 인증번호를 입력해주세요.</label>
                <div class="mail_check_input_box">
                    <label for="mail_check_input"></label><input type="text" id="mail_check_input" name="email" class="mail_check_input" disabled="disabled" maxlength="6" />
                </div>
                <button onclick="emailCheck()" class="emailchk" type="button">인증번호 확인</button>
            </div>
            <div class="join__sub">
                <button type="button" class="cancel"><a href="/index.do">메인화면으로</a></button>
                <input type="submit" id="submit" value="회원가입">
            </div>
        </form>
    </div>
</section>
<%@ include file="../footer.jsp" %>
</body>
</html>
