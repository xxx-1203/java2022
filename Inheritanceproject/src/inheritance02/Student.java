package inheritance02;

public class Student extends person{
	public void set() {
		age = 30; // ���� Ŭ������ ����Ʈ ��� ���� ����
		name = "ȫ�浿"; // ���� Ŭ������ public ��� ���� ����
		height = 175; // ���� Ŭ������ protected ��� ���� ����
		// weight = 99; // ����. ���� Ŭ������ private ���� �Ұ�
		setWeight(99); // private ��� weight�� setWeight()���� ���� ����
		}
}
