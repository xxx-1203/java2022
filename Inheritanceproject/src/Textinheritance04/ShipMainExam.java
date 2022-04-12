package Textinheritance04;

public class ShipMainExam {
	public static void main(String[] args) {
		Ship myship = new MyShip(); //upcasing
		Ship yourship = new YourShip(); //upcasing
		ShipName.search(myship); // ᄃ
		ShipName.search(yourship); // ᄅ
	}
}
