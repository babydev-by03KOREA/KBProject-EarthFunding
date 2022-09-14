<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>함께 만들어가요 아름다운 지구</title>
    <link rel="stylesheet" type="text/css" href="//cdn.jsdelivr.net/npm/slick-carousel@1.8.1/slick/slick.css"/>
    <link rel="shortcut icon" href="${cp}/resources/view/img/IconLogo.png"  type="image/x-icon"> <!--추가-->
    <link rel="stylesheet" href="${cp}/resources/view/css/mainIndex.css">
	<script src="${cp}/resources/view/javascript/mainIndex.js" defer></script>
    <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script type="text/javascript" src="//cdn.jsdelivr.net/npm/slick-carousel@1.8.1/slick/slick.min.js"></script>
    <link rel="stylesheet" type="text/css" href="//cdn.jsdelivr.net/npm/slick-carousel@1.8.1/slick/slick-theme.css"/>
</head>
<body>
<%@ include file="./header.jsp" %>
<section>
    <div class="slide_div_wrap">
        <div class="slide_div">
            <div>
                <a href="/donation/polarBear.do">
                    <img src="${cp}/resources/view/img/earthBanner/polar.jpg" />
                </a>
            </div>
            <div>
                <a href="/donation/turtle.do">
                    <img src="${cp}/resources/view/img/earthBanner/turtle.jpg" />
                </a>
            </div>
            <div>
                <a href="/donation/factory.do">
                    <img src="${cp}/resources/view/img/earthBanner/factory.jpg" />
                </a>
            </div>
        </div>
    </div>
</section>
<%@ include file="./footer.jsp" %>
</body>
</html>
