package inheritance05;

class Shape { // ���� Ŭ����
	public Shape next;

	public Shape() {
		next = null;
	}

	public void draw() {
		System.out.println("Shape");
	}
}