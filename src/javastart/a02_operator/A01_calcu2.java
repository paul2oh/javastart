package javastart.a02_operator;

public class A01_calcu2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * ��������� : +, -, *, /, % %: ������ ������ : �ش� �������� ���� ������ ������ �κ� ó��
		 */
		// System.out.println("20%7="+(20%7));
		/*
		 * ��� 50���� 3���� ������ �ֱ�� �߽��ϴ�. 1��� ��� ������ �ְ�, ������ @@���� ���� ���� ���α׷��Ϸ��� �Ѵ�.
		 * �̶�, (����) ������ ��(����) ������ ����� (�����)�� args�� �޾Ƽ� ���������� ó���ϴ� ���α׷��� ����ٸ�..
		 * 
		 * 
		 * ���� ���� @@@ ���� ��� , ��, ����, �ٳ��� ���� ���� @@ �������� �ο� : @@ 1��� ������ �� ���� ����
		 * : @@@ ������ ���� : @@@
		 */
		/*
		 * int appleCnt = Integer.parseInt(args[0]); int pairCnt =
		 * Integer.parseInt(args[1]); int strawCnt = Integer.parseInt(args[2]);
		 * int bananaCnt = Integer.parseInt(args[3]); int tot = appleCnt
		 * +pairCnt+ strawCnt+bananaCnt;
		 */

		/*
		 * String fruitkind=args[0]; int fruitCnt=Integer.parseInt(args[1]); int
		 * personCnt=Integer.parseInt(args [2]); int
		 * cntPerPerson=fruitCnt/personCnt; int cntMod=fruitCnt%personCnt;
		 * //sysout+ctrl+space : ����Ű�� �ܿ������ Ǯ �ڵ� �ϱ�
		 * System.out.println("���� ���� : "+fruitkind);
		 * System.out.println("���� ���� : "+fruitCnt );
		 * System.out.println("�������� �ο� : "+personCnt );
		 * System.out.println("1��� ������ �� ���� ���� : "+cntPerPerson );
		 * System.out.println("������ ���� : "+cntMod );
		 */

		/*
		 * 12/26 ���� �Ʒ������� ������ args ������ �޾Ƽ� ó���ϼ���.
		 * 
		 * @@@ : args������ �޾Ƽ� ó�� ### : ����ó���ؼ� ��Ÿ���� �κ�..
		 * 
		 * 
		 * 
		 * �����������α׷�.. �� : @@@@0 ex) 3-4��, ������а� NO �̸� ���� ���� ���� ���� ���(�Ǽ�)
		 * ## @@@1 @@2 @@3 @@4 ## ## ## @@@5 @@6 @@7 @@8 ## ##
		 * 
		 * LOOP������ �ذ� ����
		 */
		String ban = args[0];
		String Aname = args[1];
		int Akorean = Integer.parseInt(args[2]);
		int Amath = Integer.parseInt(args[3]);
		int Aenglish = Integer.parseInt(args[4]);
		int Atot = Akorean + Amath + Aenglish;
		double Aavg = Atot / 3.0; // ����/����=���� ����/�Ǽ�=�Ǽ�
		String Bname = args[5];
		int Bkorean = Integer.parseInt(args[6]);
		int Bmath = Integer.parseInt(args[7]);
		int Benglish = Integer.parseInt(args[8]);
		int Btot = Bkorean + Bmath + Benglish;
		double Bavg = Btot / 3.0;
		int no = 0;

		// sysout+ctrl+space : ����Ű�� �ܿ������ Ǯ �ڵ� �ϱ�
		System.out.println("�� : " + ban);
		System.out.println("===========================");
		System.out.println(" NO\t�̸�\t����\t����\t����\t����\t���");
		System.out.println(
				(no + 1) + "\t" + Aname + "\t" + Akorean + "\t" + Amath + "\t" + Aenglish + "\t" + Atot + "\t" + Aavg);
		System.out.println(
				(no + 2) + "\t" + Bname + "\t" + Bkorean + "\t" + Bmath + "\t" + Benglish + "\t" + Btot + "\t" + Bavg);
	}
}
