package com.jdbc.model.service;

import java.sql.Connection;
import java.util.List;

import com.jdbc.common.JDBCTemplate;
import com.jdbc.model.dao.MemberDao;
import com.jdbc.model.dto.MemberDTO;
import static com.jdbc.common.JDBCTemplate.*;

public class MemberService {
	
	private MemberDao dao=new MemberDao();
	
	//1. DB에 연결하는 Connection객체를 관리
	//2. 트렌젝션처리(commit, rollback)를 여기서 함.
	//3. 서비스에 해당하는 DAO클래스를 호출해서 연결DB에서 sql문을 실행시키는 기능
	public List<MemberDTO> selectAllMember(){
		Connection conn=getConnection();
		List<MemberDTO> members=dao.selectAllMember(conn);
		close(conn);
		return members;
	}
	
	public MemberDTO selectMemberById(String id) {
		Connection conn=getConnection();
		MemberDTO m=dao.selectMemberById(conn, id);
		close(conn);
		return m;
	}
	public int insertMember(MemberDTO m) {
		Connection conn=getConnection();
		int result=dao.insertMember(conn,m);
		//트렌젝션처리
		if(result>0) commit(conn);
		else rollback(conn);
		close(conn);
		return result;
	}
	
	
	public int updateMember(MemberDTO m) {
		Connection conn=getConnection();
		int result=dao.updateMember(conn, m);
		if(result>0) commit(conn);
		else rollback(conn);
		close(conn);
		return result;
	}
	
	public List<MemberDTO> selectMemberByName(String name) {
		Connection conn=getConnection();
		List<MemberDTO> m=dao.selectMemberByName(conn,name);
		close(conn);
		return m;
	}
	
}





