package member;

import java.util.ArrayList;

import common.JDBConnect;

public class MemberDAO extends JDBConnect {
	public ArrayList<MemberDTO> getMemberList() {
//		멤버 리스트 조회
		ArrayList<MemberDTO> list = new ArrayList<MemberDTO>();
		
		String query = "select * from member";
		
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery(query);
			
			while (rs.next()) {
				MemberDTO dto = new MemberDTO();
				dto.setName(rs.getString("name"));
				dto.setTel(rs.getString("tel"));
				
				list.add(dto);
			}
		} catch (Exception e) {
			System.out.println("예외 발생");
			e.printStackTrace();
		}
		
		return list;
	}
	
	public int insertMember(MemberDTO dto) {
		int result = 0;
		
		try {
//			insert 쿼리문 작성
			String query = "INSERT INTO member VALUES(?, ?)";
			
			psmt = con.prepareStatement(query);
			psmt.setString(1, dto.getName());
			psmt.setString(2, dto.getTel());
			
			result = psmt.executeUpdate();
		} catch (Exception e) {
			System.out.println("게시물 입력 중 예외 발생");
			e.printStackTrace();
		}
		
		return result;
	}
}
