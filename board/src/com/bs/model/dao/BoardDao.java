package com.bs.model.dao;

import static com.bs.common.JDBCTemplate.close;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import com.bs.dto.BoardComment;
import com.bs.dto.BoardDTO;

public class BoardDao {
	private Properties sql = new Properties();

	{
		try {
			String path = BoardDao.class.getResource("/Board_sql.properties").getPath();
			sql.load(new FileReader(path));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public List<BoardDTO> selectAllBoard(Connection conn) {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<BoardDTO> boards = new ArrayList();
		String sql = this.sql.getProperty("selectAllBoard");
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				BoardDTO b = getBoard(rs);
				b.setComments(selectBoardComment(conn, b.getBoardNo()));
				boards.add(b);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rs);
			close(pstmt);
		}
		return boards;
	}

	public List<BoardComment> selectBoardComment(Connection conn, int boardNo) {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<BoardComment> comments = new ArrayList<>();
		String sql = this.sql.getProperty("selectBoardCommentByBoardNo");
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, boardNo);
			rs = pstmt.executeQuery();
			while (rs.next())
				comments.add(getComment(rs));

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rs);
			close(pstmt);
		}
		return comments;
	}
	
	public List<BoardDTO> searchBoard(Connection conn, Map param){
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<BoardDTO> boards = new ArrayList<>();
		String sql = this.sql.getProperty("selectBoardByCol");
		//싱글컨커
		sql = sql.replace("#COL", (String)param.get("col"));
		
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, "%"+(String)param.get("keyword")+"%");
			rs=pstmt.executeQuery();
			while(rs.next()) {
				BoardDTO b = getBoard(rs);
				b.setComments(selectBoardComment(conn, b.getBoardNo()));
				boards.add(b);
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			close(rs);
			close(pstmt);
		}
		return boards;
		
	}

	public BoardDTO getBoard(ResultSet rs) throws SQLException {
		BoardDTO b = new BoardDTO();
		b.setBoardNo(rs.getInt("board_no"));
		b.setBoardTitle(rs.getString("board_title"));
		b.setBoardContent(rs.getString("board_content"));
		b.setBoardWriter(rs.getString("board_writer"));
		b.setBoardDate(rs.getDate("board_date"));
		return b;
	}

	private BoardComment getComment(ResultSet rs) throws SQLException {
		BoardComment bc = new BoardComment();

		bc.setCommentNo(rs.getInt("comment_no"));
		bc.setCommentContent(rs.getString("comment_content"));
		bc.setCommentWriter(rs.getString("comment_writer"));
		bc.setCommentDate(rs.getDate("comment_date"));
		return bc;
	}

}
