package Textinheritance02;

public class Leader extends Student{
	boolean boss;//학급회장
	
	//생성자 작성
	public Leader(String name, String hakbun, boolean boss) {
		super(name, hakbun);//상위 클래스의 매개변수 2개를 갖는 생성자 호출
		this.boss = boss;
	}
	
	//메소드 작성
	void isLeader() {
		if(boss)
			System.out.println(name+"은 학급회장이다");
		else
			System.out.println(name+"은 학급회장이 아니다");

	}
	
}
