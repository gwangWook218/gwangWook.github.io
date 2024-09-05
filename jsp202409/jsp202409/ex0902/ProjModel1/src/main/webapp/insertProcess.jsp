<%@page import="member.MemberDAO"%>
<%@page import="member.MemberDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String name = request.getParameter("name");
String tel = request.getParameter("tel");

MemberDTO dto = new MemberDTO();
dto.setName(name);
dto.setTel(tel);

MemberDAO dao = new MemberDAO();
int iResult = dao.insertMember(dto);
dao.close();

if (iResult > 0) {
	response.sendRedirect("./memberList.jsp");
} else {
	out.print("<script>history.back();</script>");
}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원제 게시판</title>
</head>
<body>

</body>
</html>