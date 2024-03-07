package kr.or.kosa.utils;

import java.io.IOException;

/*
설계도

A 팀장
B 팀원

A 팀장 클래스 한개 줄테니 사용시 예외처리 좀 하고 해 .... 믿음 (x)
고민)
B 팀원 내 클래스 사용시 강제로 예외를 처리 .... throws 복수형
 */
public class ExClass {	
	
	public ExClass(String path) throws IOException, NullPointerException{
		 System.out.println("path : " + path);
	}
	
}

