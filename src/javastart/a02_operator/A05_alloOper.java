package javastart.a02_operator;

public class A05_alloOper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * ���Կ����� : �����͸� �Ҵ��� ��, ���̴� �����ڸ� ���Ѵ�. �⺻ int age=24;
		 * 
		 * �⺻ �����Ϳ� �ٽ� �����͸� �����Ͽ� �Ҵ� �Ҷ�. age += 10; cf) -=, *=, /=, %=
		 * 
		 * ���� ����� �������� 3ȸ 10���� ������Ų �� ������ ����ϼ���.
		 */
		int appleCnt = 25;
		appleCnt += 10;
		System.out.println("1ȸ ��, �� �������: " + appleCnt);
		appleCnt += 10;
		System.out.println("2ȸ ��, �� �������: " + appleCnt);
		appleCnt += 10;
		System.out.println("3ȸ ��, �� �������: " + appleCnt);

		/*
		 * ������ 3�������� ���� ������ 3,5,6���� �ʱ⿡ ������ �־���. 3ȸ 7���� ������ �� ��, ������ 3������ ������ �ִ�
		 * �� ������ ������ ����ϴ� ���α׷��� ����� ������.. ���
		 *
		 * ������1 ������2 ������3 �� 1ȸ @@@0 @@@1 @@@2 ### 2ȸ @@@3 @@@4 @@@5 ###
		 * 3ȸ @@@6 @@@7 @@@8 ###
		 */
		int BearOrange1 = 3;
		int BearOrange2 = 5;
		int BearOrange3 = 6;
		int tot1 = BearOrange1 + BearOrange2 + BearOrange3;
		System.out.println("\t\t" + "������1" + "\t\t" + "������2" + "\t\t" + "������3" + "\t\t" + "��");
		System.out.println("1ȸ" + "\t\t" + BearOrange1 + "\t\t" + BearOrange2 + "\t\t" + BearOrange3 + "\t\t" + tot1);
		BearOrange1 += 7;
		BearOrange2 += 7;
		BearOrange3 += 7;
		int tot2 = BearOrange1 + BearOrange2 + BearOrange3;
		System.out.println("2ȸ" + "\t\t" + BearOrange1 + "\t\t" + BearOrange2 + "\t\t" + BearOrange3 + "\t\t" + tot2);
		BearOrange1 += 7;
		BearOrange2 += 7;
		BearOrange3 += 7;
		int tot3 = BearOrange1 + BearOrange2 + BearOrange3;
		System.out.println("3ȸ" + "\t\t" + BearOrange1 + "\t\t" + BearOrange2 + "\t\t" + BearOrange3 + "\t\t" + tot3);

		/*
		 * ���� ������.
		 *  �����͸� 1������ ������Ű�� �����ڸ� ���Ѵ�.
		 *  cnt++ : ���絥���͸� 1������ ������Ų��. ��, ������ ���� ���ο� ������ �ȴ�.
		 *  ++cnt : ���絥���͸� 1������ ������Ű�µ�, ���� ���ο��� �����ȴ�.
		 *  cf) cnt-- , --cnt 
		 */
		int fruitCnt=1;
		System.out.println("������ ���� ���� ���μ��� ����:" +(fruitCnt++));
		System.out.println("������ ���� ���� ���μ��� ����:" +(++fruitCnt));
		
	}

}
