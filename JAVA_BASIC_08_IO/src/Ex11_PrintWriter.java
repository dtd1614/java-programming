/*
출력 형식을 정의 (format)
1. printf()
2. String.format()
3. I/O printWriter( 출력형식정의 )

현업 ) 세금계산서, 지출결의서, 품의서(휴가, 결근 ....)
위에 있는 것들을 구현하려면?
1. html (한땀 한땀..... 힘듬)
2. 회사에서는 레포팅 툴 (오즈, 크리스탈 레포트)
 */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Ex11_PrintWriter {
	public static void main(String[] args) {
		/*
		try {
			PrintWriter pw = new PrintWriter("C:\\KOSATEMP\\homework.txt");
		    pw.println("*******************************************");
		    pw.println("***************HOMEWORK********************");
		    pw.printf("%3s : %5d %5d %5d %5.1f", "아무개",100,88,90,(float)((100+88+90)/3));
		    pw.println();
		    pw.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    */

		//homework.txt  >> PrintWriter 형식을 정의 해서 write
		//read Line 단위  BufferedReader
		FileReader fr = null;
		BufferedReader br = null;
		try {
		    fr = new FileReader("C:\\KOSATEMP\\homework.txt");
		    br = new BufferedReader(fr);
		    String s="";
		    while((s = br.readLine()) != null) {
			    System.out.println(s);
		    }
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				br.close();
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}