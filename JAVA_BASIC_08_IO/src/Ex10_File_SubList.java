/*
C:\\KOSATEMP의 파일과 디렉토리 정보를 조회할때,
디렉토리 안에 디렉토리가 있다면 하위 정보까지 추출할 수 있다.
 */

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Ex10_File_SubList {
	static int totalfiles = 0; // 전체 파일 개수
	static int totaldirs = 0; // 전체 폴더 개수

	static void printFileList(File dir) {
		System.out.println("Full Path : " + dir.getAbsolutePath());
		
		List<Integer> subdir = new ArrayList<Integer>();
		// 배열 안에서 Dir 구분하는 방법으로
		File[] files = dir.listFiles(); // 모든 파일과 폴더 목록
		for (int i = 0; i < files.length; i++) {
			String filename = files[i].getName(); // 폴더명, 파일명
			if(files[i].isDirectory()) {
				filename = "[DIR]" + filename;
				// 하위 디렉토리
				// 인덱스 정보를 저장
				subdir.add(i);
				// subdir[0] = 3; files >> [1.txt] [2.png] [aa.txt] [기러기] []
			}else {
				filename = filename + " / " + files[i].length() + "byte";
			}
			System.out.println(filename);
		}		
		// for end
		
		// 폴더 개수
		// 파일 개수		
		int dirnum = subdir.size(); // 현재 주어진 폴더의 하위 폴더 개수
		int filenum = files.length - dirnum; // 현재 주어진 폴더의 하위 파일 개수
		
		// 누적개수 (하위 폴더 자원)
		totaldirs += dirnum;
		totalfiles += filenum;
		
		System.out.println("[Current DirNum] : " + dirnum);
		System.out.println("[Current FileNum] : " + filenum);
		
		System.out.println("**********************************");
		
		/*
		POINT
		[0] > a.txt
		[1] > aaa 폴더 > a-1 폴더 , a-2 폴더
		[2] > bbb 폴더 > b-1 폴더 , b.txt , c.png
		 */
		
		for (int i = 0; i < subdir.size(); i++) {
			int index = subdir.get(i);
			printFileList(files[index]);
		}
	}
	
	public static void main(String[] args) {
		if(args.length != 1) {
			System.out.println("사용법 : java [실행할 파일명][경로명]");
			System.out.println("사용법 : java [Ex10_file][D:\\Temp]");
			System.exit(0);
		}
		
		File f = new File(args[0]);
		if(!f.exists() || !f.isDirectory()) {
			System.out.println("유효하지 않은 디렉토리입니다.");
			System.exit(0);
		}
		
		// 정상적인 dir 경로s
		printFileList(f);
		System.out.println("누적 총 파일수 : " + totalfiles);
		System.out.println("누적 총 폴더수 : " + totaldirs);

	}
}
