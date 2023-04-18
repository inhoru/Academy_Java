package com.jdbc.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.jdbc.common.JDBCTemplate;
import com.jdbc.model.dto.MemberDTO;

public class MemberDao {
	public List<MemberDTO> selectAllMember(Connection conn) {
		Statement stmt = null;
		ResultSet rs = null;
		String sql = "SELECT * FROM MEMBER";
		List<MemberDTO> members = new ArrayList();
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next())
				members.add(getMember(rs));
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(rs);
			JDBCTemplate.close(stmt);
		}
		return members;
	}
	public MemberDTO selectMemberById(Connection conn, String id) {
		//sql문에 변수값을 대입할때 자료형맞춰 편리하게 대입할 수 있는 preparedStatement 이용하기
		//preparedState 는 Statement를 상속받은 클래스
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		MemberDTO m = null;
		//PreparedStatement 객체를 이용해서 sql문을 실행하려면 기본statement와 차이가 있음
		//외부의 값을 받아서 sql문을 구성할때 표현과 값대입방식이 다름.
		//statement : SELECT * FROM MEMBER WHERE MEMBER_ID = '"+변수명+"'";
		//PreparedStatement : "SELECT * FROM MEMBER WHERE MEMBER_ID = ?"
		//외부값을 ?(위치홀더)표시해서 쿼리문을 작성한다.
		String sql = "SELECT * FROM MEMBER WHERE MEMBER_ID =?";
		try {
			//PreaparedStatement는 conn.prepareStatement()메소드 이용
			//인수로 sql문을 대입해줌.
			pstmt = conn.prepareStatement(sql);
			//?표시되어있는 곳에 값을 대입해줘야한다.
			// 대입은 preparedStatement가 제공하는 메소드를 이용
			// set자료형 (String,Int,Date....)(위치값,대입할값);
			//위치값은 1부터 시작한다. 왼쪽부터 시작한다.
			pstmt.setString(1, id);
			
			//주의할점 위치홀더(?)로 표시한값이 있으면 반드시 값을 대입해줘야한다.
			//대입하지않으면 exception발생함.
			//누락된 in또는 out매개변수 오류가 발생하면 ?의값이들어가있는지확인하자.
			
			rs = pstmt.executeQuery();
			if(rs.next()) m = getMember(rs);
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCTemplate.close(rs);
			JDBCTemplate.close(pstmt);
			
		}return m;
		
		
		
	}

	private MemberDTO getMember(ResultSet rs) throws SQLException {
		MemberDTO m = new MemberDTO();
		m.setMemberId(rs.getString("member_id"));
		m.setMemberPwd(rs.getString("member_pwd"));
		m.setMemberName(rs.getNString("member_name"));
		m.setGender(rs.getString("gender").charAt(0));
		m.setAge(rs.getInt("age"));
		m.setEmail(rs.getString("email"));
		m.setPhone(rs.getString("phone"));
		m.setAddress(rs.getString("address"));
		m.setHobby(rs.getString("hobby").split(","));
		m.setEnrollDate(rs.getDate("enroll_date"));
		return m;
	}

}