package javastart.a05_loop;

public class A06_break_continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * break: �ݺ������� ���μ����� �ߴ��ϰ��� �� ��, ���ȴ�. �Ϲ������� ���ǹ��� �Բ� �Ͽ�, �ش� ���ǿ� �ش��� ��,
		 * ���μ����� �ߴܽ�Ų��..
		 */

		// 3�ܿ��� 3*5 =15�� �����ϰ��� �Ѵ�...
		System.out.println("break�� ���");
		for (int cnt = 1; cnt <= 9; cnt++) {
			// System.out.println("3*"++"="+);
			if (cnt == 5) {
				break;// �ش� ���μ����� �ߴܽ�Ų��..
			}
			System.out.println(3 + "*" + cnt + "=" + (3 * cnt));
		}
		/*
		 * continue:�ݺ������� Ư�� ���μ����� �ߴܽ�Ű��, �� ���� ���μ����� �����ϰ��� �� �� ����..
		 */
		System.out.println("continue�� ���");
		for (int cnt = 1; cnt <= 9; cnt++) {
			// System.out.println("3*"++"="+);
			if (cnt == 5) {
				continue;// �ش� ���μ����� �ߴܽ�Ų��..
			}
			System.out.println(3 + "*" + cnt + "=" + (3 * cnt));
		}

		/*
		 * Ȯ�ο��� 1�ܰ� ������ Ư�� �������� �ܼ��� �Է¹��� ��, ex) int grade =5; //args[0]=5 ������
		 * ����. �ߴ��ؾ��� 5*7 = 25 //args[1]=7 ������ ����.
		 * 
		 * 
		 * 
		 */
		System.out.println("===");
		boolean jj = false;
		for (int grade = 2; grade <= 9; grade++) {

			for (int num = 1; num <= 9; num++) {
				System.out.println(grade + "*" + num + "=" + (grade * num));
				if (num == 7 &&grade == 5  ) {
					jj = true;
					break;
				}
			}
			
			if (jj == true) {
				break;
			}
		}
		System.out.println("====");
		
		//1-1 : 1~100���� �ջ��� �ϴµ�, 50�� ���� �ջ� ������� ���. ��� : 1~100 ���� �ջ�(50����) : ###
		
		
		
		
		

		/*
		 * 2�ܰ� Scanner s = new Scanner(System.in); ���� �ܺ� ������ s.nextInt() : �����͸�
		 * ����.. �Է¹���.. for(;;) ���� ���� ó��..
		 * 
		 * �޴��� �����ϼ���. 1.�ѽ� 2.�Ͻ� 3.�߽� 0.����ó��.. 1�� �Է��ϸ� �ѽ��ֹ� 3�� �Է��ϸ� �߽��ֹ� 0�� �Է�����
		 * ��, �ֹ� �Ϸ�.. ��Ÿ �Է� : �ֹ���ȣ�� �����ϴ�.
		 * 
		 * continue ��� ��� 1~100 ���� �ջ��� �ϴµ�, 10������ ���� �ջ� ����� �Ʒ��� ���� ��Ÿ������.
		 * 1+2+3+4+5+6+7+8+9+ 11................ 91
		 * �Ѱ�
		 */

	}// main

}
