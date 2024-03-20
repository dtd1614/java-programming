import kr.or.kosa.utils.Singleton;

public class Ex08_Singleton {

	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		Singleton s3 = Singleton.getInstance();
		Singleton s4 = Singleton.getInstance();
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		/*
		 kr.or.kosa.utils.Singleton@2f92e0f4
		 kr.or.kosa.utils.Singleton@2f92e0f4
		 kr.or.kosa.utils.Singleton@2f92e0f4
		 kr.or.kosa.utils.Singleton@2f92e0f4 
		*/
	}
}