<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Home</title>
    <link rel="stylesheet" type="text/css" href="//cdn.jsdelivr.net/npm/slick-carousel@1.8.1/slick/slick.css"/>
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
                <a>
                    <img src="${cp}/resources/view/img/polar-bear.jpg" />
                </a>
            </div>
            <div>
                <a>
                    <img src="${cp}/resources/view/img/stop-global.jpg" />
                </a>
            </div>
            <div>
                <a>
                    <img src="${cp}/resources/view/img/factory.jpg" />
                </a>
            </div>
        </div>
    </div>
</section>
<%@ include file="./footer.jsp" %>
</body>
</html>
