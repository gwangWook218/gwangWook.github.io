<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원제 게시판</title>
<link rel="stylesheet" href="./css/style.css">
</head>
<body>
<%@ include file="./header.jsp" %>
<%@ include file="./menu.jsp" %>
<section>
    <hr>
    <h1>회원 입력 화면</h1>
    <form action="/insertMember" method="post">
        회원 이름 : <input type="text" name="name">
        회원 전화번호 : <input type="text" name="tel">
        <input type="submit" value="회원 추가">
        <input type="reset" value="초기화">
    </form>
    <button><a href="/index.jsp">홈으로</a></button>
    <hr>
</section>
<%@ include file="./footer.jsp" %>
</body>
</html>