/*
클래스는 == 타입 == 설계도 

클래스의 기본적인 구성요소 (설계도라고 판단할 수 있는 최소한의 기준)
속성 + 기능
필드 + 함수 + 생성자

필드( member field ) >> 데이터, 정보를 담고 있다. >> 고유 정보, 상태 정보, 부품 정보 >> variable
함수 ( method ) >> 기능 (행위) >> 자동차 >> 달린다, 멈춘다, 소리가 난다, 문을 연다 ..... >> 기능 하나당 함수 한개
+ 
추가적으로 함수(특수한 함수) 생성자 (특수한 목적의 함수) >> 초기화 >> 객체 생성시 >> member field 초기화 (강제)
>> member field (캡슐화) >> getter, setter (read, write)

class 설계도 {
	고유 정보
	상태 정보
	부품 정보
	
	기능 (행위)
}
재사용성 ..... 같은 자동차 찍어내는 것 (붕어빵)

클래스, 필드, 생성자 함수, 일반 함수 : 영역 (scope) >> 생성되는 위치 or 접그자 (한정자, 수정자)

장소(위치) : package >> 구분하기 위한 폴더 >> 기반 or 클래스 내부, 함수 내부, 제어문 내부
접근자 : public, private, default, protected

kr.or.kosa.common 안에 Car 클래스 생성 : public class Car{} 
kr.or.kosa.common 안에 AirPlane 클래스 생성 : class AirPlane {} // 컴파일러는 자동으로 default class AirPlane{}
>> 의도 : AirPlane 같은 폴더에서만 사용가능 

kr.or.kosa.model 안에 CarModel {} >> Car 사용가능 (public) >> AirPlan (default) 안되요

>> default 같은 폴더(package) 안에서 사용 가능
>> 연습용 .... 특정 클래스를 도와주는 helper 제안적
 */

class Dept{
	int deptNo; // default
	public String dname; // 의미가 X
	private int count; // 의마가 O 감추다, 숨기다.....
						// int count >> default
						// 설계자 의도 : 클래스 내부 자유... (내부에서만 사용)
						// 설계자 의도 : 직접 할당되어서는 안된다 ... 간접할당 (값을 제한, 원하는 형태로)
						// public 함수, 특수한 목적 : getter, setter
	// 함수
	// read (읽기 전용) : private 자원
	public int getCount() {
		return count;
	}
	
	// write (쓰기 전용) : 간접 할당
	public void setCount(int num) {
		//count = num;
		if(num < 0) {
			count = 0;
		}else {
			count = num;
		}
	}
}

public class Ex01_Main {

	public static void main(String[] args) {
		Dept dept = new Dept();
		dept.setCount(-100);
		System.out.println(dept.getCount()); // 0.....
	}

}
