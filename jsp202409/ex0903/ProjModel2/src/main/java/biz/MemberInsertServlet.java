package biz;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import member.MemberDAO;
import member.MemberDTO;

@WebServlet("/insertMember")
public class MemberInsertServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html; charset=UTF-8");
		
		MemberDTO dto = new MemberDTO();
		dto.setName(req.getParameter("name"));
		dto.setTel(req.getParameter("tel"));
		
		MemberDAO dao = new MemberDAO();
		int result = dao.insertMember(dto);
		
		if (result > 0) {
			resp.sendRedirect("/listMember");
		} else {
			resp.sendRedirect("/memberInsert.jsp");
		}
	}
}
