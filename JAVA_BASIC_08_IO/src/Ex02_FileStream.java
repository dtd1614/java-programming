/*
Today Point

Byte 데이터를 read/write >> 그 대상이 파일 >> File >> a.txt

FileInputStream
FileOutputStream

게사판(파일 업로드 : 이미지, 엑셀 ....) read, write

I/O 자원은 개발자가 직접으로 자원을 해제 (워드 파일 편집 ... 편집기 통해서 열면) 다른 사람은 read ... 편집 end
>> close() >> 해제 >> 다른 누군가가 read, write
>> I/O 자원은 예외처리가 많아요 강제적으로 throws .........
 */

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex02_FileStream {
	public static void main(String[] args) {
		FileInputStream fs = null;
		FileOutputStream fos = null;
		
		String path = "C:\\KOSATEMP\\a.txt";
		
		try {
			fs = new FileInputStream(path);
			fos = new FileOutputStream("C:\\KOSATEMP\\new.txt");
			
			int data = 0;
			while((data = fs.read()) != -1) {
				System.out.println("정수 : " + data + " : " + (char)data);
				fos.write(data); // 출력 파일이 존재하지 않으면 create, write
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 정상 , 비정상 종료
			// 자원해제
			try {
				fs.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
