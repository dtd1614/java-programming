/*
File 처리 대상 >> DISK(C:, D:) >> 입출력 단위가 한 byte씩

힉생 여러명을 한 장소에 보낼때 각각 보내는 것이 아니고
버스에 태워서 한번에 보내서 처리

버스 : buffer
1. I/O 성능개설 (접근 횟수)
2. Line 단위 (엔터)
 */

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class Ex04_Stream_Buffer {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		try {
			fos = new FileOutputStream("data.txt");
			bos = new BufferedOutputStream(fos);
			
			for(int i = 0; i < 10; i++) {
				bos.write('A'); // data.txt
			}
			
			//bos.flush();
			/*
			JAVA Buffer : (8K : 8192byte)
			1. Buffer 안에 내용이 채워지지 않으면 스스로 비우지 않는다 (버퍼를 비우는 작업을 해야함)
			2. 강제로 비우기 : flush() or close() >> buffer close()는 내부적으로 flush() 작업이 일어남
			3. 개발 close() 자원해제 >> 내부적으로 flush()
			 */
		} catch (Exception e) {

		}finally {
			try {
				bos.close();
				fos.close();
			} catch (Exception e2) {
				
			}
		}
	}
}
