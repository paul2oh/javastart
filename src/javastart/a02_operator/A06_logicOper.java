package javastart.a02_operator;

public class A06_logicOper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * �������� : �񱳿�����(!=,==..)�� ������� 2�� �̻� �����Ͽ� ����ó�� �Ҷ�, ����Ѵ�. &&(and) : �ΰ���
		 * ������ �� ������ų �� ||(or) : �ΰ��� ���� ��, �ϳ��� ������ų �� !(not) : ������ �ݴ� ó��. false
		 * --> true, true --> false
		 * 
		 * ���ɿ� ���� �������� �����ϰ��� �Ѵ�. 8~18 : �������� 20%�� �ϸ� 4�̸�, 65�̻��� : ������ 100%(����)��
		 * �ϴ� ó���� �� �����ڸ� ���Ͽ� ó���Ͽ���.
		 */
		int age = 9; // args �����ε� �Է°���..
		boolean dis20 = (age >= 8 && age <= 18);
		// 8�� �̻��̰�, 18�� ������ �� 20%������ ���� ����
		System.out.println("������ 20%�����(8~18)?" + dis20);
		boolean disNopay = (age < 4 || age >= 65);
		// 4�� �̸��̰ų� ,65�� �̻��� ��, 100% ������ ���� ����
		System.out.println("��������" + disNopay);

		/*
		 * Ȯ�ο���.. �ش������ ��������� 70�� �̻��̰�, �������� 40�� �̸� ������ ���� ��, �հ�ó���� �Ѵٰ� �Ѵ�. �̻�
		 * �ش��ϴ� ���α׷��� �Ʒ��� �������� ����ϼ���. ���.. ���� ���� ���� : @@0 ���� : @@1 ���� : @@2 ���
		 * : @@ �հݿ��� : @@
		 */

		int korean = 99;
		int english = Integer.parseInt(args[1]);
		int math = Integer.parseInt(args[2]);
		double avg = (korean + english + math) / 3.0;
		boolean select_tf = (avg >= 70 && korean >= 40 && english >= 40 && math >= 40);
		// boolean ckMin = korean<40 || english<40 || math<40;
		// System.out.println(""�հݿ���:" + (!(ckMin)&& avg));
		System.out.println("��������" + "\n" + "����:" + korean + "\n" + "����:" + english + "\n" + "����:" + math + "\n" + "���:"
				+ avg + "\n" + "�հݿ���:" + select_tf);
		/*
		 * ���׿�����
		 * ����(��+��)?"�Ҵ��� ������(true)":"�Ҵ��� ������(false)";
		 */

	}

}
