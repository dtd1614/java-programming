/*
Today Point
상속관계에서 override : 상속 관계에서 자식이 부모의 함수를 [재정의]
[상속관계]에서 [자식클래스]가 [부모클래스]의 [메서드]를 [재정의](내용을 바꿈)

재정의 : 틀은 변화가 없고 (함수의 이름, 타입) >> 내용만 변화 ({중괄호 블럭 안에 코드만 ....})

 */

class Point2{
	int x = 4;
	int y = 5;
	
	String getPosition() {
		return this.x + ", " + this.y;
	}
}

class Point3D extends Point2{
	int z = 6;
	
	@Override // 컴파일러에게 코드 작성 문법 에러 체크 하도록 강제 (툴)
	String getPosition() {
		return super.getPosition() + ", " + this.z;
	}
}

public class Ex04_Inherit_override {
	public static void main(String[] args) {
		Point3D p = new Point3D();
		System.out.println(p.getPosition());
	}
}