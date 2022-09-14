<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="${cp}/resources/view/css/login.css">
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="shortcut icon" href="${cp}/resources/view/img/IconLogo.png"  type="image/x-icon"> <!--추가-->
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Source+Sans+Pro&display=swap" rel="stylesheet">
    <script src="https://kit.fontawesome.com/4163862d0f.js" crossorigin="anonymous"></script>
    <title>로그인 | KBD</title>
    <script src="${cp}/resources/view/javascript/login.js"></script>
</head>
<body>
	<%@ include file="../header.jsp" %>
    <!-- 본 창에서는 HTML 즉 디자인만 확인하세요. 세션 및 쿠키 등 서버단에서 처리되는 기능은 사용 불가합니다. -->
    <!-- header또한 jsp내장객체 사용불가로 로드 불가합니다. 따로 확인해주십시오. -->
    <article class="section">
        <div class="login__group">
            <form action="/member/login_check.do" method="post" class="login__form" onsubmit="return val1(this);">
                <div>
                    <h1 class="login__title">로그인</h1>
                </div>
                <div>
                    <label class="login__set">아이디를 입력하세요.</label>
                    <label>
                        <input type="text" id="userid" name="userid" class="login__input__ID" />
                    </label>
                </div>
                <div>
                    <label class="login__set">비밀번호를 입력하세요.</label>
                    <label>
                        <input type="password" id="passwd" name="passwd" class="login__input__PWD" />
                    </label>
                </div>
               <c:if test="${message == 'error'}">
				 <div style="color:red;"> 아이디 또는 비밀번호가 일치하지 않습니다.
				 </div>
				</c:if>
                <div>
                    <div class="id__save__box">
                        <label for="svchk">
                            <input type="checkbox" id="svchk" name="cookieCheck" value="Y" />
                            <b>아이디 저장</b>
                        </label>
                    </div>
                </div>
                <div>
                    <div class="login__sub">
                        <input type="submit" value="로그인">
                    </div>
                </div>
            </form>
            <div>
                <ul class="find__menu">
                    <li><a href="${pageContext.request.contextPath}/find/findID.jsp">아이디 찾기 ></a></li>
                    <li><a href="${pageContext.request.contextPath}/find/findPWD.jsp">비밀번호 찾기 ></a></li>
                </ul>
            </div>
            <hr/>
            <div class="SNS">
                <div class="snsInfo">
                    카카오로 3초만에 회원가입!
                </div>
                <ul>
                    <li><a href="https://kauth.kakao.com/oauth/authorize?response_type=code&client_id=b516cfd19e1309e1920f8910eedeabc2&redirect_uri=http://localhost:8080/Kakao/UserLogin.do&response_type=code"><img src="${cp}/resources/view/img/KakaoBtn.png" alt="카카오로 로그인" class="SNS__Kakao"></a></li>
                 </ul>
            </div>
            <div class="GeneralJoin">
                <div class="joinInfo">
                    초간단 30초 일반 회원가입!
                </div>
                <div class="joinBtn">
                    <button type="button" onclick="location.href='/member/UserJoin.do'">일반 회원가입</button>
                </div>
            </div>
        </div>
    </article>
	<%@ include file="../footer.jsp" %>
</body>
</html>