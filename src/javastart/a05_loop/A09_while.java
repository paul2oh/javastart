package javastart.a05_loop;

public class A09_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * while(����){ �ݺ��� ���� ó��.. }
		 */

		/*
		 * int appleCnt = 0; while (appleCnt < 10) { appleCnt++; if (appleCnt ==
		 * 5) { System.out.println("5���� ����"); continue; }
		 * System.out.println("���" + appleCnt + "���� �����Ͽ����ϴ�.");
		 */
		/*
		 * do{ �ݺ��� ���μ����� ����, ������ ���� �ʴ��� 1���� ��µǰ� ó��.. }while(����);
		 */

		int visitCnt = 1;
		do {
			System.out.print("ȫ�浿 ���� �湮!!" + (visitCnt++) + "ȸ!!");
			visitCnt++;
		} while (visitCnt <= 10);
		System.out.println("����!!!");

	 }// main

}
