package Test;

class Truckmain {
	public static void main(String[] args){
		Truck mytruck = new Truck(); //ny trukŬ������ ����Ű�� ��ä����
		//carŬ������ �ִ� ��� �ʹ��� ���ٰ���
		mytruck.carname = "����Ƽ��";
		mytruck.ton = 3;
		mytruck.velocity = 100;
		System.out.println("���� Ʈ���� " + mytruck.color + "�̴�.");
		System.out.println(mytruck.carname+"�� "+mytruck.ton +"���� ���� �� �ִ�");
	}
}