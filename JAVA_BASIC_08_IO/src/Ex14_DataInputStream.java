import java.io.DataInputStream;
import java.io.FileInputStream;

public class Ex14_DataInputStream {
	public static void main(String[] args) {
		// 파일 byte 값으로 정수 write (score.txt)
		
		int sum = 0;
		int score = 0;
		
		FileInputStream fis = null;
		DataInputStream dis = null;
		
		try {
			fis = new FileInputStream("score.txt");
			dis = new DataInputStream(fis);
			
			while(true) {
				score = dis.readInt();
				System.out.println("score int 값 : " + score);
				sum += score;
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			// 예외가 발생하면
			// 결과 확인
			System.out.println("sum 누적합 : " + sum);
		} finally {
			try {
				dis.close();
				fis.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}