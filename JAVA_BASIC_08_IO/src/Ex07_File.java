/*
파일, 폴더를 다루는 클래스
JAVA : File 클래스 (파일, 폴더) >> 파일생성, 삭제 .... 폴더 생성, 삭제 >> 하나의 클래스

>> a.txt 생성, 삭제, 정보 read
>> Temp 생성, 삭제, 정보 read

경로
절대경로 : C:\, D:\ >> C:\\Temp\\a.txt
상대경로 : 현재 파일 중심 >> ../ >> /

 */

import java.io.File;

public class Ex07_File {
	public static void main(String[] args) {
		String path = "C:\\KOSATEMP\\file.txt";
		
		File f = new File(path);
		
		// File 클래스 >> 파일의 다양한 분석 가능
		System.out.println("파일(폴더) 존재 : " + f.exists());
		System.out.println("너 폴더니 : " + f.isDirectory());
		System.out.println("너 파일이니 : " + f.isFile());
		
		// 내가 가지고 있는 경로에서
		// 원하는 정보 추출하기
		System.out.println("파일명 : " + f.getName()); //file.txt
		System.out.println("절대경로 : " + f.getAbsolutePath());
		System.out.println("파일크기 : " + f.length() + "byte");
		System.out.println("부모경로 : " + f.getParent());
	}
}