import java.io.File;

public class Ex08_File_Dir {
	public static void main(String[] args) { // java Ex08_File_Dir a b c
		//System.out.println(args[0]);
		if(args.length != 1) {
			//값이 없다면
			System.out.println("사용법 : java 파일명 [디렉토리명]");
			System.exit(0);
		}
		
		File f = new File(args[0]);
		if(!f.exists() || !f.isDirectory()) { // 존재하지 않거나 .... 디렉토리가 아니면
			System.out.println("유효하지 않은 경로 ....");
			System.exit(0);
		}
		
		// 실제 존재하는 경로 .... 폴더
		// POINT
		File[] files = f.listFiles();
		System.out.println(files.length);
		for(int i = 0; i < files.length; i++) {
			String name = files[i].getName();
			System.out.println(files[i].isDirectory() ? "[DIR]" + name : name);
		}
	}
}