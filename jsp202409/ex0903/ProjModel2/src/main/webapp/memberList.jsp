<%@page import="member.MemberDTO"%>
<%@page import="java.util.ArrayList"%>
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
    <h1>회원 목록 테이블</h1>
    <table>
        <tr>
            <th>이름</th>
            <th>전화번호</th>
        </tr>
        <%
        ArrayList<MemberDTO> list = (ArrayList<MemberDTO>) request.getAttribute("memberlist");
        
        if (list != null) {
        	for (MemberDTO dto : list) {
        %>
        <tr>
            <td><%= dto.getName() %></td>
            <td><%= dto.getTel() %></td>
        </tr>
        <%
        	}
        }
        %>
    </table>
    <button><a href="/index.jsp">홈으로</a></button>
    <hr>
</section>
<%@ include file="./footer.jsp" %>
</body>
</html>