package Textinheritance04;

public class ShipName {
	public static void search(Ship s) {
		if (s instanceof MyShip) {
			MyShip b = (MyShip) s; // ᄀ
			System.out.println("MyShip 이름 : " + b.Name());
		} else if (s instanceof YourShip) {
			YourShip b = (YourShip) s; // ᄂ
			System.out.println("YourShip 이름 : " + b.Name());
		}
	}
}
