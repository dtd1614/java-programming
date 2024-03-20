/*
보조 스트림
DataOutPutStream
DataInPutStream

장점
JAVA 가 지원하는 8가지 기본 타입별로 write , read 기능 제공
단 DataOutPutStream >> DataInPutStream 서로 호환

성적.txt  (규칙 정의)
100,50,80...Enter
55,80,60....Enter

Line 단위로 read >> 100,50,80 >> split >> Array >> 정수 타입 >> 합 , 평균

해결:
DataOutPutStream
DataInPutStream
Byte  단위 데이터 처리 
*/

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex13_DataOutputStream {
	public static void main(String[] args) {
		int[] score = {100,60,55,95,50};
		FileOutputStream fos = null;
		DataOutputStream dos = null;
		
		try {
			  fos = new FileOutputStream("score.txt");
			  dos = new DataOutputStream(fos);
			  for (int i = 0; i < score.length; i++) {
				  dos.writeInt(score[i]); //정수값 그대로 file write
				  //조건 Byte Stream 반드시
				  //DataInPutStream  반드시 read
				  //채팅
				  //dos.writeUTF();
			  }
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				dos.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
