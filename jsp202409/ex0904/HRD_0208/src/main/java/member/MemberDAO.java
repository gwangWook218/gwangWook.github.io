package member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import common.DBUtils;

public class MemberDAO {
	public ArrayList<MemberDTO> getMember() {
		ArrayList<MemberDTO> list = new ArrayList<MemberDTO>();
		Connection con = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
		con = DBUtils.getConnection();
		String sql = "select custno, custname, phone, address, joindate, \r\n"
				+ "decode(grade, 'A', 'VIP', 'B', '일반', 'C', '직원') grade, city \r\n"
				+ "from member_tbl_02 \r\n"
				+ "order by custno";
		
		try {
			psmt = con.prepareStatement(sql);
			rs = psmt.executeQuery();
			
			while (rs.next()) {
				MemberDTO dto = new MemberDTO();
				dto.setCustno(rs.getInt("custno"));
				dto.setCustname(rs.getString("custname"));
				dto.setPhone(rs.getString("phone"));
				dto.setAddress(rs.getString("address"));
				dto.setJoindate(rs.getDate("joindate"));
				dto.setGrade(rs.getString("grade"));
				dto.setCity(rs.getString("city"));
				list.add(dto);
			}
		} catch (SQLException e) {
			System.out.println("회원목록 조회 중 오류");
			e.printStackTrace();
		} finally {
			DBUtils.close(con, psmt, rs);
		}
		
		return list;
	}
	
	public int getMaxNo() {
		int nextCustNO = 0;
		Connection con = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
		con = DBUtils.getConnection();
		String sql = "select max(custno)+1 nextCustNO from member_tbl_02";
		
		try {
			psmt = con.prepareStatement(sql);
			rs = psmt.executeQuery();
			
			while (rs.next()) {
				nextCustNO = rs.getInt("nextCustNO");
			}
		} catch (SQLException e) {
			System.out.println("회원 번호 조회 중 오류");
			e.printStackTrace();
		} finally {
			DBUtils.close(con, psmt, rs);
		}
		
		return nextCustNO;
	}
}
