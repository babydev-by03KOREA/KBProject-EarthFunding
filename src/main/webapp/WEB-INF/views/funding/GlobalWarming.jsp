<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <link rel="shortcut icon" href="${cp}/resources/view/img/IconLogo.png" type="image/x-icon"> <!--추가-->
    <link rel="stylesheet" href="${cp}/resources/view/css/GlobalWarming.css">
    <title>지구 시뮬레이션</title>
</head>
<body>
<jsp:include page="../header.jsp"/>
<div class="simulator">
    <div class="bar">

    </div>
    <div class="earthImg">
        <img src="${cp}/resources/view/img/world-map.png" alt="세계지도">
    </div>
</div>

<div class="koreaMap">
    <iframe allow="fullscreen 'none'" frameBorder="0"
            src="https://coastal.climatecentral.org/embed/map/9/127.3131/37.157/?theme=warming&map_type=multicentury_slr_comparison&basemap=roadmap&elevation_model=best_available&lockin_model=levermann_2013&temperature_unit=C&warming_comparison=%5B%222.0%22%2C%224.0%22%5D"
            width="100%" height="500" title="Climate Central | Comparison: long-term sea level outcomes"></iframe>
</div>
<jsp:include page="../footer.jsp"/>
</body>
</html>
