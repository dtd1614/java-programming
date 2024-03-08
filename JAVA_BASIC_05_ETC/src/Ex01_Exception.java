/*
 오류
 1. 에러(error) : 네트워크 장애, 메모리 누수, 하드웨어 > 개발자가 해결하지 못해요
 2. 예외 : 개발자가 코드 실수 발생 > 문제 발생 코드 > 수정 > 배포
 2.1. 컴파일시 .. 실행파일 안만들어져 (해결..)
 2.2. 런타임시 (실행도중에) 발생 > 강제 종료 > 문제가 생긴 시점 > 이후 코드가 실행이 안됨
 
 예외처리 > 프로그램 안정적으로 종료 > 원인 분석 > 코드 수정 > 배포
 try {
 
 }catch(Exception e <- new ArithmeticException("by zero")){
  문제파악
  보고자료: log, email
  강제 종료는 막는다.
 }finally{
  문제가 발생하던 발생하지 않던 강제적으로 실행되는 코드
  return 만나도 finally 강제 실행
  >> DB연결 > 접속 종료 > 자원해제 > close()
 }
 
 */

import lombok.Data;

public class Ex01_Exception {

	public static void main(String[] args) {
		
//		System.out.println("main start");
//		System.out.println(0/0);
//		System.err.println("main end");
		
		System.out.println("main start");

		try {
			System.out.println(0/0);
		} catch (Exception e) {
			// 문제 파악
			//System.out.println("문제발생 : " + e.getMessage());
			e.printStackTrace();
			// 처리 여부
			// 문제상황 전달 (log 기록, 메일)

}
		System.out.println("main end");
		
	}

}
