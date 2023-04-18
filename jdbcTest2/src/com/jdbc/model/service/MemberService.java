package com.jdbc.model.service;

import java.sql.Connection;
import java.util.List;

import com.jdbc.common.JDBCTemplate;
import com.jdbc.model.dao.MemberDao;
import com.jdbc.model.dto.MemberDTO;

public class MemberService {
	
	private MemberDao dao = new MemberDao();
	
	//1.DB에 연결하는 Connection객체를 관리
	//2. 트렌젝션처리(commit, rollback)를 여기서 함.
	//3. 서비스에 해당하는 DAO클래스를 호출해서 연결DB에서 sql문을 실행시키는 기능
	public List<MemberDTO> selectAllMember(){
		Connection conn= JDBCTemplate.getConnection();
		List<MemberDTO> members = dao.selectAllMember(conn);
		JDBCTemplate.close(conn);
		return members;
		
	}
	public MemberDTO selectMemberById(String id) {
		Connection conn = JDBCTemplate.getConnection();
		MemberDTO m = dao.selectMemberById(conn, id);
		JDBCTemplate.close(conn);
		return m;
	}
}
