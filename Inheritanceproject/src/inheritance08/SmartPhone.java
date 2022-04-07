package inheritance08;

public class SmartPhone extends PDA implements MobilePhoneInterface, MP3Interface {
	@Override
	public void sendCall() {
		System.out.println("������ ������ ��������ӵ�");
	}

	@Override
	public void receiveCall() {
		System.out.println("��ȭ ��");
	}

	@Override
	public void sendSMS() {
		System.out.println("���ڽ�");
	}

	@Override
	public void receiveSMS() {
		System.out.println("���ڿ�");
	}

	// MP3Interface�� �߻� �޼ҵ� ����
	@Override
	public void play() {
		System.out.println("�����̵������Ӥ���������");
	}

	@Override
	public void stop() {
		System.out.println("���� ����");
	}

	// �߰��� �ۼ��� �޼ҵ�
	public void schedule() {
		System.out.println("���� ���� ��");
	}
	
}
