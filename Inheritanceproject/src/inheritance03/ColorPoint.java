package inheritance03;

public class ColorPoint extends Point{
	private String color;
	public ColorPoint (int x, int y, String color) {
		super(x, y); //이 메소드에서 반드시 처음 위치에 있어야 한다
		this.color=color;
	}
	public void showColorPoint() { // 컬러 점의 좌표 출력
		System.out.print(color);
		showPoint(); // Point 클래스의 showPoint() 호출
		}
}
