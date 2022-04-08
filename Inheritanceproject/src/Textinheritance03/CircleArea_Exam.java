package Textinheritance03;

public class CircleArea_Exam {
	private double area(int r) {
		return 3.14 * r * r;
	}

	protected double round(int r) { // 원의 둘레 구하기
		return 2 * 3.14 * r;
	}
}
