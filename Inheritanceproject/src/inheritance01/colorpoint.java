package inheritance01;

public class colorpoint extends point{
	private colorpoint color;
	public void setColor (String Color) {
		this.color = color;
	}
	public void showcolorpoint() {
		System.out.print(color);
		showPoint(); // Point 클래스의 showPoint() 호출
	}

}
