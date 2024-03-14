import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex11_Map_Interface {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<String, String> map = new HashMap<>();
		map.put("myid", "mypwd");
		
		while(true) {
			System.out.print("id : ");
			String id = sc.nextLine().replace(" ", "").toLowerCase();
			System.out.print("pwd : ");
			String pwd = sc.nextLine().replace(" ", "");
			
			if(map.containsKey(id) & map.get(id).equals(pwd)) {
				System.out.println("welcome");
				break;
			}else if(!map.containsKey(id)) {
				System.out.println("not existed id");
			}else if(!map.get(id).equals(pwd)) {
				System.out.println("not existed pwd");
			}
		}
	}
}
