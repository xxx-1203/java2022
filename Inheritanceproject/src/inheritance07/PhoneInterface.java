package inheritance07;

interface PhoneInterface { // �������̽� ����
		final int TIMEOUT = 10000; // ��� �ʵ� ����

		void sendCall(); // �߻� �޼ҵ�

		void receiveCall(); // �߻� �޼ҵ�

		default void printLogo() { // default �޼ҵ�
			// default�� ������ ������ �Ϲ� �޼ҵ尡 �Ǳ� ������ ����
			// ���α׷��ӵ��� �������̽����� �Ϲ� �޼ҵ带 �ۼ��� �� �ֵ���

			System.out.println("** Phone **");
		}
}
