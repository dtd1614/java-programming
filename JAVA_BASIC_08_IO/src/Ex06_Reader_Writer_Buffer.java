import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;

public class Ex06_Reader_Writer_Buffer {
	public static void main(String[] args) {
		FileReader fr = null;
		
		BufferedReader br = null;
				
		try {
			fr = new FileReader("Ex01_Stream.java");
			br = new BufferedReader(fr);
						
			// 장점 (Line 단위) 엔터를 기반으로 한 줄씩 read, write
			String line = "";
			for(int i = 0; (line = br.readLine()) != null; i++) {
				System.out.println(line);
			}
		} catch (Exception e) {
			
		}
	}
}
