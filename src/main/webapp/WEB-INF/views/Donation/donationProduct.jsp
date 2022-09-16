<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!doctype html>
<html>
<head>
    <link rel="shortcut icon" href="${cp}/resources/view/img/IconLogo.png" type="image/x-icon"> <!--추가-->
    <link rel="stylesheet" href="${cp}/resources/view/css/Product.css">
    <title>기부상품</title>
</head>
<body>
<%@ include file="../header.jsp" %>
<section>
    <h1>${product.donationNum}</h1>
    <h1>${product.donationName}</h1>
    <h1>${product.donationMaxPrice}</h1>
    <h1>${product.donationDescription}</h1>
    <h1>${product.donationPurpose}</h1>
    <h1>${product.gdsDate}</h1>
</section>
<%@ include file="../footer.jsp" %>
</body>
</html>
