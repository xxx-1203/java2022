package Textinheritance03;

public class CircleMainTest {
	public static void main(String[] args) {
		CircleArea_Exam cp = new CircleArea_Exam();

		// System.out.println("원의 면적은 " + cp.area(10));
		// area() 메소드는 접근지정자가 private으로 지정 되어서
		// CircleMainTest클래스에서 접근 불가하다
		System.out.println("원의 둘레는 " + cp.round(10));
		//round() 메소드는 접근지정자가 protected로 지정되어 상속 관계에 있는 클래스 또는 동일한 패키지 속 클래스에서 접근 가능
		
	}
}
