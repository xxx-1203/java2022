package Textinheritance03;

public class CircleMainTest {
	public static void main(String[] args) {
		CircleArea_Exam cp = new CircleArea_Exam();

		// System.out.println("���� ������ " + cp.area(10));
		// area() �޼ҵ�� ���������ڰ� private���� ���� �Ǿ
		// CircleMainTestŬ�������� ���� �Ұ��ϴ�
		System.out.println("���� �ѷ��� " + cp.round(10));
		//round() �޼ҵ�� ���������ڰ� protected�� �����Ǿ� ��� ���迡 �ִ� Ŭ���� �Ǵ� ������ ��Ű�� �� Ŭ�������� ���� ����
		
	}
}
