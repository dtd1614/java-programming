/*
I/O
input(입력) / output(출력)
 */
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class Ex01_Stream {
	public static void main(String[] args) {
		//byte (-128 ~ 127)
		byte[] inSrc = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		byte[] outSrc = null;
		
		//빨대 > stream > 메모리 > read, write
		ByteArrayInputStream input = null; //read stream
		ByteArrayOutputStream output = null; //write stream
		
		input = new ByteArrayInputStream(inSrc);
		output = new ByteArrayOutputStream();
		
		System.out.println("outSRc before : " + Arrays.toString(outSrc));
		
//		while(input.read() != -1) {
//			System.out.println(input);
//			// read 함수는 내부적으로 값을 읽고 next 이동
//		}
		
		int data = 0;
		while((data = input.read()) != -1) {
//			System.out.println(data);
			output.write(data); // 출력 통로에(빨대 통로)에 data read 데이터 담고 있는 곳
			// write 대상 data가 아니고 ByteArrayOutputStream 통로
		}
		outSrc = output.toByteArray(); // 자신이 가지고 있는 데이터 Byte[] 만들어서 담고 주소 리턴
		System.out.println("outSrc after : " + Arrays.toString(outSrc));
 	}
}