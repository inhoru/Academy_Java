package com.bs.model.service;

import static com.bs.common.JDBCTemplate.close;
import static com.bs.common.JDBCTemplate.getConnection;

import java.sql.Connection;
import java.util.List;
import java.util.Map;

import com.bs.dto.BoardDTO;
import com.bs.model.dao.BoardDao;

public class BoardService {
	private BoardDao dao = new BoardDao();
	
	
	public List<BoardDTO> selectAllBoard(){
		Connection conn = getConnection();
		List<BoardDTO> boards = dao.selectAllBoard(conn);
		for(BoardDTO b : boards) {
			b.setComments(dao.selectBoardComment(conn, b.getBoardNo()));
			
			
		}
		close(conn);
		return boards;
		
		
	}
	public List<BoardDTO> searchBoard(Map param){
		Connection conn = getConnection();
		List<BoardDTO> boards = dao.searchBoard(conn,param);
		close(conn);
		return boards;
	}
}

