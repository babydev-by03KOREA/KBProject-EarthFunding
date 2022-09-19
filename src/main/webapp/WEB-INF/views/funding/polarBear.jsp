<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!doctype html>
<html>
<head>
    <link rel="shortcut icon" href="${cp}/resources/view/img/IconLogo.png" type="image/x-icon"> <!--추가-->
    <link rel="stylesheet" href="${cp}/resources/view/css/Product.css">
    <script src="${cp}/resources/view/javascript/Product.js"></script>
    <script type="text/javascript" src="http://code.jquery.com/jquery-latest.js"></script>
    <title>북극곰의 내집마련 프로젝트 🏠️</title>
</head>
<body>
<jsp:include page="../header.jsp"/>
<section>
    <div class="project">
        <h1>우리에 첫번째 도전. 북극곰의 내집마련 프로젝트 🏠</h1>
        <div class="product">
            <div class="productImg">
                <img src="${cp}/resources/view/img/pbear.jpg" alt="북극곰">
            </div>
            <div class="productPrice">
<%--                <h3>북극곰 지키기 프로젝트</h3>--%>
                <h4>비용당 최대 10만원씩 선택 가능합니다!</h4>
                <h4>인건비</h4>
                <div class="laborBox">
                    <input class="labor" name="labor" type="range" min="0" max="100000" step="1000"
                           oninput="document.querySelector('.result1').innerHTML=this.value;" style="width: 450px"/>
                    <p class="result1"></p>
                </div>
                <h4>도구비</h4>
                <div class="toolBox">
                    <input class="tools" name="tools" type="range" min="0" max="100000" step="1000"
                           oninput="document.querySelector('.result2').innerHTML=this.value;" style="width: 450px"/>
                    <p class="result2"></p>
                </div>
                <h4>*협의비</h4>
                <div class="policyBox">
                    <input class="policy" name="policy" type="range" min="0" max="100000" step="1000"
                           oninput="document.querySelector('.result3').innerHTML=this.value;" style="width: 450px"/>
                    <p class="result3"></p>
                </div>
                <h5>*협의비란? 각국 정상 및 기업, 단체와 협의 및 법안 개정에 필요한 금액을 뜻합니다.</h5>
                <button type="button" onclick="amount();">기부하기</button>
            </div>
        </div>
        <h1>모집 금액: ~10,000,000₩</h1>
        <h1>기부 목적</h1>
        <p>북극에 빙하가 녹아서 북금곰이 살곳을 잃고있어요. 북극곰의 개체수는 늘어났지만 살곳은 점점 줄고있어요. 마치 서울과같이 말이죠.<br>
            최근 북극에 빙하는 무려 50%나 감소했습니다.<br> 북극에 빙하가 계속 녹는다면 굶어죽거나 먹이를 찾아 내려온 북극곰이 사람을 공격하거나
            사람이 자신을 보호하기 위해 총을 맞아 죽게되겠지요.<br>
            더 나아가 빙하가 녹으면 지구에 해수면이 상승하게 됩니다. <br>
            개체수가 전부가 아닙니다. 북극곰을 멸종위기에서 지켜주세요. <br></p>
        <h3>이 기부는 지속되는 지구온난화로 인한 빙하 감소로 인한 향후 북극곰 서식지 감소와 해수면 상승 문제 해결을 주 목적으로 만들어졌습니다.</h3>
    </div>
</section>
<jsp:include page="../footer.jsp"/>
</body>
</html>
