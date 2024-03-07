/*
게임 CD PC설치
1. 설치파일 C:\Temp >> 복사
2. 복사한 파일 >> 프로그램 설치
3. 정상 설치 >> C:\Temp 복사한 설치파일 삭제
4. 비정상 설치 >> 강제 종료 >> C:\Temp 복사한 설치파일 삭제
 */

import java.io.IOException;

public class Ex03_finally {
	
	static void copyFiles() {
		System.out.println("copy files");
	}
	
	static void startInstall(){
		System.out.println("install ...");
	}
	
	static void deleteFile(){
		System.out.println("복사했던 파일을 삭제");
	}
	
	public static void main(String[] args) {
		
		try {
			copyFiles();
			startInstall();
			// 개발자(사용자) 인위적으로 예외 만들어 사용 가능 
			throw new IOException("install 도중 문제발생 ....");
		}catch (Exception e) { //생성된 예외 객체의 주소가 e 변수에 전달
			System.out.println(e.getMessage());
		}finally {
			// 강제 실행 블럭
			// 정상, 비정상 무조건 실행
			// POINT 함수가 강제로 return 하더라도 finally는 강제로 실행
			deleteFile();
		}
		
	}
}
