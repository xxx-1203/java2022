package inheritance03;

public class ColorPoint extends Point{
	private String color;
	public ColorPoint (int x, int y, String color) {
		super(x, y); //�� �޼ҵ忡�� �ݵ�� ó�� ��ġ�� �־�� �Ѵ�
		this.color=color;
	}
	public void showColorPoint() { // �÷� ���� ��ǥ ���
		System.out.print(color);
		showPoint(); // Point Ŭ������ showPoint() ȣ��
		}
}
