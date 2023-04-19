package com.bs.view;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.bs.controller.BoardController;
import com.bs.dto.BoardDTO;

public class MainView {
	
	public void mainMenu() {
		BoardController controller = new BoardController();
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("==== 게시글 관리 프로그램 ===="	);
			System.out.println("1. 게시글 조회");
			System.out.println("2. 게시글 항목(제목,내용,작성자) 조회하기");
			System.out.println("0. 프로그램 종료");
			System.out.print("입력 : ");
			int cho = sc.nextInt();
			switch(cho) {
			case 1 : controller.selectAllBoard();break;
			case 2 : controller.selectSearchBoard();break;
			case 0 : 
				System.out.println("프로그램 종료합니다.");
				return;
			default	:
				System.out.println("잘못입력하셧습니다 다시입력해주세요.");
			}
		}
		
	}
	public void printBoards(List<BoardDTO> board) {
		System.out.println("==== 조회 결과 ====");
		if(board.isEmpty()) {
			System.out.println("조회된 게시글이 없습니다.");
		}else {
			
			board.forEach(e-> System.out.println(""+e.getComments().size()+e));
		}
		System.out.println("================");
	}
	public Map inputSearch() {
		Scanner sc = new Scanner(System.in);
		System.out.println("==== 게시글 항목별검색 ====");
		System.out.println("항목 1. 제목 2. 내용 3. 작성자 : ");
		int colCho = sc.nextInt();
		sc.nextLine();
		String col = "";
		switch(colCho) {
			case 1 : col = "board_title";break;
			case 2 : col = "board_content";break;
			case 3 : col = "board_writer";break;
		}
		System.out.print("검색어 : ");
		String keyword = sc.nextLine();
		return Map.of("col",col,"keyword",keyword);
		
		
		
	}
}	
