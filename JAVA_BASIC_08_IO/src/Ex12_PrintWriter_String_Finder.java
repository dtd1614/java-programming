import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Ex12_PrintWriter_String_Finder {
	
	String baseDir = "C:\\KOSATEMP";
	String word = "hello"; //검색할 단어
	String savetxt = "result.txt"; // hello 단어가 들어있는 파일 정보
			
	void find() throws IOException{
		File dir = new File(baseDir);
		if(!dir.isDirectory()) {
			System.out.println("유용한 폴더가 아니에요.");
			System.exit(0);
		}
		
		PrintWriter writer = new PrintWriter(new FileWriter(savetxt)); // 문법적으로 수업이니까
		BufferedReader br = null;
		
		File[] files = dir.listFiles();
		for (int i = 0; i < files.length; i++) {
			if(!files[i].isFile()) { // 파일이 아니면
				continue;
			}
			// 파일이면
			br = new BufferedReader(new FileReader(files[i]));
			// a.txt >> 내용이 기록
			// a.txt 내용을 한 줄씩
			String line = "";
			while((line = br.readLine()) != null) {
				// 단어 검색
				if(line.indexOf(word) != -1) {
					// a.txt 한줄씩 읽엇 그 문장 안에 hello 단어가 하나라도 존재하면
					writer.write("word = " + files[i].getAbsolutePath() + "\n");
				}
			}
			writer.flush();
		}
		br.close();
		writer.close();
	}
	
	public static void main(String[] args) {
		Ex12_PrintWriter_String_Finder wordFinder = new Ex12_PrintWriter_String_Finder();
		try {
			wordFinder.find();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}