package Textinheritance02;

public class Leader extends Student{
	boolean boss;//�б�ȸ��
	
	//������ �ۼ�
	public Leader(String name, String hakbun, boolean boss) {
		super(name, hakbun);//���� Ŭ������ �Ű����� 2���� ���� ������ ȣ��
		this.boss = boss;
	}
	
	//�޼ҵ� �ۼ�
	void isLeader() {
		if(boss)
			System.out.println(name+"�� �б�ȸ���̴�");
		else
			System.out.println(name+"�� �б�ȸ���� �ƴϴ�");

	}
	
}
