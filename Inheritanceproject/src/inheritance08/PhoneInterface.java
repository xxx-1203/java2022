package inheritance08;

interface PhoneInterface { // �������̽� ����
	final int TIMEOUT = 10000; // ��� �ʵ� ����

	void sendCall(); // �߻� �޼ҵ�

	void receiveCall(); // �߻� �޼ҵ�

	default void printLogo() { // default �޼ҵ�
		System.out.println("** Phone **");
	}
}
