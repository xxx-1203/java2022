package inheritance03;

public class Point {
	private int x, y;
	public Point() {
		x=0; y=0;
	}
	public Point(int x, int y) {
		this.x = x; this.y = y;
	}
	public void showPoint() { // ���� ��ǥ ���
		System.out.println("(" + x + "," + y + ")");
	}
}
