<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <link rel="shortcut icon" href="${cp}/resources/view/img/IconLogo.png" type="image/x-icon"> <!--추가-->
    <link rel="stylesheet" href="${cp}/resources/view/css/GlobalWarming.css">
    <script src="${cp}/resources/view/javascript/GlobalWarming.js"></script>
    <title>지구 시뮬레이션</title>
</head>
<body>
<jsp:include page="../header.jsp"/>
<%--<div class="simulator">--%>
<%--    <img src="${cp}/resources/view/img/world-map.png" alt="세계지도">--%>
<%--    <div class="bar">--%>
<%--        <input type="range" max="50" step="5" min="0">--%>
<%--    </div>--%>
<%--</div>--%>

<%--<div class="console">--%>
<%--    <p class="result1"></p>--%>
<%--</div>--%>

<h1>해수면 온도가 상승한 국내지도</h1>
<div class="seoulMap">
    <h3>파란색은 해수면 온도가 2도 상승했을 때의 서울 및 수도권의 지도이고, <br> 노란색은 해수면 온도가 4도 상승했을 때의 지도입니다.</h3>
    <iframe allow="fullscreen 'none'" frameBorder="0"
            src="https://coastal.climatecentral.org/embed/map/9/127.3131/37.157/?theme=warming&map_type=multicentury_slr_comparison&basemap=roadmap&elevation_model=best_available&lockin_model=levermann_2013&temperature_unit=C&warming_comparison=%5B%222.0%22%2C%224.0%22%5D"
            width="100%" height="500" title="Climate Central | Comparison: long-term sea level outcomes"></iframe>
</div>
<div class="busanMap">
    <h3>파란색은 해수면 온도가 2도 상승했을 때의 대한민국 지도이고, <br> 노란색은 해수면 온도가 4도 상승했을 때의 지도입니다.</h3>
    <iframe allow="fullscreen 'none'" frameBorder="0" src="https://coastal.climatecentral.org/embed/map/11/129.0718/35.1645/?theme=warming&map_type=multicentury_slr_comparison&basemap=roadmap&elevation_model=best_available&lockin_model=levermann_2013&temperature_unit=C&warming_comparison=%5B%222.0%22%2C%224.0%22%5D" width="100%" height="500" title="Climate Central | Comparison: long-term sea level outcomes"></iframe>
</div>
<h2>국내의 경우 제2의 수도 부산이 가장 피해가 심할것으로 예측됩니다. 앞으로 2도만 올라도 김해국제공항이 물에 잠기게 됩니다. <br> 영화 '해운대'가 영화만이 아닌, 현실로 코앞에 닥쳤습니다.</h2>
<h1>해수면 온도가 상승한 세계지도</h1>
<div class="tokyoMap">
    <h3>파란색은 해수면 온도가 2도 상승했을 때의 도쿄 지도이고, <br> 노란색은 해수면 온도가 4도 상승했을 때의 지도입니다.</h3>
    <iframe allow="fullscreen 'src'" frameBorder="0"
            src="https://coastal.climatecentral.org/embed/map/9/139.7698/35.5146/?theme=warming&map_type=multicentury_slr_comparison&basemap=roadmap&elevation_model=best_available&lockin_model=levermann_2013&temperature_unit=C&warming_comparison=%5B%222.0%22%2C%224.0%22%5D"
            width="100%" height="500" title="Climate Central | Comparison: long-term sea level outcomes"></iframe>
</div>

<div class="LAMap">
    <h3>파란색은 해수면 온도가 2도 상승했을 때의 LA 지도이고, <br> 노란색은 해수면 온도가 4도 상승했을 때의 지도입니다.</h3>
    <iframe allow="fullscreen 'src'" frameBorder="0"
            src="https://coastal.climatecentral.org/embed/map/10/-118.4117/34.0211/?theme=warming&map_type=multicentury_slr_comparison&basemap=roadmap&elevation_model=best_available&lockin_model=levermann_2013&temperature_unit=C&warming_comparison=%5B%222.0%22%2C%224.0%22%5D"
            width="100%" height="500" title="Climate Central | Comparison: long-term sea level outcomes"></iframe>
</div>

<div class="NYCMap">
    <h3>파란색은 해수면 온도가 2도 상승했을 때의 뉴욕의 지도이고, <br> 노란색은 해수면 온도가 4도 상승했을 때의 지도입니다.</h3>
    <iframe allow="fullscreen 'src'" frameBorder="0" src="https://coastal.climatecentral.org/embed/map/11/-73.9797/40.6979/?theme=warming&map_type=multicentury_slr_comparison&basemap=roadmap&elevation_model=best_available&lockin_model=levermann_2013&temperature_unit=C&warming_comparison=%5B%222.0%22%2C%224.0%22%5D" width="100%" height="500" title="Climate Central | Comparison: long-term sea level outcomes"></iframe>
</div>

<div class="description">
    <h2>이렇게 우리가 알고있는 주요 대도시에 국가들도 곧 침몰될 위기에 쳐했습니다. </h2>
</div>
<jsp:include page="../footer.jsp"/>
</body>
</html>
