/*
원은 도형이다
경찰은 권총을 가지고 있다
원은 점을 가지고 있다

>> has ~ a (부품정보)
>> class 원 {점이라는 부품을 가진다. 점이라는 타입의 변수} 
>> class 점 {x, y}

class 경찰 {member field 권총(부품)}
class 권총 {}

원은 도형이다
삼각형은 도형이다
사각형은 도형이다

도형(분모) : 공통자원 : 추상화, 일반화 >> 색상, 그리다
원 : 구체화, 특수화 (자신만이 가지고 있는 특징) >> 한점, 반지름

점 : 좌표값(x, y)
원은 점을 가지고 있다
삼각형은 점을 가지고 있다
사각형은 점을 가지고 있다
---------------------------------------------
class Shape{색상, 그리다} >> 원, 삼각형, 사각형의 부모
class Point{좌표값} >> 원, 삼각형, 사격형의 부품

구체화, 특수화(Circle, Triangle)

 */
class Shape{
	String color = "gold";
	void draw() {
		System.out.println("도형을 그리다");
	}
}

class Point{
	int x;
	int y;
	
	Point(){
		this(1, 1); // 생성자를 호출하는 this
	}
	
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
}

// 원을 만드세요
// 정의 (원은 한 점과 반지름을 가지고 있는 도형이다)
// 1. 원은 도형이다
// 2. 원은 점을 가지고 있다
// 3. 원의 특수화되고 구체화된 내용은 : 반지름 과 한 점이다
// 원의 반지름 초기값은 10을 가진다
// 점의 좌표는 (10, 15)를 가진다
// 초기값을 설정하지 않으면 반지름과 점의 값을 입력받을수있다

class Circle extends Shape{
	Point point;
	int radius;
	
	Circle(){
		this(new Point(10, 15), 10);
	}
	
	Circle(Point point, int radius){
		this.point = point;
		this.radius = radius;
	}
}

/*
삼각형
3개의 점을 가지고 있다
 */ 
//class Triangle extends Shape{
//	Point x;
//	Point y;
//	Point z;
//	
//	public Triangle() {
//		this(new Point(1,2), new Point(3,4), new Point(5,6));
//	}
//	
//	Triangle(Point x, Point y, Point z) {
//		this.x = x;
//		this.y = y;
//		this.z = z;
//	}
//	
//	void trianglePoint() {
//		System.out.printf("x : (%d, %d)\t", x.x, x.y);
//		System.out.printf("y : (%d, %d)\t", y.x, y.y);
//		System.out.printf("z : (%d, %d)\t", z.x, z.y);
//		System.out.println();
//	}
//}

class Triangle extends Shape{
	Point[] points; 
	
	public Triangle() {
		this(new Point[] {new Point(1,2), new Point(3,4), new Point(5,6)});
	}
	
	Triangle(Point[] points) {
		this.points = points;
	}
	
	void trianglePoint() {
		for(Point point : points) {
			System.out.printf("(%d, %d)\t", point.x, point.y);
		}
	}
}

public class Ex02_Inherit_Composition {
	
	public static void main(String[] args) {
		Circle circle = new Circle();
		System.out.println(circle.radius);
		System.out.println(circle.color);
		System.out.println(circle.point.x);
		System.out.println(circle.point.y);
		circle.draw();
		
		Circle circle2 = new Circle(new Point(20,25), 10);
		
		Triangle tri = new Triangle();
		tri.trianglePoint();
	}
}
