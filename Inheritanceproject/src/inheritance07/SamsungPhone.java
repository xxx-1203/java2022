package inheritance07;

class SamsungPhone implements PhoneInterface { // �������̽� ����
	// PhoneInterface�� ��� �߻� �޼ҵ� ����
	@Override
	public void sendCall() {
	System.out.println("������������");
	}
	@Override
	public void receiveCall() {
	System.out.println("��ȭ�� �Խ��ϴ�.");
	}
	// �޼ҵ� �߰� �ۼ�
	public void flash() { System.out.println("��ȭ�⿡ ���� �������ϴ�."); }
}
