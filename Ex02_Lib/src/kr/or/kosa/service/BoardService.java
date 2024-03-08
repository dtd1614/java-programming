package kr.or.kosa.service;

import kr.or.kosa.dto.Board;

public class BoardService {
	
	public void Test() {
		Board board = new Board();
		board.setBoardnum(0);
		board.setTitle("first");
		board.setContent("Hello World");
		
		Board board2 = new Board(2, "second", "Bye World");
		System.out.println(board.toString());
	}
}
