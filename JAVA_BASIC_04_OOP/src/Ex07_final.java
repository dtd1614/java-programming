/*
변수 <-> 상수
상수 : 한번 값이 [초기화]되면 변경 불가
상수 자원 : 고유값 >> 수학 PI, 버전번호, 시스템번호 (v1.0.0.1)
상수 관용적으로 대문자

java : final int Num = 0;

final 키워드
1. final class Car{} >> 상속 금지 >> extends 불가]
2. public final void print(){} : 상속관계 재정의 금지
3. final int AGE = 10;



카드놀이 54장
*/
class Vcard{
	final String KIND = "heart";
	final int Num = 1;
}

class Vcard2{
	final String KIND;
	final int Num;
	
	//Vcard2(){}
	
	Vcard2(String KIND, int Num){
		this.KIND = KIND;
		this.Num = Num;
	}

	@Override
	public String toString() {
		return "KIND : " + KIND + ", Num : " + Num;
	}
}

/*
final : 한번 값이 정해지고 나면 값을 바꿀 수 없는 필드
static final : 모든 영역에서 고정된 값으로 사용하는 상수 ) Math.PI
 */

public class Ex07_final {
	public static void main(String[] args) {
		Vcard2 v2 = new Vcard2("spade", 1);
		System.out.println(v2.toString());
	}

}
