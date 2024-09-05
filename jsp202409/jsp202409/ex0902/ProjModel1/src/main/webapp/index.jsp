<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원제 게시판</title>
<link rel="stylesheet" href="./css/style.css" type="text/css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
<script src="./js/script.js"></script>
</head>
<body>
    <%@ include file="./header.jsp" %>
    <nav>
        <ul>
            <li><a href="./memberList.jsp">회원 목록 조회</a></li>
            <li><a href="./memberInsert.jsp">회원 추가</a></li>
        </ul>
    </nav>
    <section>
        <hr>
        <hr>
    </section>
    <%@ include file="./footer.jsp" %>
</body>
</html>