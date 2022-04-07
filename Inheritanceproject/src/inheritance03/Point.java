package inheritance03;

public class Point {
	private int x, y;
	public Point() {
		x=0; y=0;
	}
	public Point(int x, int y) {
		this.x = x; this.y = y;
	}
	public void showPoint() { // 점의 좌표 출력
		System.out.println("(" + x + "," + y + ")");
	}
}
