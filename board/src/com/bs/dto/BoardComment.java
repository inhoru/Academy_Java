package com.bs.dto;

import java.sql.Date;
import java.util.Objects;

public class BoardComment {
	private int commentNo;
	private String commentContent;
	private String commentWriter;
	private Date commentDate;
	
	public BoardComment() {
		// TODO Auto-generated constructor stub
	}

	public BoardComment(int commentNo, String commentContent, String commentWriter, Date commentDate) {
		super();
		this.commentNo = commentNo;
		this.commentContent = commentContent;
		this.commentWriter = commentWriter;
		this.commentDate = commentDate;
	}

	public int getCommentNo() {
		return commentNo;
	}

	public void setCommentNo(int commentNo) {
		this.commentNo = commentNo;
	}

	public String getCommentContent() {
		return commentContent;
	}

	public void setCommentContent(String commentContent) {
		this.commentContent = commentContent;
	}

	public String getCommentWriter() {
		return commentWriter;
	}

	public void setCommentWriter(String commentWriter) {
		this.commentWriter = commentWriter;
	}

	public Date getCommentDate() {
		return commentDate;
	}

	public void setCommentDate(Date commentDate) {
		this.commentDate = commentDate;
	}

	@Override
	public String toString() {
		return "BoardComment [commentNo=" + commentNo + ", commentContent=" + commentContent + ", commentWriter="
				+ commentWriter + ", commentDate=" + commentDate + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(commentContent, commentDate, commentNo, commentWriter);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BoardComment other = (BoardComment) obj;
		return Objects.equals(commentContent, other.commentContent) && Objects.equals(commentDate, other.commentDate)
				&& commentNo == other.commentNo && Objects.equals(commentWriter, other.commentWriter);
	}
	
}
