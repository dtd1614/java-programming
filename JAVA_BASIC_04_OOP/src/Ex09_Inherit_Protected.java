import kr.or.kosa.Bird;

class Bi extends Bird{

	@Override
	protected void moveFast() {
		super.moveFast();
	}
	
}
public class Ex09_Inherit_Protected {
	public static void main(String[] args) {
		Bi bi = new Bi();
		bi.fly();
		bi.moveFast();
	}
}
