package com.bs.controller;

import java.util.List;
import java.util.Map;

import com.bs.dto.BoardDTO;
import com.bs.model.service.BoardService;
import com.bs.view.MainView;

public class BoardController {
	private BoardService service = new BoardService();
	private MainView view = new MainView();

	public void mainMenu() {
		new MainView().mainMenu();
	}
	
	public void selectAllBoard() {
		List<BoardDTO> board = service.selectAllBoard();
		new MainView().printBoards(board);
		
	}
	public void selectSearchBoard() {
		//검색할 항목(컬럼명), 검색어
		Map param = view.inputSearch();
		List<BoardDTO> boards = service.searchBoard(param);
		view.printBoards(boards);
		
		
	}
}