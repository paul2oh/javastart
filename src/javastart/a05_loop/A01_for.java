package javastart.a05_loop;

public class A01_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * for(�ʱⰪ;�Ѱ谪;����){
 * 		�ݺ�ó���� ����..
 */
		
		for(int cnt=5;cnt<=20;cnt+=5){
			System.out.println(cnt+"��°\t");
		}
		
		/*������ ġ��..
		 *  2*1=2 @@*@@=##
		 *  2*2=4
		 */
		int grade =2;
		System.out.println(""+grade+"��");
		for(int num=1; num<=9;num++){
			System.out.println(grade+"*"+num+"="+(grade*num));
		}
		/*
		 * 1�ܰ�
		 * 	1) 5~20���� 1������ �������� ����ϼ���. ex)5 6 7 8...
		 *  2) 30~100���� 5������ �������� ����ϼ��� ex)30 35 40 45
		 *  3) 1000���� 900 ���� ���ҽ��� 2������ ����ϼ��� ex)1000 998 996
		 *  
		 * 2�ܰ� : if �� Ȱ��, \n, \t Ȱ��..
		 * 	1) 	������ ��ü�� ������ ���� �������� ����ϼ���.
		 * 
		 *     2��     3��     4��       5��       ....     9��
		 *    2*1=2    3*1=3   4*1=4     5*1=5              9*1=9
		 *  
		 */
		
		//1�ܰ�
		for (int test1=5;test1<=20;test1++){
			System.out.println(test1);
		}
		for (int test2=30;test2<=100;test2+=5){
			System.out.print("\n"+test2);
		}
		for (int test3=1000;test3>=900;test3-=2){
			System.out.print("\n"+test3);
		}
		
		//2�ܰ�
		/*
		*int grade= 2;
		*if (grade=2){
		*				System.out.println(grade+"��");
		*					for(int num=1; num<=9;num++){
		*					System.out.println(grade+"*"+num+"="+(grade*num));
		*}
		*};
		**/
		//11
		System.out.println("=============");
		for (grade=2;grade<=9;grade++)
			{System.out.print(grade+"��\t");}
		System.out.println();
		for(int cnt=1;cnt<=9;cnt++){
				for(grade=2;grade<=9;grade++){
					System.out.print(grade+"*"+cnt+"="+(grade*cnt)+"\t");
		}
		//�ٹٲ� ó��
				System.out.println();
		}
			
		
		
		
		
	}

}
