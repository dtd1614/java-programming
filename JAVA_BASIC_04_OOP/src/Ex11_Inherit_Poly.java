class Pbase{
	int p = 100;
}
class Cbase extends Pbase{
	int c = 200;
}

class Dbase extends Pbase{
	
}

public class Ex11_Inherit_Poly {
	public static void main(String[] args) {
		Cbase cbase = new Cbase();
		System.out.println(cbase);
		
		// 다형성
		Pbase pbase = cbase;
		
		Cbase ccc = (Cbase)pbase; // down casting
	}
}
