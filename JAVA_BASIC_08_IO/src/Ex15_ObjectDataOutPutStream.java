/*
파일을 대상으로
객체를 write하고 read
객체를 분해시켜서 write (list.txt) >> 직렬화
객체를 조립해서 read >> 역직렬화
*/

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import kr.or.kosa.UserInfo;

public class Ex15_ObjectDataOutPutStream {
	public static void main(String[] args) {
		String filename = "UserData.txt";
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		ObjectOutputStream out = null;
				
		try {
			fos = new FileOutputStream(filename);
			bos = new BufferedOutputStream(fos);
			
			out = new ObjectOutputStream(bos);
			
			UserInfo u1 = new UserInfo("홍길동", "super", 100); // 완제품
			UserInfo u2 = new UserInfo("scott", "tiger", 50);
			
			out.writeObject(u1);
			out.writeObject(u2);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				out.close();
				bos.close();
				fos.close();
				System.out.println("파일생성 -> 버퍼 -> 직렬화 -> 파일 write");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
