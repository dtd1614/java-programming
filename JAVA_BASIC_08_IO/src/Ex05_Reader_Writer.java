/*
문자 기반 데이터 다루기
내부적으로 char[] 형태로 ....

String 클래스 >> 내부적으로 >> 저장 >> char[]
Reader
Writer

대상
File

FileReader
FileWriter

 */

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ex05_Reader_Writer {
	public static void main(String[] args) {
		FileReader fr = null;
		FileWriter fw = null;
		
		try {
			fr = new FileReader("Ex01_Stream.java"); //read
			fw = new FileWriter("copy_Ex01.txt"); // 대상이 없으면 create 파일
			
			int data = 0;
			while((data = fr.read()) != -1) {
				//System.out.println((char)data); //char 정수 타입
				if(data != '\n' && data != '\r' && data != '\t' && data != ' ') {
					fw.write(data);
				}
				// 압축파일
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
