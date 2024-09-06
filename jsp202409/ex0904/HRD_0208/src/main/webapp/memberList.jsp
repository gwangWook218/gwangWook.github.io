<%@page import="member.MemberDTO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>쇼핑몰 회원관리 ver 1.0</title>
</head>
<body>
    <%@ include file="./header.jsp" %>
    <%
    ArrayList<MemberDTO> memberList = (ArrayList<MemberDTO>) request.getAttribute("memberList");
    %>
    <section>
        <div class="container">
            <h3 class="title">회원 목록 조회/수정/삭제</h3>
            <table>
                <tr>
                    <th>회원번호</th>
                    <th>회원성명</th>
                    <th>회원전화</th>
                    <th>회원주소</th>
                    <th>가입일자</th>
                    <th>고객등급</th>
                    <th>거주지역</th>
                    <th>[삭제]</th>
                </tr>
                <%
                if (memberList != null) {
                	for (MemberDTO dto : memberList) {
                %>
                <tr>
                    <td><a href="/memberUpdateForm.jsp?custno=<%= dto.getCustno() %>"><%= dto.getCustno() %></a></td>
                    <td><%= dto.getCustname() %></td>
                    <td><%= dto.getPhone() %></td>
                    <td><%= dto.getAddress() %></td>
                    <td><%= dto.getJoindate() %></td>
                    <td><%= dto.getGrade() %></td>
                    <td><%= dto.getCity() %></td>
                    <td><a href="/memberDelete?custno=<%= dto.getCustno() %>"></a></td>
                </tr>
                <%
                	}
                }
                %>
            </table>
            <p>회원 매출 정보가 남아있는 회원은 삭제할 수 없음</p>
        </div>
    </section>
    <%@ include file="./footer.jsp" %>
</body>
</html>