package javastart.a01_hello;

public class A02_variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * ���� : Ư���� �����Ϳ� ���� ������� �ٸ��� ó���� ��,
		 * 		  ����ϴ� ����������..
		 * 		  ũ�� ���ڿ��� �����ϴ� ������ : String ���ڿ� ��ü , char : ��������
		 * 		  ���ڸ� �����ϴ� ������ : int, double
		 */
		
		/*
		 * ���α׷� ����..
		 * 
		 * �Է��� �̸��� ���̸� �Ʒ� �������� ����ϼ���
		 * 
		 * =============================
		 * �̸� : @@@@ @-- ����
		 * ���� : @@@
		 * ============================
		 */
		//������ type���� �� ������ �̸��� ���ϸ�, 
		//Ư��data�� �Ҵ��Ѵ�.
		//type�� �����Ǹ� �Ҵ��� �� �ִ� �����͸� �־�� �ȴ�.
		//������ ���浵 �����ϰ�, ��Ȱ���� �� �� �ִ�.
		String name = "ȫ�浿";
		int age =24;
		
		System.out.println("=========");
		System.out.println("�̸� : "+name+"");
		System.out.println("���� : "+age);
		System.out.println("=========");
		name = "�ű浿";
		System.out.println("�̸� : "+name+"");
/*
 * Ȯ�� ����...
 * ������ Ȱ���Ͽ�,
 * ��� ��,�̸�, ���������� �Ʒ� �������� ����ϼ���..
 * 
 * 	----------------
 * ���� ��� ���� @@@@@ �̸�, 
 * �̸��� @@@ �Դϴ�.
 * �����з� ���������� @@@�⵵ �Դϴ�. args�� "@@ @@@" -> ��������� �Է� ����
 * -----------------
 * 
 */
		String address = "����Ư���� ���α� ����1.2.3.4����";
		//������ �̸��� ������ ���� ���α׷� ������ �������� ���Ѵ�.
		//String name ==> String name01
		//����  ���� int �Ǽ�(�Ҽ�������) double
		String name01 = "������ ���� ����";
		int graduateYear=2016;
		System.out.println("----------------");
		System.out.println("���� ��� ���� "+address+" �̸�,");
		System.out.println("�̸��� "+name01+" �Դϴ�.");
		System.out.println("�����з� ���������� "+graduateYear+"�⵵ �Դϴ�.");
		System.out.println("----------------");
	}

}
