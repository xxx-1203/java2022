package Test;

class Truckmain {
	public static void main(String[] args){
		Truck mytruck = new Truck(); //ny truk클래스를 가리키는 개채변수
		//car클래스에 있는 모든 맵버에 접근가능
		mytruck.carname = "프론티어";
		mytruck.ton = 3;
		mytruck.velocity = 100;
		System.out.println("나의 트럭은 " + mytruck.color + "이다.");
		System.out.println(mytruck.carname+"는 "+mytruck.ton +"톤을 실을 수 있다");
	}
}