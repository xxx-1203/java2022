package inheritance01;

public class ColorpointEx {

	public static void main(String[] args) {
		point p = new point(); // Point ��ü ����
		p.set(1, 2); // Point Ŭ������ set() ȣ��
		p.showPoint();
		
		colorpoint cp = new colorpoint(); // ColorPoint ��ü
		cp.set(3, 4); // Point�� set() ȣ��
		cp.setColor("red"); // ColorPoint�� setColor() ȣ��
		cp.showcolorpoint(); // �÷��� ��ǥ
	}

}
