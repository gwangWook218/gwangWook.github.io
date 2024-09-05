<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원제 게시판</title>
<link rel="stylesheet" href="./css/style.css" type="text/css">
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
        <h1>회원 입력 화면</h1>
        <form action="./insertProcess.jsp" method="post">
            회원 이름 : <input type="text" name="name">
            회원 전화번호 : <input type="text" name="tel">
            <input type="submit" value="회원 추가">
            <input type="reset" value="초기화">
        </form>
        <button><a href="./index.jsp">홈으로</a></button>
        <hr>
    </section>
    <%@ include file="./footer.jsp" %>
</body>
</html>