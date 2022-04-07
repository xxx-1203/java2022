package inheritance01;

public class ColorpointEx {

	public static void main(String[] args) {
		point p = new point(); // Point 객체 생성
		p.set(1, 2); // Point 클래스의 set() 호출
		p.showPoint();
		
		colorpoint cp = new colorpoint(); // ColorPoint 객체
		cp.set(3, 4); // Point의 set() 호출
		cp.setColor("red"); // ColorPoint의 setColor() 호출
		cp.showcolorpoint(); // 컬러와 좌표
	}

}
