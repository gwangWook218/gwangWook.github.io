<%@ page import="member.MemberDTO"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="member.MemberDAO"%>
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
        <h1>회원 목록 테이블</h1>
        <table>
            <tr>
                <th>이름</th>
                <th>전화번호</th>
            </tr>
            <%
            MemberDAO dao = new MemberDAO();
            ArrayList<MemberDTO> list = dao.getMemberList();
            
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
        <hr>
        <button><a href="./index.jsp">홈으로</a></button>
    </section>
    <%@ include file="./footer.jsp" %>
</body>
</html>